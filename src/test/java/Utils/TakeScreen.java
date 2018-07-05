//package Utils;
//
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.io.File;
//
//
//public class TakeScreen {
//    public static void screen(TakeScreen driver) throws InterruptedException, Exception {
////        WebDriver driver = new ChromeDriver();
//
//        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//    File outDir = new File("./target/screenshots/");
//        outDir.mkdirs();
////        Имя должно работать так:
////    final File outFile = new File(outDir.getPath() + "/" + getClass().getSimpleName() +"." + getClass().getMethod("createManuf").getName() + ".png");
////     Но пока имя так:
//        final File outFile = new File(outDir.getPath() + "/createManuf" + ".png");
//
//        outFile.createNewFile();
//        FileUtils.copyFile(scrFile, outFile);
//
//
//}}
