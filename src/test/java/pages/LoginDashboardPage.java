package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginDashboardPage extends LoginPage{
    public LoginDashboardPage(WebDriver driver) {
        super(driver);
    }



    /////////////////////////////////////===========Sidebar=========///////////////////////////////////////////////////

    //===My Profile link====
    @FindBy(xpath = "//span[text()='My Profile']")
    public WebElement myProfileLinkInSidebar;

    public boolean isDisplayedMyProfileLinkInSidebar(){
        return myProfileLinkInSidebar.isDisplayed();
    }
    public boolean isEnabledMyProfileLinkInSidebar(){
        return myProfileLinkInSidebar.isEnabled();
    }

    public void clickMyProfileLinkOnDashboardSidebar() {
        scrollWithJs(myProfileLinkInSidebar);
        click(myProfileLinkInSidebar);
    }

    //Meeting Link
    @FindBy(xpath = "//span[text()='Meetings']")
    public WebElement meetingsLinkOnSidebar;

    public void clickMeetingsLinkOnSidebar(){
        click(meetingsLinkOnSidebar);
    }

    // My reservations link
    @FindBy(xpath = "//*[.='My reservations']")
    public WebElement myReservationsLinkOnSidebar;

    public void clickMyReservationsLinkOnSidebar() {
        click(myReservationsLinkOnSidebar);
    }

    // Requests Link
    @FindBy(xpath = "//*[.='Requests']")
    public WebElement requestLinkOnSidebar;

    public void clickRequestLinkOnSidebar(){
        click(requestLinkOnSidebar);
    }

    // Settings
    @FindBy(partialLinkText= "Settings")
    public WebElement settingsLinkOnSidebar;

    public void clickSettingsLinkOnSidebar() {
        click(settingsLinkOnSidebar);
    }
}
