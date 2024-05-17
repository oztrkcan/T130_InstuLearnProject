package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ReusableMethods;
import utilities.TestData.TestDataBase;

import java.util.List;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void loadHomePage() {
        driver.get(TestDataBase.homePageUrl);
    }

    /////////////////////////////////////////===========instructor=============////////////////////////////////////////
    // instructor all card section
    @FindBy(css = "[class='owl-stage']")
    public WebElement allcardSectionOfInstructor;

    //All Instructors button
    @FindBy(linkText = "All Instructors")
    public WebElement allINstructorsButtonOnHomePage;
    public void clickAllINstructorsButtonOnHomePage() {
        scrollToElementWithAction(allINstructorsButtonOnHomePage);
        click(allINstructorsButtonOnHomePage);
    }

    public boolean isDisplayedInstructorsOnHomePage() {
        return allINstructorsButtonOnHomePage.isDisplayed();
    }

    // Instructor slider Card
    @FindBy(css = "[class='owl-dot']")
    public List<WebElement> instructorSliderCards;
    public void clickSliderCardOfInstructors() {
        scrollToElementWithAction(allINstructorsButtonOnHomePage);
        for (WebElement card: instructorSliderCards){
            click(card);
        }
    }
    // instructors RAting Score
    @FindBy(xpath = "(//*[@class='owl-item active center'])/div/div/div/div[2]/div ")
    public WebElement ratingScoreOfInstructors;

    public boolean isDisplayedRatingOfScoreOfInstructors() {
        scrollToElementWithAction(allcardSectionOfInstructor);
        return ratingScoreOfInstructors.isDisplayed();
    }
    // instructors Name
    @FindBy(xpath = "(//*[@class='owl-item active center'])//h3")
    public WebElement nameOfINstructors;

    public boolean isDisplayedNameOfInstructors() {
        scrollToElementWithAction(allcardSectionOfInstructor);
        return nameOfINstructors.isDisplayed();
    }

    // instructors CArd Reserve a meeting
    @FindBy(xpath = "(//*[@class='owl-item active center'])//a[2]")
    public WebElement reserveaMeetingForInstructors;
    public boolean isDisplayedReserveAMeetingForInstructors() {
        scrollToElementWithAction(allcardSectionOfInstructor);
        return reserveaMeetingForInstructors.isDisplayed();
    }
    // instructors Reserve a Meeting
    @FindBy(xpath = "//*[@class='owl-item active']//a[.=\"Reserve a live meeting\"]")
    public List<WebElement> reserveMeetings;
    public void clickReserveAMeeting(){
        click(reserveMeetings.getFirst());
    }

    ///////////////////////////////////VİSİTOR////////////////////////////////
    //Home page body>>Join us as an Instructor and start teaching link
    @FindBy(xpath = "//img[@class='img-cover rounded-sm']")
    public WebElement JoinasInstructorSection;

    public boolean isDisplayedJoinAsInstructorSection(){
        ReusableMethods.scrollWithJs(JoinasInstructorSection);
        scrollToElementWithAction(JoinasInstructorSection);
        return JoinasInstructorSection.isDisplayed();}
    public void clickJoinAsInstructorSection(){
        scrollToElementWithAction(JoinasInstructorSection);
        click(JoinasInstructorSection);}

}
