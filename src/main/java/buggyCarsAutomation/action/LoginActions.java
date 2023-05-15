package buggyCarsAutomation.action;

import buggyCarsAutomation.page.HomePage;
import buggyCarsAutomation.page.ProfilePage;
import org.openqa.selenium.WebDriver;
public class LoginActions {
    public static void isDisplayedLoginObjects(WebDriver driver) throws InterruptedException {
        //Validate all the objects of the Login function, are displayed
        HomePage.userNameFld(driver).isDisplayed();
        HomePage.passwordFld(driver).isDisplayed();
        HomePage.loginBtn(driver).isDisplayed();
        HomePage.registerBtn(driver).isDisplayed();
    }
    public static void isLoggedIn(WebDriver driver) throws InterruptedException {
        //Validate Logged in successfully
        ProfilePage.profileLnk(driver).isDisplayed();
    }
}
