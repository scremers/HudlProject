package com.hudl.testcases;

import com.hudl.pagemethods.LoginMethods;
import com.hudl.common.BrowserAction;
import com.hudl.common.TestData;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class TC_InvalidLogin {

    @Test
    public static void verifyInvalidLogin() throws InterruptedException {
        //open chrome browser
        WebDriver driver= BrowserAction.startSelectedBrowser("chrome");
        LoginMethods loginAction=new LoginMethods(driver);

        //Navigate to login
        loginAction.navigateToLogin();

        //Login with blank credentials
        loginAction.login(TestData.blankemail, TestData.blankpassword);
        Thread.sleep(2000);
        loginAction.checkLoginErrorMessage();

        //Login with Invalid credentials
        loginAction.login(TestData.email, TestData.invalidpassword);
        Thread.sleep(2000);
        loginAction.checkLoginErrorMessage();

        //close Browser
        BrowserAction.closeBrowser();
    }


}
