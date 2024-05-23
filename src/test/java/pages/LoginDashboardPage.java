package pages;

import com.github.javafaker.Faker;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import utilities.ReusableMethods;
import utilities.TestData.TestDataBase;

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

    public boolean isDisplayedMyReservationLInk(){
        waitForVisibility(myReservationsLinkOnSidebar);
        return myReservationsLinkOnSidebar.isDisplayed();
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

    //Completion certificates
    @FindBy(partialLinkText = "Completion Certificates")
    public WebElement completionCertificateslink;
    public void clickCompletionCertificatesLink() {
        click(completionCertificateslink);
    }

    // Certifcates Link
    @FindBy(xpath = "//span[text()='Certificates']")
    public WebElement certificatesLink;

    public void clickCertificatesLink() {
        click(certificatesLink);
    }

    @FindBy(xpath = "//span[text()='Financial']")
    public WebElement financialclick;
    public boolean isDisplayedfinancialclick(){
        return financialclick.isDisplayed();
    }
    public void clickFinancialLİnk(){
        scrollWithJs(financialclick);
        click(financialclick);
    }



    @FindBy(xpath = "//a[@href='/panel/financial/sales']")
    public WebElement financialSales;
    public void clickFinancialSales(){
        click(financialSales);
    }
    public boolean isDisplayedfinancialSales(){
        return financialSales.isDisplayed();
    }
    public boolean isEnabledfinancialSales() {
        return financialSales.isEnabled();
    }


    @FindBy(xpath = "//a[@href='/panel/financial/summary']")
    public WebElement financialSummary;
    public boolean isDisplayedfinancialSummary(){
        return financialSummary.isDisplayed();
    }
    public boolean isEnabledfinancialSummary() {
        return financialSummary.isEnabled();
    }

    @FindBy(xpath = "//a[@href='/panel/financial/payout']")
    public  WebElement financialPayout;
    public boolean isDisplayedfinancialPayout(){
        return financialPayout.isDisplayed();
    }
    public boolean isEnabledfinancialPayout() {
        return financialPayout.isEnabled();
    }
    @FindBy(xpath = "//a[@href='/panel/financial/account']")
    public WebElement financialChargeAccount;
    public boolean isDisplayedfinancialChargeAccount(){
        return financialChargeAccount.isDisplayed();
    }
    public boolean isEnabledfinancialChargeAccount() {
        return financialChargeAccount.isEnabled();
    }

    @FindBy(xpath = "//a[@href='/panel/financial/subscribes']")
    public WebElement financialSubscribes;
    public boolean isDisplayedfinancialSubscribes(){
        return financialSubscribes.isDisplayed();
    }
    public boolean isEnabledfinancialSubscribes() {
        return financialSubscribes.isEnabled();
    }

    //US27
    @FindBy(xpath = "//h2[text()='Sales statistics']")
    public WebElement salesStatistics;
    public boolean isDisplayedSalesStatistics(){
        return salesStatistics.isDisplayed();
    }
    @FindBy(xpath = "//a[@href=' /panel/webinars/purchases ']")
    public WebElement dashbordPurchases;
    public boolean isDisplayedPurchases(){
        return dashbordPurchases.isDisplayed();
    }
    public boolean isEnabledPurchases(){
        return dashbordPurchases.isEnabled();
    }
    @FindBy(xpath = "//a[@href=' /panel/meetings/reservation ']")
    public WebElement dashboardMeeting;
    public boolean isDisplayedMeetings(){
        return dashboardMeeting.isDisplayed();
    }
    public boolean isEnabledMeeting(){
        return dashboardMeeting.isEnabled();
    }

    public void clickfinancialSummary(){
        click(financialSummary);
    }
    @FindBy(xpath = "//div[contains(@class,'panel-sidebar pt-50')]/following-sibling::div[1]")
    public WebElement financialDocument;
    public boolean isDisplayedfinancialDocument(){
        return financialDocument.isDisplayed();
    }





    //Arzu>>>>>>>>Dashboard Instructor menu<<<<<<<<<<<<
    @FindBy(xpath = "(//span[contains(@class,'font-14 text-dark-blue')])[2]")
    public WebElement dashboardInstructorLink;
    @FindBy(xpath = "//a[@href='/panel/manage/instructors/new']")
    public WebElement instructorNewLink;
    @FindBy(xpath = "//a[@href='/panel/manage/instructors']")
    public WebElement instructorListLink;
    @FindBy(xpath = "//*[@name='email']")
    public WebElement newPageEmailBox;
    @FindBy(xpath = "//*[@name='full_name']")
    public WebElement newPageNameBox;
    @FindBy(xpath = "//*[@name='password']")
    public WebElement newPagePasswordBox;
    @FindBy(xpath = "//*[@name='password_confirmation']")
    public WebElement newPageRetypePasswordBox;
    @FindBy(xpath = "//*[@name='mobile']")
    public WebElement newPagePhoneBox;
    @FindBy(xpath = "//*[@name='language']")
    public WebElement newPageLanguageComboBox;
    @FindBy(xpath = "//*[@name='timezone']")
    public WebElement newPageTimezoneComboBox;
    @FindBy(xpath = "(//*[@class='form-group mt-30 d-flex align-items-center justify-content-between'])")
    public List<WebElement> newPageActiveButtonList;
    @FindBy(id = "saveData")
    public WebElement saveButton;
    @FindBy(xpath = "//*[@class='panel-content']")
    public WebElement listInstructorPanel;
    @FindBy(xpath = "//h2[text()='Filter Instructors']")
    public WebElement filterText;
    @FindBy(xpath = "(//input[@class='form-control'])")
    public List<WebElement>filterNameEmailList;
    @FindBy(xpath = "//select[@name='type']")
    public WebElement typeDropdownBox;
    @FindBy(xpath = "//*[.='Show Results']")
    public WebElement showResult;
    @FindBy(xpath = "(//*[@class='available'])")
    public List<WebElement> dayList;
    @FindBy(xpath = "//*[@name='name']")
    public WebElement nameTextbox;
    @FindBy(xpath = "(//*[@class='font-30 text-dark-blue font-weight-bold mt-5'])[1]")
    public WebElement FilterInstructorCount;
    LoginCertifikatesPage loginCertifikatesPage=new LoginCertifikatesPage(driver);


    public void clickInstructorLink() {click(dashboardInstructorLink);}

    public void CreateNewInstructor() {
        click(instructorNewLink);
        Faker faker = new Faker();
        newPageEmailBox.sendKeys(faker.internet().emailAddress());
        newPageNameBox.sendKeys("QA Instructor");
        newPagePasswordBox.sendKeys(TestDataBase.fakePassword);
        newPageRetypePasswordBox.sendKeys(TestDataBase.fakePassword);
        newPagePhoneBox.sendKeys(TestDataBase.phoneNumber);
        ReusableMethods.scrollWithJs(newPageTimezoneComboBox);
        Select languageOption = new Select(newPageLanguageComboBox);
        languageOption.getOptions().get(1).click();
        System.out.println(languageOption.getOptions().get(1).getText());
        Select timeOption = new Select(newPageTimezoneComboBox);
        timeOption.selectByVisibleText("Europe/Berlin");
        for (WebElement secim:newPageActiveButtonList){
            secim.click();
            System.out.println(secim.getText());}click(saveButton);}

    public void clickListLink(){click(instructorListLink);}
    public void isEnabledFilterOption(){
        Assert.assertTrue(filterText.isDisplayed());
        Assert.assertTrue(loginCertifikatesPage.fromDate.isEnabled());
        Assert.assertTrue(loginCertifikatesPage.toDate.isEnabled());
        for (WebElement list:filterNameEmailList){
            Assert.assertTrue(list.isEnabled());
        }
        Select typeBox=new Select(typeDropdownBox);
        Assert.assertTrue(typeDropdownBox.isEnabled());
        Assert.assertTrue(showResult.isEnabled());}

    public void getFromDate2(int day1, String month1){
        click(loginCertifikatesPage.fromDate);
        int i = 0;
        while (!loginCertifikatesPage.monthsAndYearsFromDate.get(i).getText().equalsIgnoreCase(month1)) {
            click(loginCertifikatesPage.prevFromDate);
            ReusableMethods.wait(1);
            if (loginCertifikatesPage.monthsAndYearsFromDate.get(i).getText().equalsIgnoreCase(month1)) {
                break;
            }
            ReusableMethods.wait(1);
        }
        for (WebElement day:dayList){
            if(day.getText().equalsIgnoreCase(Integer.toString(day1))){
                day.click();
                ReusableMethods.wait(2);
                break;
            }
        }
        clickWithJs1(loginCertifikatesPage.applyForFromDate);
        ReusableMethods.wait(2);
    }

    public void getToDate2(int day2, String month2){
        click(loginCertifikatesPage.toDate);
        int i = 0;
        while (!loginCertifikatesPage.monthsAndYearToDate.get(i).getText().equalsIgnoreCase(month2)) {
            click(loginCertifikatesPage.nextForToDate);
            if (loginCertifikatesPage.monthsAndYearToDate.get(i).getText().equalsIgnoreCase(month2)){
                break;
            }
        }
        for (WebElement day:dayList){
            if(day.getText().equalsIgnoreCase(Integer.toString(day2))){
                day.click();
                ReusableMethods.wait(2);
                break;
            }
        }
        clickWithJs1(loginCertifikatesPage.applyToDate);
    }
    public void verifyInstructorList(){
        if (Integer.parseInt(FilterInstructorCount.getText())==0) CreateNewInstructor();
    }

    // List Link
    @FindBy(xpath = "//a[@href='/panel/certificates']")
    public WebElement listLinkOnSidebar;

    public boolean isDisplayedListLinkOnSidevar() {
        waitForVisibility(listLinkOnSidebar);
        return listLinkOnSidebar.isDisplayed();
    }
    public void clickListLinkOnSidebar() {
        click(listLinkOnSidebar);
    }
}
