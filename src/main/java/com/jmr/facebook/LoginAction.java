package com.jmr.facebook;

import org.openqa.selenium.WebDriver;

public class LoginAction {

    WebDriver driver;

    public LoginAction(WebDriver driver) { }

    public void login(final String username, final String password) {

        LoginPage.getUserName(driver).sendKeys(username);
        LoginPage.getPassword(driver).sendKeys(password);
        LoginPage.getLoginButton(driver).click();
    }
}
