package buggyCarsAutomation.util;

import buggyCarsAutomation.page.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class DriverUtil {

        private static WebDriver driver;
        public static WebDriver getChromeDriver() {
                driver = WebDriverManager.chromiumdriver().create();
                driver.get("https://buggy.justtestit.org");
/*                WebDriverWait wait = new WebDriverWait(driver, 30);
                wait.until(ExpectedConditions.visibilityOfElementLocated(HomePage.loginBtn(driver)));*/
                driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
                driver.manage().window().maximize();
                return driver;
        }

        public static WebDriver quitChromeDriver() {
                driver.quit();
                return driver;
        }
}
