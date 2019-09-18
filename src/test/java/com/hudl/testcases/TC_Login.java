package com.hudl.testcases;
import com.hudl.pagemethods.LoginMethods;
import com.hudl.common.BrowserAction;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class TC_Login {

    @Test
    public void verifyValidLogin() throws InterruptedException {

        //Open chrome browser
        WebDriver driver = BrowserAction.startSelectedBrowser("fireFox");

        LoginMethods loginAction = new LoginMethods(driver);

        //Navigate to login
        loginAction.navigateToLogin();

        //Login with valid credentials
        loginAction.login();

        //sleep
        Thread.sleep(2000);

        //Check that the user is logged in.
        loginAction.checkSuccessfulLogin();

        //Close Browser
         BrowserAction.closeBrowser();

}
}
