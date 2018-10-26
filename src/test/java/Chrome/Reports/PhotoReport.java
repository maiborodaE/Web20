package Chrome.Reports;

import Utils.CreatePA;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.conditions.*;
import Utils.PhotoReportSignIn;
import Utils.PhotoReportSignIn.*;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import static Credentials.UserCredentials.*;
import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class PhotoReport {
    private CreatePA createPA = new CreatePA();
    PhotoReportSignIn photoReportSignIn = new PhotoReportSignIn();
    @Test
    public void createPaGalleryChrome() throws InterruptedException {
        Configuration.holdBrowserOpen = false;
        Configuration.browser = "Chrome";
        clearBrowserCookies();
        open(baseURL, PhotoReportSignIn.class).searchSomePhoto(login,pswrd);
        $("div > div:first-child > div:nth-of-type(2) > button > span").click();
        $(By.className(addPaToPhotoName)).click();
        createPA.createPAgallery();
    }
    @Test
    public void createPaGalleryFF(){
        Configuration.browser = "firefox";
        clearBrowserCookies();
        open(baseURL, PhotoReportSignIn.class).searchSomePhoto(login,pswrd);
        $(By.className(addPaToPhotoName)).click();
        createPA.createPAgallery();
    }
    @Test
    public void createPaGalleryEDGE(){
        Configuration.browser = "EDGE";
        clearBrowserCookies();
        open(baseURL, PhotoReportSignIn.class).searchSomePhoto(login,pswrd);
        $(By.className(addPaToPhotoName)).click();
        createPA.createPAgallery();
    }

    @Test
    public void watchPhotoInfoChrome() {
        Configuration.browser = "Chrome";
        clearBrowserCookies();
        open(baseURL, PhotoReportSignIn.class).searchSomePhoto(login,pswrd);
        $(By.xpath(searchButtonXpath)).click();
        $(By.cssSelector(openPhotoCSS)).click();
        $(By.xpath(openedPhotoXpath)).isDisplayed();
        $(By.xpath(openedPhotoXpath)).isImage();
        $(By.cssSelector(infoPhotoButtonCss)).shouldBe(visible).click();
        photoReportSignIn.photoinfo("Информация","Категория вопроса","Вопрос",
                "Рекомендуемый ответ","Ответ","Комментарий","Торговая точка",
                "Адрес","Сотрудник","Группа пользователей");
    }
    @Test
    public void checkinputs()
    {
        Configuration.browser = "Chrome";
        clearBrowserCookies();
        open(baseURL, PhotoReportSignIn.class).searchSomePhoto(login,pswrd);
        $(By.xpath(last30dayXpath)).click();
        $(By.xpath(EmployeeinputXpath)).sendKeys("Евгений Владимирович");
        $("span > span:nth-of-type(2)").click();
        $(By.xpath(questCategoryinputXpath)).sendKeys("Some quest item 1");
        $("span > span:nth-of-type(2)").click();
        $(By.xpath(channelSaleinputXpath)).sendKeys("Прочие (Non-Retail)");
        $("span > span:nth-of-type(2)").click();
        $(By.xpath(banerinputXpath)).sendKeys("Some Banner");
        $("span > span:nth-of-type(2)").click();
        $(By.xpath(cityinputXpath)).sendKeys("Some city");
        $("span > span:nth-of-type(2)").click();
        $(By.xpath(TTinputXpath)).sendKeys("TradePoint (Some streer address)");
        $("span > span:nth-of-type(2)").click();
        $(By.xpath(groupinputXpath)).sendKeys("AutotestsGroup");
        $("span > span:nth-of-type(2)").click();
        $(By.xpath(searchButtonXpath)).click();

    }
    @After
    public void tearDown() {
        close();
    }


}
