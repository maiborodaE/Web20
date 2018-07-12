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
    public static String reportsMenuCss = "div > div:nth-of-type(2) > div:nth-of-type(3) > button";
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
public static String photoGalleryMenuCss = "body > div:nth-of-type(2) > a:first-child";
public static String answersMenuCss = "body > div:nth-of-type(2) > a:nth-of-type(2)";
    public static String visitsMenuCss = "body > div:nth-of-type(2) > a:nth-of-type(3)";

//    PhotoGallery Links:
    public static String QHinputXpath = "//*[starts-with(@class, \"input__label\") and text() = 'Анкета']/../input";

    public static String CalendarCSS = "#root > div > div.authorized-layout__root___3dyAW > div.body__root___ec12A > div.body__content___3HFDp > div.body__page___1QEVr > div > div.filters-pane__root___er74L > div > div.date-range__root___1WA1s > div.input__root___3-KTp.input__fullwidth___1vAxA.input__filled___1RxIA.input__withicon___3b_62.input__readOnly___TEuol > div.input__rightSide___xpWwc > input";

    public static String last30dayXpath = "//*[starts-with(@class, \"date-range-dropdown__item\") and text() = 'Последние 30 дней']";
    public static String TTinputXpath = "//*[starts-with(@class, \"filters-pane\")]//*[starts-with(@class, \"input__label\") and text() = 'Торговая точка']/../input";
    public static String EmployeeinputXpath = "//*[starts-with(@class, \"input__label\") and text() = 'Сотрудник']/../input";
    public static String openedPhotoXpath = "//img[@class=\"ril-image-current ril__image\"]";
    public static String openPhotoCSS = "div > div:first-child > div:nth-of-type(2) > div > img.photoReport-card__image___XEezK";
    public static String infoPhotoButtonCss = "ul.ril-toolbar-right.ril__toolbarSide.ril__toolbarRightSide > li:nth-of-type(2) > div > svg > g > path";
    public static String searchButtonCss = "div > div:first-child > div:nth-of-type(2) > button > span";
    public static String pickQhXpath = "//*[starts-with(@class, \"report-query-list__name\") and text() = 'Анкета логика данет с фото']";
    public static String photoInfoClass = "photo-info-panel__root___2il-B";
    public static String[] photoinfoRU = {"Информация","Категория вопроса","Вопрос",
            "Рекомендуемый ответ","Ответ","Комментарий","Торговая точка",
            "Адрес","Сотрудник"};


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