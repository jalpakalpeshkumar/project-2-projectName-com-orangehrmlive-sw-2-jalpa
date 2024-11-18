package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * Create the package ‘browserfactory’ and create the
 * class with the name ‘BaseTest’ inside the
 * ‘browserfactory’ package. And write the browser setup
 * code inside the class ‘Base Test’.
 * 2. Create the package ‘testsuite’ and create the
 * following classes inside the ‘testsuite’ package.
 * 1. LoginTest
 * 2. ForgotPasswordTest
 * 3. Write down the following test in the ‘LoginTest’ class
 * 1. userSholdLoginSuccessfullyWithValidCredentials()
 * * Enter “Admin” username
 * * Enter “admin123 password
 * * Click on the ‘Login’ button
 * * Verify the ‘Dashboard’ text is displayed
 * 4. Write down the following test in the
 * ‘ForgotPasswordTest’ class
 * 1. userShouldNavigateToForgotPasswordPage
 * Successfully()
 * * click on the ‘Forgot your password’ link
 * * Verify the text ‘Reset Password’
 * * click on the ‘Cancel’ button
 * * Verify the text ‘Login’
 */

public class BaseTest {

    public static WebDriver driver;

    //open the browser
    public void openBrowser(String baseUrl) {
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    //close the browser
    public void closeBrowser() {
        driver.quit();
    }
}
