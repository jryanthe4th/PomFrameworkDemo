package com.jmr.facebook;

import com.jmr.driver.DriverFactory;
import org.openqa.selenium.WebDriver;

public abstract class WebPage {

    public WebDriver driver;

    public WebPage(String pageClassName) {
        this.driver = DriverFactory.getDriver();
    }
}
