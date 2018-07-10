package Reports;

import Utils.EffieLoginPage;
import Utils.PhotoReportSignIn;
import Utils.PhotoReportSignIn.*;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.Test;
import org.openqa.selenium.By;

import static Credentials.UserCredentials.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class PhotoReport {
    private PhotoReportSignIn photoReportSignIn = new PhotoReportSignIn();

    @Test
    public void photosearchChrome(){
        Configuration.holdBrowserOpen = false;
        Configuration.browser = "Chrome";
        clearBrowserCookies();
        open("https://portal-test.effie.ua/anon/login", EffieLoginPage.class).logincred(login,pswrd);
        photoReportSignIn.signin();
//        $(reportsMenuCss).click();
//        $(photoGalleryMenuCss).click();
        $(By.xpath(QHinputXpath)).val("Анкета логика данет с фото");
        $(CalendarCSS).isDisplayed();
        $(".report-query-list__name___zujwN").click();
        $(".span.button__text___3fm4H").isDisplayed();
        close();
    }
    @Test
    public void photosearchFirefox(){
//        Configuration.holdBrowserOpen = true;
        Configuration.browser = "firefox";
        clearBrowserCookies();
        open("https://portal-test.effie.ua/anon/login", EffieLoginPage.class).logincred(login,pswrd);
        photoReportSignIn.signin();
//        $(reportsMenuCss).click();
//        $(photoGalleryMenuCss).click();
        $(By.xpath(QHinputXpath)).val("Анкета логика данет с фото");
        $(CalendarCSS).isDisplayed();
        $(".report-query-list__name___zujwN").click();
        $(".span.button__text___3fm4H").isDisplayed();
        close();
    }
    @Test
    public void photosearchEDGE(){
//        Configuration.holdBrowserOpen = true;
        Configuration.browser = "EDGE";
        clearBrowserCookies();
        open("https://portal-test.effie.ua/anon/login", EffieLoginPage.class).logincred(login,pswrd);
        photoReportSignIn.signin();
//        $(reportsMenuCss).click();
//        $(photoGalleryMenuCss).click();
        $(By.xpath(QHinputXpath)).val("Анкета логика данет с фото");
        $(CalendarCSS).isDisplayed();
        $(".report-query-list__name___zujwN").click();
        $(".span.button__text___3fm4H").isDisplayed();
        close();
    }


}
