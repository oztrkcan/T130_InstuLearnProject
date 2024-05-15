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
    public WebElement aboutLinkMyProfile;
    public void clickAboutLink() {
        click(aboutLinkMyProfile);
    }



}
