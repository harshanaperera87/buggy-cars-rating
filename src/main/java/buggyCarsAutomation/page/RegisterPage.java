package buggyCarsAutomation.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {

    private static WebElement element = null;

    //Capture the 'Login' field
    public static WebElement loginFld(WebDriver driver) {
        element = driver.findElement(By.id("username"));
        return element;
    }

    //Capture the 'First Name' field
    public static WebElement firstNameFld(WebDriver driver) {
        element = driver.findElement(By.id("firstName"));
        return element;
    }

    //Capture the 'Last Name' field
    public static WebElement lastNameFld(WebDriver driver) {
        element = driver.findElement(By.id("lastName"));
        return element;
    }

    //Capture the 'Password' field
    public static WebElement passwordFld(WebDriver driver) {
        element = driver.findElement(By.id("password"));
        return element;
    }

    //Capture the 'Confirm Password' field
    public static WebElement confirmPasswordFld(WebDriver driver) {
        element = driver.findElement(By.id("confirmPassword"));
        return element;
    }

    //Capture the 'Register' link
    public static WebElement registerLnk(WebDriver driver) {
        element = driver.findElement(By.cssSelector(".btn-default"));
        return element;
    }

    //Capture the 'Cancel' link
    public static WebElement cancelLnk(WebDriver driver) {
        element = driver.findElement(By.linkText("Cancel"));
        return element;
    }

    //Capture the 'Success Message'
    public static WebElement successMsg(WebDriver driver) {
        element = driver.findElement(By.cssSelector(".result"));
        return element;
    }
}
