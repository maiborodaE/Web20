package Reports;

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
        open("https://portal-test.effie.ua/anon/login", PhotoReportSignIn.class).searchSomePhoto(login,pswrd);
        $("div > div:first-child > div:nth-of-type(2) > button > span").click();
        $(By.className(addPaToPhotoName)).click();
        createPA.createPAgallery();
    }
    @Test
    public void createPaGalleryFF(){
        Configuration.browser = "firefox";
        clearBrowserCookies();
        open("https://portal-test.effie.ua/anon/login", PhotoReportSignIn.class).searchSomePhoto(login,pswrd);
        $(By.className(addPaToPhotoName)).click();
        createPA.createPAgallery();
    }
    @Test
    public void createPaGalleryEDGE(){
        Configuration.browser = "EDGE";
        clearBrowserCookies();
        open("https://portal-test.effie.ua/anon/login", PhotoReportSignIn.class).searchSomePhoto(login,pswrd);
        $(By.className(addPaToPhotoName)).click();
        createPA.createPAgallery();
    }

    @Test
    public void watchPhotoInfoChrome() throws InterruptedException {
        Configuration.holdBrowserOpen = false;
        Configuration.browser = "Chrome";
        clearBrowserCookies();
        open("https://portal-test.effie.ua/anon/login", PhotoReportSignIn.class).searchSomePhoto(login,pswrd);
        $(By.cssSelector(openPhotoCSS)).click();
        $(By.xpath(openedPhotoXpath)).isDisplayed();
        $(By.xpath(openedPhotoXpath)).isImage();
        $(By.cssSelector(infoPhotoButtonCss)).click();
        photoReportSignIn.photoinfo("Информация","Категория вопроса","Вопрос",
                "Рекомендуемый ответ","Ответ","Комментарий","Торговая точка",
                "Адрес","Сотрудник");
    }
    @After
    public void tearDown() {
        close();
    }


}
