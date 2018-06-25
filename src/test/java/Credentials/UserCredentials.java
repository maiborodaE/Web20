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
public static String photoGalleryMenuCss = "div.parent-list > div:nth-of-type(4) > div:first-child > div > span.left-menu-sub-item > div > div > div";
public static String answersMenuCss = "body > div:nth-of-type(2) > a:nth-of-type(2)";
//    PhotoGallery Links:







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