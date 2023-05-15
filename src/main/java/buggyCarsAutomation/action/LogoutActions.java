package buggyCarsAutomation.action;

import buggyCarsAutomation.page.HomePage;
import buggyCarsAutomation.page.ProfilePage;
import org.openqa.selenium.WebDriver;

public class LogoutActions {

    public static void isLoggedOut(WebDriver driver) throws InterruptedException {
        //Click on the 'Log out' link
        ProfilePage.logoutLnk(driver).click();
        //Validate 'Logout' function
        HomePage.loginBtn(driver).isDisplayed();
    }
}
