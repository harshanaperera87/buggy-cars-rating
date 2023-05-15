package buggyCarsAutomation.util;

import buggyCarsAutomation.data.LoginData;
import buggyCarsAutomation.page.ProfilePage;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

import static buggyCarsAutomation.page.HomePage.*;

public class LogoutUtil {

    public static void logout(WebDriver driver) throws InterruptedException {
        //Click on the 'Logout' link
        ProfilePage.logoutLnk(driver).click();
        //Close the window
        DriverUtil.quitChromeDriver();
    }
}
