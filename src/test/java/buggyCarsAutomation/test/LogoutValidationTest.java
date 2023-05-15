package buggyCarsAutomation.test;

import buggyCarsAutomation.action.LogoutActions;
import buggyCarsAutomation.util.DriverUtil;
import buggyCarsAutomation.util.LoginUtil;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.io.IOException;

public class LogoutValidationTest {
    WebDriver driver = null;

    @BeforeClass
    //Open the web browser
    public void openDriver() throws IOException, InterruptedException {
        driver = DriverUtil.getChromeDriver();
    }

    @Test(priority = 1, description = "Login to the Buggy Rating application")
    public void login() throws IOException, InterruptedException {
        LoginUtil.login(driver);
        Thread.sleep(500);
    }

    @Test(priority = 2, description = "Validate the 'Log out' funtion")
    public void checkLogout() throws IOException, InterruptedException {
        LogoutActions.isLoggedOut(driver);
        Thread.sleep(500);
    }

    @AfterClass
    public void logout() throws IOException, InterruptedException {
        DriverUtil.quitChromeDriver();
    }
}
