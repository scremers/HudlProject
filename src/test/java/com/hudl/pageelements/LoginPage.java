package com.hudl.pageelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*This class stores all the element locators of Login page*/

public class LoginPage {
    private static WebElement element=null;

    public static WebElement nav_Login (WebDriver driver) {
        element= driver.findElement(By.className("login"));
        return element;
    }
    public static WebElement txtbox_Email(WebDriver driver) {
        element= driver.findElement(By.id("email"));
        return element;
    }
    public static WebElement txtbox_Password(WebDriver driver) {
        element= driver.findElement(By.id("password"));
        return element;
    }
    public static WebElement btn_Login (WebDriver driver) {
        element= driver.findElement(By.id("logIn"));
        return element;
    }

    public static WebElement page_Home (WebDriver driver) {
        element= driver.findElement(By.id("webnav-globalnav-home"));
        return element;
    }

    public static WebElement btn_Logout (WebDriver driver) {
        element= driver.findElement(By.id("webnav-usermenu-logout"));
        return element;
    }



}


