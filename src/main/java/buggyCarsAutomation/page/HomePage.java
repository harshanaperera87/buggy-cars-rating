package buggyCarsAutomation.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePage {

    private static WebElement element = null;

     //Capture the 'UserName' field
    public static WebElement userNameFld(WebDriver driver) {
        element = driver.findElement(By.name("login"));
        return element;
    }

    //Capture the 'Password' field
    public static WebElement passwordFld(WebDriver driver) {
        element = driver.findElement(By.name("password"));
        return element;
    }

    //Capture the 'Login' button
    public static WebElement loginBtn(WebDriver driver) {
        element = driver.findElement(By.cssSelector(".btn-success"));
        return element;
    }

    //Capture the 'Register' button
    public static WebElement registerBtn(WebDriver driver) {
        element = driver.findElement(By.linkText("Register"));
        return element;
    }
}
