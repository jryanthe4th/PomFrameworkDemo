package com.jmr.driver;

import org.openqa.selenium.WebDriver;

public class DriverUtility {

    public static void navigateTo(String pageURL) {
        WebDriver driver = DriverFactory.getDriver();
        driver.get(pageURL);
    }
}
