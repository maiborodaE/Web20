package u0LoginTests;

import Utils.EffieLoginPage;
import com.codeborne.selenide.Configuration;
import org.junit.Test;

import static Credentials.UserCredentials.*;
import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.*;

public class LoginTests {
    @Test
    public void chrome(){
        Configuration.holdBrowserOpen = false;
        Configuration.browser = "Chrome";
        clearBrowserCookies();
        open(baseURL, EffieLoginPage.class).logincred(login,pswrd);
        $$(".profile-dropdown__body___11jfV div").shouldHave(size(5));
        $(".profile-dropdown__name___1glZw").shouldHave(exactText("Тестовый БА ipland (ilch)"));
        $(".profile-dropdown__company___nPdNd").shouldHave(exactText("Ipland"));
        close();
    }
    @Test
    public void firefox() {
        Configuration.browser = "firefox";
        clearBrowserCookies();
        open("https://portal-test.effie.ua/anon/login", EffieLoginPage.class).logincred(login,pswrd);
        $$(".profile-dropdown__body___11jfV div").shouldHave(size(5));
        $(".profile-dropdown__name___1glZw").shouldHave(exactText("Тестовый БА ipland (ilch)"));
        $(".profile-dropdown__company___nPdNd").shouldHave(exactText("Ipland"));
        close();
    }
    @Test
    public void EDGE(){
            Configuration.browser = "EDGE";
            clearBrowserCookies();
        open(baseURL    , EffieLoginPage.class).logincred(login,pswrd);
            $$(".profile-dropdown__body___11jfV div").shouldHave(size(5));
            $(".profile-dropdown__name___1glZw").shouldHave(exactText("Тестовый БА ipland (ilch)"));
            $(".profile-dropdown__company___nPdNd").shouldHave(exactText("Ipland"));
            close();
        }
    }

