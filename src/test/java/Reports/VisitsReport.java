package Reports;
import Utils.EffieLoginPage;
import com.codeborne.selenide.Configuration;
import org.junit.Test;
import org.openqa.selenium.By;

import static Credentials.UserCredentials.*;
import static com.codeborne.selenide.Selenide.*;

public class VisitsReport {
    @Test
    public void findVisitChrome() throws InterruptedException {
        Configuration.browser = "Chrome";
        clearBrowserCookies();
        open("https://portal-test.effie.ua/anon/login", EffieLoginPage.class).logincred(login,pswrd);
        $(By.cssSelector(reportsMenuCss)).click();
        $(By.cssSelector(visitsMenuCss)).click();
        Thread.sleep(1000);
        $((By.xpath(EmployeeinputXpath))).sendKeys("Евгений Владимирович");
        $((By.cssSelector(CalendarCSS))).isDisplayed();
//        Нажать на анкету и начать поиск
        $((By.cssSelector("div > button:nth-of-type(2) > div > div.report-query-list__name___zujwN"))).click();
//       Проверка грида
        $((By.id("grid:visits"))).isDisplayed();
        $((By.className("grid-menu__icon___188J6"))).click();
        $((By.xpath("//*[@id=\"grid:visits\"]/div[2]/div/div"))).isDisplayed();
        close();
    }
    @Test
    public void findVisitFF() throws InterruptedException {
        Configuration.browser = "firefox";
        clearBrowserCookies();
        open("https://portal-test.effie.ua/anon/login", EffieLoginPage.class).logincred(login,pswrd);
        $(By.cssSelector(reportsMenuCss)).click();
        $(By.cssSelector(visitsMenuCss)).click();
        Thread.sleep(1000);
        $((By.xpath(EmployeeinputXpath))).sendKeys("Евгений Владимирович");
        $((By.cssSelector(CalendarCSS))).isDisplayed();
//        Нажать на анкету и начать поиск
        $((By.cssSelector("div > button:nth-of-type(2) > div > div.report-query-list__name___zujwN"))).click();
//       Проверка грида
        $((By.id("grid:visits"))).isDisplayed();
        $((By.className("grid-menu__icon___188J6"))).click();
        $((By.xpath("//*[@id=\"grid:visits\"]/div[2]/div/div"))).isDisplayed();
        close();
    }
    @Test
    public void findVisitEDGE() throws InterruptedException {
        Configuration.browser = "EDGE";
        clearBrowserCookies();
        open("https://portal-test.effie.ua/anon/login", EffieLoginPage.class).logincred(login,pswrd);
        $(By.cssSelector(reportsMenuCss)).click();
        $(By.cssSelector(visitsMenuCss)).click();
        Thread.sleep(1000);
        $((By.xpath(EmployeeinputXpath))).sendKeys("Евгений Владимирович");
        $((By.cssSelector(CalendarCSS))).isDisplayed();
//        Нажать на анкету и начать поиск
        $((By.cssSelector("div > button:nth-of-type(2) > div > div.report-query-list__name___zujwN"))).click();
//       Проверка грида
        $((By.id("grid:visits"))).isDisplayed();
        $((By.className("grid-menu__icon___188J6"))).click();
        $((By.xpath("//*[@id=\"grid:visits\"]/div[2]/div/div"))).isDisplayed();
        close();

    }
}