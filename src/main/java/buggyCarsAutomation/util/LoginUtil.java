package buggyCarsAutomation.util;

import buggyCarsAutomation.data.LoginData;
import org.openqa.selenium.WebDriver;
import static buggyCarsAutomation.page.HomePage.*;

public class LoginUtil {

    public static void login(WebDriver driver) throws InterruptedException {
        // Insert 'Username' and 'Password' values to the fields
        Thread.sleep(4000);
        userNameFld(driver).clear();
        userNameFld(driver).sendKeys(LoginData.userName);
        Thread.sleep(500);
        passwordFld(driver).clear();
        passwordFld(driver).sendKeys(LoginData.password);
        Thread.sleep(500);

        // Click on the 'Login' button
        loginBtn(driver).click();
        Thread.sleep(1000);

    }
}
