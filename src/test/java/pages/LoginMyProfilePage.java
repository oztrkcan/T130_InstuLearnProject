package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginMyProfilePage extends LoginDashboardPage{
    public LoginMyProfilePage(WebDriver driver) {
        super(driver);
    }

    // Profile name TExt
    @FindBy(tagName = "h1")
    public WebElement profileName;
    public boolean isDisplayedProfileName() {
        return profileName.isDisplayed();
    }

    //Profile About Link
    @FindBy(id = "about-tab")
    public WebElement aboutLinkOnMyProfile;
    public void clickAboutOnMyProfileLink() {
        click(aboutLinkOnMyProfile);
    }

    //Courses
    @FindBy(xpath = "//a[@id='webinars-tab']")
    public WebElement coursesOnMyProfileLink;
    public void clickCoursesOnMyProfileLink() {
        click(coursesOnMyProfileLink);
    }

    // Articles
    @FindBy(linkText = "Articles")
    public WebElement articlesOnMyProfile;
    public void clickArticlesOnMyProfileLink() {
        click(articlesOnMyProfile);
    }

    // BAdges
    @FindBy(id = "badges-tab")
    public WebElement badgesOnMyProfileLink;

    public void clickBadgesOnMyProfileLink() {
        click(badgesOnMyProfileLink);
    }

    //REserve a meeting
    @FindBy(id = "appointments-tab")
    public WebElement reserveAMeetingOnMyProfileLink;

    public void clickReserveAMeetingOnMyProfileLink() {
        click(reserveAMeetingOnMyProfileLink);
    }



}
