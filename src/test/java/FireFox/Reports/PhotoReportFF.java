package FireFox.Reports;

import Utils.CreatePA;
import Utils.PhotoReportSignIn;
import com.codeborne.selenide.Configuration;
import org.junit.Test;
import org.openqa.selenium.By;

import static Credentials.UserCredentials.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.clearBrowserCookies;
import static com.codeborne.selenide.Selenide.open;

public class PhotoReportFF {
    private CreatePA createPA = new CreatePA();
    PhotoReportSignIn photoReportSignIn = new PhotoReportSignIn();
    @Test
    public void createPaGalleryFF(){
        Configuration.browser = "firefox";
        clearBrowserCookies();
        open(baseURL, PhotoReportSignIn.class).searchSomePhoto(login,pswrd);
        $(By.className(addPaToPhotoName)).click();
        createPA.createPAgallery();
    }
    }