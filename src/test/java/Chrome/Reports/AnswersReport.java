package Chrome.Reports;

import Utils.EffieLoginPage;
import com.codeborne.selenide.Configuration;
import org.junit.Test;
import org.openqa.selenium.By;

import static Credentials.UserCredentials.*;
import static com.codeborne.selenide.Selenide.*;

public class AnswersReport {


    @Test
    public void findAnswersCHrome() throws InterruptedException {
        Configuration.startMaximized = true;
        Configuration.browser = "Chrome";
        clearBrowserCookies();
        open(baseURL, EffieLoginPage.class).logincred(login,pswrd);
        $(By.cssSelector(reportsMenuCss)).click();
        Thread.sleep(1000);
//        $(((answersMenuCss))).click();
        $(By.xpath((QHinputXpath))).click();
        $(By.xpath((QHinputXpath))).val("Анкета после релиза");
        $(By.xpath((TTinputXpath))).val("Автосервис на  краснова (Киев краснова 29)");
//        $((By.xpath("//*[@class=\"dropdown-list__name___Ssqyk\"]//span[contains(text(),'Автосервис на  Краснова (Киев Краснова 29)')]"))).click();
        $(((CalendarCSS))).isDisplayed();
        //        Нажать на анкету и начать поиск
        $((By.cssSelector("div > div:first-child > div > button > div"))).click();
//       Проверка грида
        $((By.id("grid:answers"))).isDisplayed();
        $((By.className("grid-menu__icon___188J6"))).click();
        $((By.xpath("//*[@id=\"grid:answers\"]/div[2]/div/div"))).isDisplayed();
close();
    }
    @Test
    public void findAnswersFF() throws InterruptedException {
        Configuration.browser = "firefox";
        clearBrowserCookies();
        open(baseURL, EffieLoginPage.class).logincred(login,pswrd);
        $(By.xpath(reportsMenuCss)).click();
        Thread.sleep(1000);
        $(((answersMenuCss))).click();
        $(By.xpath((QHinputXpath))).val("Анкета после релиза");
        $(By.xpath((TTinputXpath))).val("Автосервис на  краснова (Киев краснова 29)");
        $(((CalendarCSS))).isDisplayed();
        $((By.xpath("//*[@class=\"dropdown-list__name___Ssqyk\"]//span[contains(text(),'Автосервис на  Краснова (Киев Краснова 29)')]"))).click();
//        Нажать на анкету и начать поиск
        $((By.cssSelector("div > div:first-child > div:nth-of-type(2) > div:nth-of-type(2) > div:first-child > div > div:nth-of-type(2) > div > button > div"))).click();
//       Проверка грида
        $((By.id("grid:answers"))).isDisplayed();
        $((By.className("grid-menu__icon___188J6"))).click();
        $((By.xpath("//*[@id=\"grid:answers\"]/div[2]/div/div"))).isDisplayed();
        close();
    }
    @Test
    public void findAnswersEDGE() throws InterruptedException {
        Configuration.browser = "EDGE";
        clearBrowserCookies();
        open(baseURL, EffieLoginPage.class).logincred(login,pswrd);
        $(By.cssSelector(reportsMenuCss)).click();
        Thread.sleep(1000);
        $(((answersMenuCss))).click();
        $(By.xpath((QHinputXpath))).val("Анкета после релиза");
        $(By.xpath((TTinputXpath))).val("Автосервис на  краснова (Киев краснова 29)");
        $(((CalendarCSS))).isDisplayed();
        $((By.xpath("//*[@class=\"dropdown-list__name___Ssqyk\"]//span[contains(text(),'Автосервис на  Краснова (Киев Краснова 29)')]"))).click();
//        Нажать на анкету и начать поиск
        $((By.cssSelector("div > div:first-child > div:nth-of-type(2) > div:nth-of-type(2) > div:first-child > div > div:nth-of-type(2) > div > button > div"))).click();
//       Проверка грида
        $((By.id("grid:answers"))).isDisplayed();
        $((By.className("grid-menu__icon___188J6"))).click();
        $((By.xpath("//*[@id=\"grid:answers\"]/div[2]/div/div"))).isDisplayed();
        close();
    }
}