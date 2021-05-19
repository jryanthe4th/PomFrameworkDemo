package com.jmr.facebook;

import com.jmr.driver.DriverUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookLoginPage {

    protected WebDriver driver;

    public FacebookLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateTo(String pageURL) {
        DriverUtility.navigateTo(pageURL);
        new FacebookLoginPage(driver);
    }

    public FacebookLoginPage enterEmail(String email) {
        driver.findElement(By.id("email")).sendKeys(email);
        return this;
    }

    public FacebookLoginPage enterPassword(String password) {
        driver.findElement(By.id("pass")).sendKeys(password);
        return this;
    }

    public void clickLogInButton() {
        driver.findElement(By.name("login")).click();
        new FacebookLoginPage(driver);
    }
}
