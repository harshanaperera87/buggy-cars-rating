package buggyCarsAutomation.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProfilePage {

    private static WebElement element = null;

    //Capture the 'Profile' link
    public static WebElement profileLnk(WebDriver driver) {
        element = driver.findElement(By.linkText("Profile"));
        return element;
    }

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

    //Capture the 'Gender' dropdown
    public static WebElement genderDrpdwn(WebDriver driver) {
        element = driver.findElement(By.id("gender"));
        return element;
    }

    //Capture the 'Age' field
    public static WebElement ageFld(WebDriver driver) {
        element = driver.findElement(By.id("age"));
        return element;
    }

    //Capture the 'Address' field
    public static WebElement addressFld(WebDriver driver) {
        element = driver.findElement(By.id("address"));
        return element;
    }

    //Capture the 'Phone' field
    public static WebElement phoneFld(WebDriver driver) {
        element = driver.findElement(By.id("phone"));
        return element;
    }

    //Capture the 'Hobby' dropdown
    public static WebElement hobbyDrpdwn(WebDriver driver) {
        element = driver.findElement(By.id("hobby"));
        return element;
    }

    //Capture the 'Current Password' field
    public static WebElement currentPasswordFld(WebDriver driver) {
        element = driver.findElement(By.id("currentPassword"));
        return element;
    }

    //Capture the 'New Password' field
    public static WebElement newPasswordFld(WebDriver driver) {
        element = driver.findElement(By.id("newPassword"));
        return element;
    }

    //Capture the 'Confirm Password' field
    public static WebElement confirmPasswordFld(WebDriver driver) {
        element = driver.findElement(By.id("newPasswordConfirmation"));
        return element;
    }

    //Capture the 'Save' Button
    public static WebElement saveBtn(WebDriver driver) {
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
        element = driver.findElement(By.cssSelector(".hidden-md-down"));
        return element;
    }

    //Capture the 'Logout' link
    public static WebElement logoutLnk(WebDriver driver) {
        element = driver.findElement(By.linkText("Logout"));
        return element;
    }
}
