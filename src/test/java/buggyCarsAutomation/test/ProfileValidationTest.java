package buggyCarsAutomation.test;

import buggyCarsAutomation.action.ProfileActions;
import buggyCarsAutomation.util.DriverUtil;
import buggyCarsAutomation.util.LoginUtil;
import buggyCarsAutomation.util.LogoutUtil;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.io.IOException;

public class ProfileValidationTest {
    WebDriver driver = null;

    @BeforeClass
    //Open the web browser
    public void openDriver() throws IOException, InterruptedException {
        driver = DriverUtil.getChromeDriver();
    }

    @Test(priority = 0, description = "Login to the Buggy Rating application")
    public void login() throws IOException, InterruptedException {
        LoginUtil.login(driver);
        Thread.sleep(500);
    }

    @Test(priority = 1, description = "Validate Basic Fields")
    public void checkBasicFlds() throws IOException, InterruptedException {
        ProfileActions.validateBasicFlds(driver);
        Thread.sleep(500);
    }

    @Test(priority = 2, description = "Enter values to the AdditionalInfo fields")
    public void enterAdditionalInfo() throws IOException, InterruptedException {
        ProfileActions.enterAdditionalInfo(driver);
        Thread.sleep(1000);
    }

    @Test(priority = 3, description = "Validate changes get saved")
    public void isProfileChanged() throws IOException, InterruptedException {
        ProfileActions.isProfileChanged(driver);
        Thread.sleep(500);
    }

    @AfterClass
     public void closeBrowser() throws IOException, InterruptedException {
        LogoutUtil.logout(driver);
        Thread.sleep(500);
    }
}
