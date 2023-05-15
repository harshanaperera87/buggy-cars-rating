package buggyCarsAutomation.page;

import org.openqa.selenium.*;


public class VotingPage {

    private static WebElement element = null;

    //Capture the 'Popular Make' link
    public static WebElement popularMakeLnk(WebDriver driver) {
        element = driver.findElement(By.cssSelector(".col-md-4:nth-child(1) .img-fluid"));
        return element;
    }

    //Capture the 'Mito' link
    public static WebElement giuliettaLnk(WebDriver driver) {
        element = driver.findElement(By.linkText("Giulietta"));
        return element;
    }

    //Capture the 'Comment' field
    public static WebElement commentFld(WebDriver driver) {
        try {
            element = driver.findElement(By.id("comment"));
            return element;
        }
        catch (NoSuchElementException exception) {
            return null;
        }
    }

    //Capture the 'Vote' count
    public static WebElement voteCount(WebDriver driver) {
        element = driver.findElement(By.cssSelector("h4 > strong"));
        return element;
    }

    //Capture the 'Vote' button
    public static WebElement voteBtn(WebDriver driver) {
        element = driver.findElement(By.cssSelector(".btn"));
        return element;
    }

    //Capture the 'Thank you' text
    public static WebElement thankYouTxt(WebDriver driver) {
        element = driver.findElement(By.cssSelector(".card-text"));
        return element;
    }

}
