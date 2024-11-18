package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class ForgotPasswordTest  extends BaseTest {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

    // Set up the browser
    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    //User should navigate to forgot password page successfully
    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        //click on the ‘Forgot your password’ link
        driver.findElement(By.xpath("//div[@class='orangehrm-login-forgot']/p")).click();

        //Verify the text ‘Reset Password’
        String expectedText = "Reset Password";
        String actualText = driver.findElement(By.xpath("//h6")).getText();
        Assert.assertEquals("Reset Password text is not display",expectedText, actualText);

        //click on the ‘Cancel’ button
        driver.findElement(By.xpath("//div[@id='app']//form/div[2]/button[1]")).click();

        //Verify the text ‘Login’
        String expectedLoginText = "Login";
        String actualLoginText = driver.findElement(By.xpath("//h5")).getText();
        Assert.assertEquals("Login text is not displayed",  expectedLoginText, actualLoginText);

    }

    //Close the browser
    @After
    public void tearDown() {
        closeBrowser();
    }
}
