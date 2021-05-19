package testbase;

import com.jmr.driver.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestBase {

    public WebDriver driver;

    @BeforeSuite(alwaysRun = true)
    public static void instantiateDriver() {
        DriverFactory.instantiateDriverObject();
    }

    @BeforeClass
    public void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterClass
    public void tearDown() throws Exception {
        if (driver != null)
            driver.quit();
    }

}
