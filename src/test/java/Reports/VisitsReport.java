package Reports;
import Credentials.UserCredentials;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

import static Credentials.UserCredentials.*;

public class VisitsReport {
    public void findVisit() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\maiboroda.e\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String randomName = UserCredentials.randomName;
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get(UserCredentials.baseURL);
        driver.manage().window().maximize();

        driver.findElement(By.name(loginInputName)).sendKeys(login);
        driver.findElement(By.name(pswrdInputName)).sendKeys(pswrd);
        driver.findElement(By.cssSelector(loginButtonCss)).click();
        Thread.sleep(3000);

        driver.findElement(By.cssSelector(reportsMenuCss)).click();
        driver.findElement(By.cssSelector(visitsMenuCss)).click();
        Thread.sleep(1000);
        driver.findElement((By.cssSelector(EmployeeinputCSS))).sendKeys("Евгений Владимирович");
        driver.findElement((By.cssSelector(CalendarCSS))).isDisplayed();
//        Нажать на анкету и начать поиск
        driver.findElement((By.cssSelector("div > button:nth-of-type(2) > div > div.report-query-list__name___zujwN"))).click();


//       Проверка грида
        driver.findElement((By.id("grid:visits"))).isDisplayed();
        driver.findElement((By.className("grid-menu__icon___188J6"))).click();
        driver.findElement((By.xpath("//*[@id=\"grid:visits\"]/div[2]/div/div"))).isDisplayed();



//        Thread.sleep(2000);
//тут может понадобится ожидание готовности элементов выпадающего списка

        driver.close();
        driver.quit();


    }
}