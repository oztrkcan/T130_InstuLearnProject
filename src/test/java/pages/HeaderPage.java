package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ReusableMethods;

public class HeaderPage extends BasePage {
    public HeaderPage(WebDriver driver) {
        super(driver);
    }

    // Home Link
    @FindBy(linkText = "Home")
    public WebElement homeLinkInHeader;
    public void clickHomeLinkInHeader(){
        click(homeLinkInHeader);
    }

    // login link
    @FindBy(linkText = "Login")
    public WebElement loginLinkInHeader;

    public void clickLoginLinkInHeader() {
        click(loginLinkInHeader);
    }

    public boolean isDisplayedLoginLinkInHeader() {
        return loginLinkInHeader.isDisplayed();
    }

    public boolean isEnabledLoginLinkInHeader() {
        return loginLinkInHeader.isEnabled();
    }

    // register link
    @FindBy(linkText = "Register")
    public WebElement registerLinkInHeader;

    public void clickREgisterLinkInHeader() {
        click(registerLinkInHeader);
    }

    public boolean isDisplayedRegisterLinkInHeader() {
        return registerLinkInHeader.isDisplayed();
    }

    public boolean isEnabledRegisterLinkInHeader() {
        return registerLinkInHeader.isEnabled();
    }

    // Profile logo
    @FindBy(css = "[class='rounded-circle']")
    public WebElement profileLogoInHeader;

    public void clickProfileLogoInHeader(){
        click(profileLogoInHeader);
    }

    //Profile Link
    @FindBy(xpath = "//span[text()='Profile']")
    public WebElement profileLinkInHeader;
    public boolean isDisplayedMyProfileLink() {
        waitForVisibility(profileLinkInHeader);
        return profileLinkInHeader.isDisplayed();
    }

    public boolean isEnabledMyProfileLink() {
        return profileLinkInHeader.isEnabled();
    }

    // Product Count at the Shopping Card
    @FindBy(xpath= "//div[1]/button/span")
    public WebElement productCountOfAtTheCard;

    // Categories Link
    @FindBy(xpath = "//*[@class='menu-category']")
    public WebElement categoriesLink;

    public void clickCategoriesLinkOnHedaer(){
        click(categoriesLink);
    }

    public boolean isDisplayedCategoriesLInk(){
        return categoriesLink.isDisplayed();
    }

    // Home Link
    @FindBy(xpath = "//*[.='Home']")
    public WebElement homeLInk;

    // Courses Link
    @FindBy(xpath = "(//a[@class='nav-link'])[2]")
    public WebElement coursesLink;

    public void clickCoursesLinkOnHeader(){
        click(coursesLink);
    }

    // Dashboard Link
    @FindBy(xpath = "//a[@href='/panel']")
    public WebElement dashboardLinkHomeHeader;

    public void clickDashboardLink() {
        click(dashboardLinkHomeHeader);
    }

    // Activate Offline Status
    @FindBy(xpath = "(//*[.='Activate offline status'])[1]")
    public WebElement activateOfflineStatusButton;

    public boolean isDisplayedActivateButton(){
        return activateOfflineStatusButton.isDisplayed();
    }

    public boolean isEnabledActivateButton(){
        return activateOfflineStatusButton.isEnabled();
    }

    // DashboardCourses Link
    @FindBy(xpath = "(//span[text()='Courses'])[2]")
    public WebElement dashboardCoursesLink;

    // Dashboard CourseBundles LInk
    @FindBy(xpath = "//span[text()='Course Bundles']")
    public WebElement dashboardCourseBundlesLink;

    // Dashboard Meetings Link
    @FindBy(xpath = "//span[text()='Meetings']")
    public WebElement dashboardMeetingsLink;

    // Development Link
    @FindBy(xpath = "//div[text()[normalize-space()='Development']]")
    public WebElement developmentLinkOnHeader;

    public boolean isDisplayedDevelopmentHeader(){
        return developmentLinkOnHeader.isDisplayed();
    }

}
