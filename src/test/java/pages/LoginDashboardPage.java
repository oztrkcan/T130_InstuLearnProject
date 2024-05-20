package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

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

    //courses link
    @FindBy(xpath = "(//span[text()='Courses'])[2]")
    public WebElement dashboardCoursesLink;
    public boolean isDisplayeddashboardCoursesLink(){
        return dashboardCoursesLink.isDisplayed();

    }
    public boolean isEnableddashboardCoursesLink(){
        return dashboardCoursesLink.isEnabled();
    }

    // courses Bundles link
    @FindBy(xpath = "//span[text()='Course Bundles']")
    public WebElement dashboardCourseBundlesLink;
    public boolean isDisplayeddashboardCourseBundlesLink(){
        return dashboardCourseBundlesLink.isDisplayed();
    }
    public boolean isEnableddashboardCourseBundlesLink() {
        return dashboardCourseBundlesLink.isEnabled();
    }

    // dashboardMeetingsLink
    @FindBy(xpath = "//span[text()='Meetings']")
    public WebElement dashboardMeetingsLink;
    public boolean isDisplayeddashboardMeetingsLink(){
        return dashboardMeetingsLink.isDisplayed();
    }
    public boolean isEnableddashboardMeetingsLink() {
        return dashboardMeetingsLink.isEnabled();
    }


    //dashboardQuizzesLink
    @FindBy(xpath = "//span[text()='Quizzes']")
    public WebElement dashboardQuizzesLink;
    public boolean isDisplayeddashboardQuizzesLink(){
        return dashboardQuizzesLink.isDisplayed();
    }
    public boolean isEnableddashboardQuizzesLink() {
        return dashboardQuizzesLink.isEnabled();
    }

    //dashboardCertificatesLink
    @FindBy(xpath = "//span[text()='Certificates']")
    public WebElement dashboardCertificatesLink;
    public boolean isDisplayeddashboardCertificatesLink(){
        return dashboardCertificatesLink.isDisplayed();
    }
    public boolean isEnableddashboardCertificatessLink() {
        return dashboardCertificatesLink.isEnabled();
    }

    //dashboardFinancialLink
    @FindBy(xpath = "//span[text()='Financial']")
    public WebElement dashboardFinancialLink;
    public boolean isDisplayeddashboardFinancialLink(){
        return dashboardFinancialLink.isDisplayed();
    }
    public boolean isEnableddashboardFinancialLink() {
        return dashboardFinancialLink.isEnabled();
    }

    //dashboardSupportLink
    @FindBy(xpath = "//span[text()='Support']")
    public WebElement dashboardSupportLink;
    public boolean isDisplayeddashboardSupportLink(){
        return dashboardSupportLink.isDisplayed();
    }
    public boolean isEnableddashboardSupportLink() {
        return dashboardSupportLink.isEnabled();
    }

    //dashboardMarketingLink
    @FindBy(xpath = "//span[text()='Marketing']")
    public WebElement dashboardMarketingLink;
    public boolean isDisplayeddashboardMarketingLink(){
        return dashboardMarketingLink.isDisplayed();
    }
    public boolean isEnableddashboardMarketingLink() {
        return dashboardMarketingLink.isEnabled();
    }


    //dashboardArticlesLink
    @FindBy(xpath = "//span[text()='Articles']")
    public WebElement dashboardArticlesLink;
    public boolean isDisplayeddashboardArticlesLink(){
        return dashboardArticlesLink.isDisplayed();
    }
    public boolean isEnableddashboardArticlesgLink() {
        return dashboardArticlesLink.isEnabled();
    }

    //dashboardANoticeboardLink
    @FindBy(xpath = "//span[text()='Noticeboard']")
    public WebElement dashboardANoticeboardLink;
    public boolean isDisplayeddashboardNoticeboardLink(){
        return dashboardANoticeboardLink.isDisplayed();
    }
    public boolean isEnableddashboardNoticeboardLink() {
        return dashboardANoticeboardLink.isEnabled();
    }
    //dashboardANotificationsLink
    @FindBy(xpath = "//span[text()='Notifications']")
    public WebElement dashboardANotificationsLink;
    public boolean isDisplayeddashboardNotificationsLink(){
        return dashboardANotificationsLink.isDisplayed();
    }
    public boolean isEnableddashboardNotificationsdLink() {
        return dashboardANotificationsLink.isEnabled();
    }

    //dashboardASettingsLink
    @FindBy(xpath = "//span[text()='Settings']")
    public WebElement dashboardASettingsLink;
    public boolean isDisplayeddashboardSettingsLink(){
        return dashboardASettingsLink.isDisplayed();
    }
    public boolean isEnableddashboardSettingsLink() {
        return dashboardASettingsLink.isEnabled();
    }

    @FindBy(xpath = "//span[text()='Log out']")
    public WebElement dashboardLogoutLink;
    public boolean isDisplayeddashboardLogoutLink(){
        return dashboardLogoutLink.isDisplayed();
    }
    public boolean isEnableddashboardLogoutLink() {
        return dashboardLogoutLink.isEnabled();
    }
    //viewAllEventsLink
    @FindBy(xpath = "//a[contains(@class,'mt-15 font-weight-500')]")
    public WebElement viewAllEventsLink;
    public boolean isDisplayedviewAllEventsLink(){
        return viewAllEventsLink.isDisplayed();
    }
    public boolean isEnabledviewAllEventsLink() {
        return viewAllEventsLink.isEnabled();
    }
    @FindBy(xpath = "//img[@src='/assets/default/img/activity/36.svg']")
    public WebElement accountBalancelink;
    public boolean isDisplayedAccountBalancelinksk(){
        return accountBalancelink.isDisplayed();
    }
    public boolean isEnabledAccountBalancelinks() {
        return accountBalancelink.isEnabled();
    }
    @FindBy(xpath = "//div[@class='stat-icon requests']")
    public WebElement pendingMeetingsLink;
    public boolean isDisplayedpendingMeetingsLink(){
        return pendingMeetingsLink.isDisplayed();
    }
    public boolean isEnabledpendingMeetingsLink() {
        return pendingMeetingsLink.isEnabled();
    }
    @FindBy(xpath = "(//a[contains(@class,'dashboard-stats rounded-sm')])[3]")
    public WebElement supportMessageslink;
    public boolean isDisplayedsupportMessageslink(){
        return supportMessageslink.isDisplayed();
    }
    public boolean isEnabledsupportMessageslink() {
        return supportMessageslink.isEnabled();
    }
    @FindBy(xpath = "//div[@class='stat-icon monthly-sales']")
    public WebElement monthlySaleslink;
    public boolean isDisplayedmonthlySaleslink(){
        return monthlySaleslink.isDisplayed();
    }
    @FindBy(xpath = "//div[@class='stat-icon comments']//img[1]")
    public WebElement commentsLink;
    public boolean isDisplayedcommentsLink(){
        return commentsLink.isDisplayed();
    }
    public boolean isEnabledcommentsLink() {
        return commentsLink.isEnabled();
    }

    @FindBy(xpath = "//h3[contains(@class,'font-16 text-dark-blue')]")
    public WebElement noticeboard;
    public boolean isDisplayednoticeboard(){
        scrollToElementWithAction(noticeboard);
        return noticeboard.isDisplayed();
    }

    //MOre Info Buttons
    @FindBy(xpath = "//*[.='More info']")
    public List<WebElement> moreInfoButtons;

    public void clickMoreInfoButton(int index){
        click(moreInfoButtons.get(index));
    }
    // Noticeboard Message
    @FindBy(id = "swal2-content")
    public WebElement noticboardMessage;

    public boolean isDisplayedNoticeboardMessage(){
        return noticboardMessage.isDisplayed();
    }

    // My chart
    @FindBy(id = "myChart")
    public WebElement myChartGrapphic;

    public boolean isDisplayedMyChart(){
        return myChartGrapphic.isDisplayed();
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
