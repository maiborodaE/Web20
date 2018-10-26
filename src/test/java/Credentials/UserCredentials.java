package Credentials;

import lombok.Getter;
import lombok.Setter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Setter
@Getter
public class UserCredentials {

//    Login to u0 TEST:
    public static String baseURL = "https://portal-test.effie.ua/login";
//    public static String baseURL = "https://portal.effie.ua/login";
    public static String loginInputName = "email";
    public static String pswrdInputName = "password";
    public static String login = "u0ba2@mail.ru";
    public static String pswrd = "testPass";
    public static String loginButtonCss = "form > button";



    //   Site-menu links:
//    public static String reportsMenuCss = "div > div:nth-of-type(2) > div:nth-of-type(3) > button";
//    public static String reportsMenuCss = "//div[starts-with(@class, \"left-menu__list\")]/div[3]//div[starts-with(@class, \"item__leftIcon\")]/*";
    public static String reportsMenuCss ="div > div:nth-of-type(2) > div:nth-of-type(3) > button > div:first-child > svg";



    public static String activityMenu = "div.left-menu-main > div:nth-of-type(5)";
    public static String constrAnketMenu = ".parent-list > div:nth-of-type(2)";
    public static String directoriesMenu = "i.fa.fa-archive";
    public static String manufMenu = ".parent-list > div:nth-of-type(11)";

    //   Quest-menu links:
    public static String createQHbutton = "div.quest-wrapp > div.paper-header > div.wrap > div.buttons > div:nth-of-type(3) > button > div > span";
    public static String saveQHbutton = "div.button-wrap > button:first-child > div > span";
    public static String deleteQHbutton = "div.buttons > div:first-child > button > div > span";
//    Quest-property links:
    public static String nameQI = "name";
    public static String productCat = "category";
    public static String productBrand = "brand";
    public static String answerRecommend = "answerRecommend";
    public static String Photo = "photoReport";

    //    Manufacturees links:
    public static String createManufbutton = "div.btn-wrap > button > div > svg";
    public static String nameManufField = "[name=\"name\"]";
    public static String saveManufButton = "div.button-wrap > button:first-child > div > span";

//    Reports links:
public static String photoGalleryMenuCss = "body > div:nth-of-type(3) > a:nth-of-type(2) > div";
//public static String answersMenuCss = "body > div:nth-of-type(2) > a:nth-of-type(2)";
    public static String answersMenuCss = "body > div.item__absoluteList___1xYsu > a:nth-child(1) > div";


    public static String visitsMenuCss = "body > div:nth-of-type(2) > a:nth-of-type(3)";

//    PhotoGallery Links:
//    public static String QHinputXpath = "//*[starts-with(@class, \"input__label\") and text() = 'Анкета']/../input";
public static String openedPhotoXpath = "//img[@class=\"ril-image-current ril__image\"]";
    public static String openPhotoCSS = "img";
    public static String infoPhotoButtonCss = "div.ReactModalPortal > div > div > div > div.ril-toolbar.ril__toolbar > ul.ril-toolbar-right.ril__toolbarSide.ril__toolbarRightSide > li:nth-child(2) > div > svg";
    public static String searchButtonXpath = "//*[starts-with(@class, \"button_text\") and text() = 'Применить']";
    public static String pickQhXpath = "//*[starts-with(@class, \"report-query-list_name\") and text() = 'Анкета логика данет с фото']";
    public static String photoInfoXpath = "//*[starts-with(@class, \"photo-info-panel_root\")]";
    public static String[] photoinfoRU = {"Информация","Категория вопроса","Вопрос",
            "Рекомендуемый ответ","Ответ","Комментарий","Торговая точка",
            "Адрес","Сотрудник"};



    //    FILTERS
    public static String QHinputXpath = "//*[starts-with(@class, \"input_label\") and text() = 'Анкета']/../input";
    public static String CalendarCSS = "div.date-range_fullwidth__ZfxR_ > div:first-child > div:nth-of-type(2) > input";
    public static String datePickerCss = "body > div:nth-of-type(3) > div > div > button > svg > path:first-child";
    public static String last30dayXpath = "//*[starts-with(@class, \"date-range-dropdown_item\") and text() = 'Последние 30 дней']";
    public static String EmployeeinputXpath = "//*[starts-with(@class, \"input_label\") and text() = 'Сотрудник']/../input";
    public static String questCategoryinputXpath = "//*[starts-with(@class, \"input_label\") and text() = 'Категория вопроса']/../input";
    public static String channelSaleinputXpath = "//*[starts-with(@class, \"input_label\") and text() = 'Канал продаж']/../input";
    public static String banerinputXpath = "//*[starts-with(@class, \"input_label\") and text() = 'Торговая сеть']/../input";
    public static String cityinputXpath = "//*[starts-with(@class, \"input_label\") and text() = 'Город']/../input";
    public static String TTinputXpath = "//*[starts-with(@class, \"filters-pane\")]//*[starts-with(@class, \"input_label\") and text() = 'Торговая точка']/../input";
    public static String groupinputXpath = "//*[starts-with(@class, \"input_label\") and text() = 'Группа пользователей']/../input";





    //    Personal Assig:
    public static String addPaToPhotoName = "photoReport-card__assignmentButton___TtuIT";
public static String titlePaName = "assignmentTitle";
    public static String descrPaName = "assignmentDescription";
    public static String createPaXpath = "//*[starts-with(@class, \"button__text\") and text() = 'Создать']";


//AnswerMenu links:

    public String getCookies() {
        return cookies;
    }

    public void setCookies(String cookies) {
        this.cookies = cookies;
    }

    public static String cookies = "SESSION=3d9482b4-3f6b-4a29-88d3-497b3675d887";

    public static String serverName = "nginx";

    public static Date date = new Date();
    public static DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");

    public static String randomName = dateFormat.format(date);

//
//    public String getRandomName() {
//        return randomName;
//    }
//
//    public void setRandomName(String randomName) {
//        this.randomName = randomName;
//    }
//
//    public void setLogin(String login) {
//        this.login = login;
//    }
//
//    public void setPswrd(String pswrd) {
//        this.pswrd = pswrd;
//    }





}