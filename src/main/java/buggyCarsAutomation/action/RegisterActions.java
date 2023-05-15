package buggyCarsAutomation.action;

import buggyCarsAutomation.data.RegisterData;
import buggyCarsAutomation.page.HomePage;
import buggyCarsAutomation.page.RegisterPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class RegisterActions {
    public static void isDisplayedRegisterObjects(WebDriver driver) throws InterruptedException {
        //Click on the 'Register' link
        HomePage.registerBtn(driver).click();
        //Validate all the objects of the Register page, are displayed
        RegisterPage.loginFld(driver).isDisplayed();
        RegisterPage.firstNameFld(driver).isDisplayed();
        RegisterPage.lastNameFld(driver).isDisplayed();
        RegisterPage.passwordFld(driver).isDisplayed();
        RegisterPage.confirmPasswordFld(driver).isDisplayed();
        RegisterPage.cancelLnk(driver).isDisplayed();
        RegisterPage.registerLnk(driver).isDisplayed();
        //Validate initially 'Register' link is disabled
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertFalse(RegisterPage.registerLnk(driver).isEnabled());
        //Validate 'Cancel' button is enabled
        softAssert.assertTrue(RegisterPage.cancelLnk(driver).isEnabled());
    }

    public static void enterRegisterValues(WebDriver driver) throws InterruptedException {
        //Enter values to the 'Register' form
        RegisterPage.loginFld(driver).click();
        RegisterPage.loginFld(driver).sendKeys(RegisterData.login);
        RegisterPage.firstNameFld(driver).click();
        RegisterPage.firstNameFld(driver).sendKeys(RegisterData.firstName);
        RegisterPage.lastNameFld(driver).click();
        RegisterPage.lastNameFld(driver).sendKeys(RegisterData.lastName);
        RegisterPage.passwordFld(driver).click();
        RegisterPage.passwordFld(driver).sendKeys(RegisterData.password);
        RegisterPage.confirmPasswordFld(driver).click();
        RegisterPage.confirmPasswordFld(driver).sendKeys(RegisterData.confirmPassword);
    }

    public static void isRegisterLnkEnabled(WebDriver driver) throws InterruptedException {
        //Validate 'Register' link gets enabled when values are added
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(RegisterPage.registerLnk(driver).isEnabled());

    }
    public static void isUserRegistered(WebDriver driver) throws InterruptedException {
        //Click on the 'Register' link to register the user
        RegisterPage.registerLnk(driver).click();
        //Scroll down the page
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,380.79998779296875)");
        //Validate success message is displayed
        RegisterPage.successMsg(driver).isDisplayed();
    }
}
