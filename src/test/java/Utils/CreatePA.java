package Utils;

import org.openqa.selenium.By;

import static Credentials.UserCredentials.createPaXpath;
import static Credentials.UserCredentials.descrPaName;
import static Credentials.UserCredentials.titlePaName;
import static com.codeborne.selenide.Selenide.$;

public class CreatePA {
    public void createPAgallery(){
        $(By.name(titlePaName)).val("Some PA title");
        $(By.name(descrPaName)).val("Some PA description");
        $(By.xpath(createPaXpath)).isDisplayed();
        $(By.xpath("//*[starts-with(@class, \"chip__title\") and text() = 'TradePoint (Some streer address)']")).isDisplayed();
        $(By.xpath("//*[starts-with(@value, 'https://effieteststorage.blob.core.windows.net/photos/')]")).isDisplayed();

    }
}
