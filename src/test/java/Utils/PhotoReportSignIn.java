package Utils;

import com.codeborne.selenide.SelenideElement;

import static Credentials.UserCredentials.photoGalleryMenuCss;
import static Credentials.UserCredentials.reportsMenuCss;
import static com.codeborne.selenide.Selenide.$;

public class PhotoReportSignIn {
    public void signin() {
    $((reportsMenuCss)).click();
    $((photoGalleryMenuCss)).click();

    }
}
