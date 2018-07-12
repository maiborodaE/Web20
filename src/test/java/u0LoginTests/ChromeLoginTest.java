//package u0LoginTests;
//
//import net.bytebuddy.implementation.bytecode.Throw;
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.io.File;
//import java.util.concurrent.TimeUnit;
//
//import static Credentials.UserCredentials.*;
//
//public class ChromeLoginTest {
////    private static String randomName = UserCredentials.randomName;
//
//
//    public void createManuf() throws InterruptedException, Exception {
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\maiboroda.e\\Downloads\\chromedriver_win32\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//
//        try {
//            driver.get(baseURL);
//            driver.manage().window().maximize();
//            driver.findElement(By.name(loginInputName)).sendKeys(login);
//            driver.findElement(By.name(pswrdInputName)).sendKeys(pswrd);
//
//
//
//        driver.findElement(By.cssSelector(loginButtonCss)).click();
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//*[@id=\"root\"]/div//div[contains(text(),'" + "Тестовый БА ipland (ilch)" + "')]"));
//
//        } catch(Throwable e){
//        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//        File outDir = new File("./target/screenshots/");
//        outDir.mkdirs();
////        Имя должно работать так:
//        final File outFile = new File(outDir.getPath() + "/" + getClass().getSimpleName() + "." + getClass().getMethod("createManuf").getName() + ".png");
//        outFile.createNewFile();
//        FileUtils.copyFile(scrFile, outFile);
//    }
//        driver.close();
//        driver.quit();
//    }
//}
