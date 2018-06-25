package u0LoginTests;

import Credentials.UserCredentials;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static Credentials.UserCredentials.*;

public class ChromeLoginTest {
//    private static String randomName = UserCredentials.randomName;


    public void createManuf() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\maiboroda.e\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get(UserCredentials.baseURL);
        driver.manage().window().maximize();

        driver.findElement(By.name(loginInputName)).sendKeys(login);
        driver.findElement(By.name(pswrdInputName)).sendKeys(pswrd);
        driver.findElement(By.cssSelector(loginButtonCss)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div//div[contains(text(),'" + "Тестовый БА ipland (ilch)" + "')]"));
        driver.close();
        driver.quit();
    }
}
