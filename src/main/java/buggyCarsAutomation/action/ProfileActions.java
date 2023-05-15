package buggyCarsAutomation.action;

import buggyCarsAutomation.data.LoginData;
import buggyCarsAutomation.data.ProfileData;
import buggyCarsAutomation.page.ProfilePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class ProfileActions {
    public static void validateBasicFlds(WebDriver driver) throws InterruptedException {
        //Click on the 'Profile' link
        ProfilePage.profileLnk(driver).click();
        //Validate Login field is disabled and is displayed entered login value
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertFalse(ProfilePage.loginFld(driver).isEnabled());
    }

    public static void enterAdditionalInfo(WebDriver driver) throws InterruptedException {
        //Enter values to the fields
        ProfilePage.genderDrpdwn(driver).clear();
        ProfilePage.genderDrpdwn(driver).sendKeys(ProfileData.gender);
        ProfilePage.ageFld(driver).click();
        ProfilePage.ageFld(driver).clear();
        ProfilePage.ageFld(driver).sendKeys(ProfileData.age);
        ProfilePage.addressFld(driver).click();
        ProfilePage.addressFld(driver).clear();
        ProfilePage.addressFld(driver).sendKeys(ProfileData.address);
        ProfilePage.phoneFld(driver).click();
        ProfilePage.phoneFld(driver).clear();
        ProfilePage.phoneFld(driver).sendKeys(ProfileData.phone);
        //Select a value from the 'Hobby' dropdown
        Select hobby = new Select(ProfilePage.hobbyDrpdwn(driver));
        hobby.selectByVisibleText("Movies");
    }

    public static void isProfileChanged(WebDriver driver) throws InterruptedException {
        //Click on the 'Save' button
        ProfilePage.saveBtn(driver).click();
        //Validate the success message
        ProfilePage.successMsg(driver).isDisplayed();


    }
}
