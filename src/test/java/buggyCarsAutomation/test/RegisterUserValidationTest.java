package buggyCarsAutomation.test;

import buggyCarsAutomation.action.RegisterActions;
import buggyCarsAutomation.util.DriverUtil;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.io.IOException;

public class RegisterUserValidationTest {
    WebDriver driver = null;

    @BeforeClass
    //Open the web browser
    public void openDriver() throws IOException, InterruptedException {
        driver = DriverUtil.getChromeDriver();
    }

    @Test(priority = 1, description = "Validate the objects of the Register function")
    public void checkRegisterObjects() throws IOException, InterruptedException {
        RegisterActions.isDisplayedRegisterObjects(driver);
        Thread.sleep(1000);
    }

    @Test(priority = 2, description = "Enter values to the 'Register' form")
    public void enterValues() throws IOException, InterruptedException {
        RegisterActions.enterRegisterValues(driver);
        Thread.sleep(1000);
    }

    @Test(priority = 3, description = "Validate the 'Register' link gets enabled")
    public void checkRegisterLnk() throws IOException, InterruptedException {
        RegisterActions.isRegisterLnkEnabled(driver);
        Thread.sleep(1000);
    }

    @Test(priority = 4, description = "Validate the user gets registered")
    public void checkRegisterUser() throws IOException, InterruptedException {
        RegisterActions.isUserRegistered(driver);
        Thread.sleep(1000);
    }

    @AfterClass
    public void closeBrowser() throws IOException, InterruptedException {
        DriverUtil.quitChromeDriver();
    }
}
