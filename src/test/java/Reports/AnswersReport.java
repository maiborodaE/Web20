package Reports;

import Credentials.UserCredentials;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

import static Credentials.UserCredentials.*;

public class AnswersReport {

    public void findAnswers() throws InterruptedException {
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
        Thread.sleep(1000);
        driver.findElement((By.cssSelector(answersMenuCss))).click();
        driver.findElement((By.cssSelector("div > div:first-child > div:first-child > div.input__right-side___cOpcX > input"))).sendKeys("Анкета после релиза");
        driver.findElement((By.cssSelector("div > div:first-child > div:nth-of-type(2) > div:nth-of-type(2) > div:first-child > div > div:nth-of-type(2) > div > button > div"))).click();
//        driver.findElement((By.cssSelector("div > div:nth-of-type(12) > span > div > div > div")));
        Actions act = new Actions(driver);
        Thread.sleep(2000);
//тут может понадобится ожидание готовности элементов выпадающего списка

        driver.close();
        driver.quit();
    }}