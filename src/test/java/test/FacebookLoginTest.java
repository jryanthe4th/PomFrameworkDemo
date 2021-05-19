package test;

import com.jmr.facebook.FacebookLoginPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import testbase.TestBase;

import static org.testng.Assert.assertEquals;

public class FacebookLoginTest extends TestBase {

    @Test
    public void testFacebookLogin() {

        String email = "test-12345@gmail.com";
        String password = "123123";
        String siteUrl = "https://www.facebook.com";

        driver.get(siteUrl);
        String title = driver.getTitle();
        assertEquals(title, "Facebook - Log In or Sign Up", "title is not expected: " + title + ".");

        FacebookLoginPage facebookLoginPage = new FacebookLoginPage(driver);
        //facebookLoginPage.navigateTo(siteUrl);
        facebookLoginPage
                .enterEmail(email)
                .enterPassword(password)
                .clickLogInButton();

        assertEquals(driver.findElement(By.xpath("//div[text()='The email you entered isn’t connected to an account. ']")).getText(),
                "The email you entered isn’t connected to an account. Find your account and log in.",
                "Expected message was not found.");


        //        FacebookLoginPage facebookLoginPage = FacebookLoginPage.navigateTo(siteUrl);
        //        facebookLoginPage
        //                .enterEmail(email)
        //                .enterPassword(password)
        //                .clickLogInButton();
    }
}
