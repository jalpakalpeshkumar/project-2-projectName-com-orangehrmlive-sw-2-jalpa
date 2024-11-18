package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

    // Set up the browser
    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    //user Should Login Successfully With Valid Credentials
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //* Enter “Admin” username
        driver.findElement(By.name("username")).sendKeys("Admin");

        //Enter “admin123 password
        driver.findElement(By.name("password")).sendKeys("admin123");

        //Click on the ‘Login’ button
        driver.findElement(By.xpath("//button")).click();

        //Verify the ‘Dashboard’ text is displayed
        String expectedText = "Dashboard";
        String actualText = driver.findElement(By.xpath("//h6")).getText();
        Assert.assertEquals("Dashboard text is not displayed", expectedText, actualText);

    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
