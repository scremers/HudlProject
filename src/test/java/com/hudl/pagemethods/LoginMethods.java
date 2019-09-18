package com.hudl.pagemethods;

import com.hudl.common.TestData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.hudl.pageelements.LoginPage;
import org.testng.Assert;

/*This class contain all Login methods for Login Page*/

public class LoginMethods {
    public static WebDriver driver;

    /*This constructor initializes the Webdriver*/
    public LoginMethods(WebDriver driver) {
        this.driver=driver;
    }

    public void navigateToLogin() {
        LoginPage.nav_Login(driver).click();
    }

    public void login() {
        LoginPage.txtbox_Email(driver).sendKeys(TestData.email);
        LoginPage.txtbox_Password(driver).sendKeys(TestData.password);
        clickOnBtnLogin();
    }

    public void login(String email, String password) {
        LoginPage.txtbox_Email(driver).sendKeys(email);
        LoginPage.txtbox_Password(driver).sendKeys(password);
        clickOnBtnLogin();
    }

    public void clickOnBtnLogin() {
        LoginPage.btn_Login(driver).click();
    }

    public void checkLoginErrorMessage() {
        //check that error message is displayed for invalid credentials
        String actualError= driver.findElement(By.className("login-error-container")).getText();
        Assert.assertTrue(actualError.contains("We didn't recognize"));
    }

    public void checkSuccessfulLogin() {
        if (!driver.getCurrentUrl().equals("https://www.hudl.com/home")) {
            System.out.println("Login is not successful");
        }
    }
}
