package Utils;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static Credentials.UserCredentials.*;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class PhotoReportSignIn {
    public void searchSomePhoto(String name, String parol) {
        $(By.name(loginInputName)).val(name);
        $(By.name(pswrdInputName)).val(parol).pressEnter();
        $((reportsMenuCss)).click();
        $((photoGalleryMenuCss)).click();
        $(By.xpath(QHinputXpath)).val("Анкета логика данет с фото");
        $(By.xpath(pickQhXpath)).click();
        $(CalendarCSS).click();
        $(By.xpath(last30dayXpath)).click();
        $(By.cssSelector(searchButtonCss)).click();
    }

    public void photoinfo(String info, String questcat, String questname, String recanswer, String answer,
                          String comment,String tradepoint,String addres,String employName) {
        $(By.className(photoInfoClass)).shouldHave(text(info));
        $(By.className(photoInfoClass)).shouldBe(text(questcat));
        $(By.className(photoInfoClass)).shouldBe(text(questname));
        $(By.className(photoInfoClass)).shouldBe(text(recanswer));
        $(By.className(photoInfoClass)).shouldBe(text(answer));
        $(By.className(photoInfoClass)).shouldBe(text(comment));
        $(By.className(photoInfoClass)).shouldBe(text(tradepoint));
        $(By.className(photoInfoClass)).shouldBe(text(addres));
        $(By.className(photoInfoClass)).shouldBe(text(employName));
        //        $(By.className(photoInfoClass)).shouldHave(text("Информация"));
//        $(By.className(photoInfoClass)).shouldBe(text("Категория вопроса:"));
//        $(By.className(photoInfoClass)).shouldBe(text("Вопрос:"));
//        $(By.className(photoInfoClass)).shouldBe(text("Рекомендуемый ответ:"));
//        $(By.className(photoInfoClass)).shouldBe(text("Ответ:"));
//        $(By.className(photoInfoClass)).shouldBe(text("Комментарий"));
//        $(By.className(photoInfoClass)).shouldBe(text("Торговая точка:"));
//        $(By.className(photoInfoClass)).shouldBe(text("Адрес:"));
//        $(By.className(photoInfoClass)).shouldBe(text("Сотрудник:"));



    }




    }
