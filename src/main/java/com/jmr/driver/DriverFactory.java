package com.jmr.driver;

import org.openqa.selenium.WebDriver;

public class DriverFactory {

    private static ThreadLocal<WebDriverThread> driverThread;

    public static WebDriver getDriver() { return driverThread.get().getDriver(); }
    public static void quiteDriver() { driverThread.get().quitDriver(); }

    public static void instantiateDriverObject() {
        new WebDriverThread();
    }
}
