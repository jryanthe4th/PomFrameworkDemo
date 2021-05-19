package com.jmr.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;

public class WebDriverThread {

    private WebDriver driver;

    public WebDriver getDriver() {
        try {
            instantiateWebDriver();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e.getMessage());
        }
        return driver;
    }

    public void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    private void instantiateWebDriver() throws MalformedURLException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
}
