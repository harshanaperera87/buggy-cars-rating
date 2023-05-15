package buggyCarsAutomation.test;

import buggyCarsAutomation.action.LoginActions;
import buggyCarsAutomation.page.ProfilePage;
import buggyCarsAutomation.util.DriverUtil;
import buggyCarsAutomation.util.LoginUtil;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.io.IOException;

public class LoginValidationTest {

    WebDriver driver = null;

    @BeforeClass
    //Open the web browser
    public void openDriver() throws IOException, InterruptedException {
        driver = DriverUtil.getChromeDriver();
    }

    @Test(priority = 1, description = "Validate all the objects of the Login function")
    public void validateLoginObjects() throws IOException, InterruptedException {
        LoginActions.isDisplayedLoginObjects(driver);
    }

    @Test(priority = 2, description = "Login to the Buggy Rating application")
    public void login() throws IOException, InterruptedException {
        LoginUtil.login(driver);
        Thread.sleep(500);
    }

    @Test(priority = 3, description = "Verify login")
    public void validateLoggedIn() throws IOException, InterruptedException {
        LoginActions.isLoggedIn(driver);
        Thread.sleep(500);
    }

    @AfterClass
    public void logout() throws IOException, InterruptedException {
        ProfilePage.logoutLnk(driver).click();
        DriverUtil.quitChromeDriver();
    }
 }
