package com.hudl.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/*This class performs all browser Actions*/

public class BrowserAction {
    static WebDriver driver;
    public static WebDriver startSelectedBrowser(String browserName) {
        if (browserName.equalsIgnoreCase("fireFox"))
        {
            driver=new FirefoxDriver();
        }
        else if(browserName.equalsIgnoreCase("chrome"))
        {
            driver=new ChromeDriver();
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        }

        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.get("http://www.hudl.com");
        return driver;
    }

    public static WebDriver closeBrowser() {
            if (!driver.toString().contains("null")) {
                driver.close();
            }
        return driver;
    }

}
