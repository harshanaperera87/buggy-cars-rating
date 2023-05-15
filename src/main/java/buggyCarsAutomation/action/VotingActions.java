package buggyCarsAutomation.action;

import buggyCarsAutomation.page.VotingPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
public class VotingActions {

    public static void navigateVoting(WebDriver driver) throws InterruptedException {
        //Navigate to the 'Voting' option
        VotingPage.popularMakeLnk(driver).click();
        Thread.sleep(1000);
        VotingPage.giuliettaLnk(driver).click();
        Thread.sleep(3000);
    }

    public static void validateVoting(WebDriver driver) throws InterruptedException {
        //Validate voting option and voting count
        WebElement commentFld =VotingPage.commentFld(driver);
        if(commentFld != null){
            int existingVoteCount = Integer.parseInt(VotingPage.voteCount(driver).getText());
            VotingPage.commentFld(driver).click();
            VotingPage.commentFld(driver).sendKeys("Test Comment");
            VotingPage.voteBtn(driver).click();
            Thread.sleep(1000);
            //Validate voting count gets increased
            int newVotingCount = Integer.parseInt(VotingPage.voteCount(driver).getText());
            Assert.assertEquals(newVotingCount, existingVoteCount+1,"The voting count is incorrect");
            //Verify the "Thank you" text gets displayed
            VotingPage.thankYouTxt(driver).isDisplayed();
            Thread.sleep(1000);
        }else
            VotingPage.thankYouTxt(driver).isDisplayed();
    }

}
