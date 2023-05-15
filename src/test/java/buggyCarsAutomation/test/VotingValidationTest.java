package buggyCarsAutomation.test;

import buggyCarsAutomation.action.VotingActions;
import buggyCarsAutomation.util.DriverUtil;
import buggyCarsAutomation.util.LoginUtil;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class VotingValidationTest {

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

    @Test(priority = 1, description = "Validate navigation to the Voting")
    public void checkNavigation() throws IOException, InterruptedException {
        VotingActions.navigateVoting(driver);
        Thread.sleep(500);
    }

    @Test(priority = 2, description = "Validate navigation to the Voting")
    public void validateVoting() throws IOException, InterruptedException {
        VotingActions.validateVoting(driver);
        Thread.sleep(500);
    }

    @AfterClass
    public void closeBrowser() throws IOException, InterruptedException {
        DriverUtil.quitChromeDriver();
    }
}
