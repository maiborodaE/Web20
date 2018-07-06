package Utils;

import org.openqa.selenium.By;

import static Credentials.UserCredentials.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class EffieLogin {
    public  SearchResultsPage logincred(String name, String parol) {
        $(By.name(loginInputName)).val(name);
        $(By.name(pswrdInputName)).val(parol).pressEnter();
        return page(SearchResultsPage.class);
    }

}