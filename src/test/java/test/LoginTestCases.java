package test;

import com.jmr.facebook.LoginAction;
import org.testng.annotations.Test;
import testbase.TestBase;

public class LoginTestCases extends TestBase {

    @Test
    public void testLogin() {

        driver.get("https://facebook.com");
        driver.getTitle();

        LoginAction loginAction = new LoginAction(driver);
        loginAction.login("testuser@gmail.com", "testpassword");

    }
}
