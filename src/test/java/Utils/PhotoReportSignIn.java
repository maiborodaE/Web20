package Utils;

import org.openqa.selenium.By;

import static Credentials.UserCredentials.*;
import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class PhotoReportSignIn {
    public void searchSomePhoto(String name, String parol) {
        $(By.name(loginInputName)).val(name);
        $(By.name(pswrdInputName)).val(parol).pressEnter();
        $((reportsMenuCss)).shouldBe(visible).shouldBe(exist).isDisplayed();
        $((reportsMenuCss)).click();
        $((photoGalleryMenuCss)).click();
        $(By.xpath(QHinputXpath)).val("Анкета логика данет с фото");
        $(By.xpath(pickQhXpath)).click();
        $(CalendarCSS).click();
        $(datePickerCss).click();
        $(By.xpath(last30dayXpath)).click();

    }

    public void photoinfo(String info, String questcat, String questname, String recanswer, String answer,
                          String comment,String tradepoint,String addres,String employName, String group) {
        $(By.xpath(photoInfoXpath)).shouldHave(text(info));
        $(By.xpath(photoInfoXpath)).shouldBe(text(questcat));
        $(By.xpath(photoInfoXpath)).shouldBe(text(questname));
        $(By.xpath(photoInfoXpath)).shouldBe(text(recanswer));
        $(By.xpath(photoInfoXpath)).shouldBe(text(answer));
        $(By.xpath(photoInfoXpath)).shouldBe(text(comment));
        $(By.xpath(photoInfoXpath)).shouldBe(text(tradepoint));
        $(By.xpath(photoInfoXpath)).shouldBe(text(addres));
        $(By.xpath(photoInfoXpath)).shouldBe(text(employName));
        $(By.xpath(photoInfoXpath)).shouldBe(text(group));

        //        $(By.className(photoInfoXpath)).shouldHave(text("Информация"));
//        $(By.className(photoInfoXpath)).shouldBe(text("Категория вопроса:"));
//        $(By.className(photoInfoXpath)).shouldBe(text("Вопрос:"));
//        $(By.className(photoInfoXpath)).shouldBe(text("Рекомендуемый ответ:"));
//        $(By.className(photoInfoXpath)).shouldBe(text("Ответ:"));
//        $(By.className(photoInfoXpath)).shouldBe(text("Комментарий"));
//        $(By.className(photoInfoXpath)).shouldBe(text("Торговая точка:"));
//        $(By.className(photoInfoXpath)).shouldBe(text("Адрес:"));
//        $(By.className(photoInfoXpath)).shouldBe(text("Сотрудник:"));



    }




    }
