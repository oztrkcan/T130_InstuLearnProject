package stepdefinitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginDashboardPage;
import pages.LoginQuizzesPage;
import utilities.ReusableMethods;

import static utilities.ReusableMethods.scrollToElementWithAction;

public class LoginDashboardSteps extends BaseStep{
    LoginDashboardPage loginDashboardPage = new LoginDashboardPage(driver);

    LoginQuizzesPage loginQuizzesPage=new LoginQuizzesPage(driver);
    @Then("I see the Link of My Profile in Dashboard sidebar.")
    public void iSeeTheLinkOfMyProfileInDashboardSidebar() {
        Assert.assertTrue(loginDashboardPage.isDisplayedMyProfileLinkInSidebar());
    }

    @Then("I can click My Profile Link")
    public void iCanClickMyProfileLink() {
        Assert.assertTrue(loginDashboardPage.isEnabledMyProfileLinkInSidebar());
    }

    @When("i click My Profile link on Dashboard sidebar")
    public void iClickMyProfileLinkOnDashboardSidebar() {
        loginDashboardPage.clickMyProfileLinkOnDashboardSidebar();
    }

    //kbr

    @Then("The Courses,Course Bundles,Meetings link appears in the sidebar on the dashboard and it is verified that it is active.")
    public void theCoursesCourseBundlesMeetingsLinkAppearsInTheSidebarOnTheDashboardAndItIsVerifiedThatItIsActive() {
        Assert.assertTrue(loginDashboardPage.isDisplayeddashboardCoursesLink());;
        Assert.assertTrue(loginDashboardPage.isEnableddashboardCoursesLink());
        Assert.assertTrue(loginDashboardPage.isDisplayeddashboardCourseBundlesLink());
        Assert.assertTrue(loginDashboardPage.isEnableddashboardCourseBundlesLink());
        Assert.assertTrue(loginDashboardPage.isDisplayeddashboardMeetingsLink());
        Assert.assertTrue(loginDashboardPage.isEnableddashboardMeetingsLink());
    }

    @Then("The Quizzes,Certificates,Financial link appears in the sidebar on the dashboard and it is verified that it is active.")
    public void theQuizzesCertificatesFinancialLinkAppearsInTheSidebarOnTheDashboardAndItIsVerifiedThatItIsActive() {
        Assert.assertTrue(loginDashboardPage.isDisplayeddashboardQuizzesLink());
        Assert.assertTrue(loginDashboardPage.isEnableddashboardQuizzesLink());
        Assert.assertTrue(loginDashboardPage.isDisplayeddashboardCertificatesLink());
        Assert.assertTrue(loginDashboardPage.isEnableddashboardCertificatessLink());
        Assert.assertTrue(loginDashboardPage.isDisplayeddashboardFinancialLink());
        Assert.assertTrue(loginDashboardPage.isEnableddashboardFinancialLink());
    }

    @Then("The Support,Marketing,Noticeboard link appears in the sidebar on the dashboard and it is verified that it is active.")
    public void theSupportMarketingNoticeboardLinkAppearsInTheSidebarOnTheDashboardAndItIsVerifiedThatItIsActive() {
        Assert.assertTrue(loginDashboardPage.isDisplayeddashboardSupportLink());
        Assert.assertTrue(loginDashboardPage.isEnableddashboardSupportLink());
        Assert.assertTrue(loginDashboardPage.isDisplayeddashboardMarketingLink());
        Assert.assertTrue(loginDashboardPage.isEnableddashboardMarketingLink());
        Assert.assertTrue(loginDashboardPage.isDisplayeddashboardNoticeboardLink());
        Assert.assertTrue(loginDashboardPage.isEnableddashboardNoticeboardLink());
    }

    @Then("The Notifications,Settings,My Profile,Log Out link appears in the sidebar on the dashboard and it is verified that it is active.")
    public void theNotificationsSettingsMyProfileLogOutLinkAppearsInTheSidebarOnTheDashboardAndItIsVerifiedThatItIsActive() {
        Assert.assertTrue(loginDashboardPage.isDisplayeddashboardNotificationsLink());
        Assert.assertTrue(loginDashboardPage.isEnableddashboardNotificationsdLink());
        Assert.assertTrue(loginDashboardPage.isDisplayeddashboardSettingsLink());
        Assert.assertTrue(loginDashboardPage.isEnableddashboardSettingsLink());
        Assert.assertTrue(loginDashboardPage.isDisplayedMyProfileLinkInSidebar());
        Assert.assertTrue(loginDashboardPage.isEnabledMyProfileLinkInSidebar());
        Assert.assertTrue(loginDashboardPage.isDisplayeddashboardLogoutLink());
        Assert.assertTrue(loginDashboardPage.isEnableddashboardLogoutLink());
    }

    @Then("The View All Events link appears on the Dashboard page and confirms it is active")
    public void theViewAllEventsLinkAppearsOnTheDashboardPageAndConfirmsItIsActive() {
        Assert.assertTrue(loginDashboardPage.isDisplayedviewAllEventsLink());
        Assert.assertTrue(loginDashboardPage.isEnabledviewAllEventsLink());
    }

    @Then("Account Balance links appear in the Dashboard body section and it is verified that it is active.")
    public void accountBalanceLinksAppearInTheDashboardBodySectionAndItIsVerifiedThatItIsActive() {
        Assert.assertTrue(loginDashboardPage.isDisplayedAccountBalancelinksk());
        Assert.assertTrue(loginDashboardPage.isEnabledAccountBalancelinks());
    }

    @Then("Pending Meetings links appear in the Dashboard body section and it is verified that it is active.")
    public void pendingMeetingsLinksAppearInTheDashboardBodySectionAndItIsVerifiedThatItIsActive() {
        Assert.assertTrue(loginDashboardPage.isDisplayedpendingMeetingsLink());
        Assert.assertTrue(loginDashboardPage.isEnabledpendingMeetingsLink());
    }

    @Then("Support Messages links appear in the Dashboard body section and it is verified that it is active.")
    public void supportMessagesLinksAppearInTheDashboardBodySectionAndItIsVerifiedThatItIsActive() {
        Assert.assertTrue(loginDashboardPage.isDisplayedsupportMessageslink());
        Assert.assertTrue(loginDashboardPage.isEnabledsupportMessageslink());
    }

    @Then("Monthly Sales links appear in the Dashboard body section and it is verified that it is active.")
    public void monthlySalesLinksAppearInTheDashboardBodySectionAndItIsVerifiedThatItIsActive() {
        Assert.assertTrue(loginDashboardPage.isDisplayedmonthlySaleslink());

    }

    @Then("Comments links appear in the Dashboard body section and it is verified that it is active.")
    public void commentsLinksAppearInTheDashboardBodySectionAndItIsVerifiedThatItIsActive() {
        Assert.assertTrue(loginDashboardPage.isDisplayedcommentsLink());
        Assert.assertTrue(loginDashboardPage.isEnabledcommentsLink());
    }

    @Then("I view current advertisements and detailed information on the notice board.")
    public void ıViewCurrentAdvertisementsAndDetailedInformationOnTheNoticeBoard() throws InterruptedException {
        Assert.assertTrue(loginDashboardPage.isDisplayednoticeboard());
    }

    @And("I click Settings Link on the Sidebar")
    public void iClickSettingsLinkOnTheSidebar() {
        loginDashboardPage.clickSettingsLinkOnSidebar();
    }

    @And("I click Meeting Link on the Dashboard Sidebar")
    public void iClickMeetingLinkOnTheDashboardSidebar() {
        loginDashboardPage.clickMeetingsLinkOnSidebar();
    }

    @Then("I can see the My reservations Link on the Sidebar")
    public void iCanSeeTheMyReservationsLinkOnTheSidebar() {
        Assert.assertTrue(loginDashboardPage.myReservationsLinkOnSidebar.isDisplayed());
    }

    @Then("I can see the Request Link on the Sidebar")
    public void iCanSeeTheRequestLinkOnTheSidebar() {
        Assert.assertTrue(loginDashboardPage.requestLinkOnSidebar.isDisplayed());
    }

    @Then("I can see the Settings Link on the Sidebar")
    public void iCanSeeTheSettingsLinkOnTheSidebar() {
        Assert.assertTrue(loginDashboardPage.settingsLinkOnSidebar.isDisplayed());
    }

    @When("I click My Reservations Link on the Sidebar")
    public void iClickMyReservationsLinkOnTheSidebar() {
        loginDashboardPage.clickMyReservationsLinkOnSidebar();
    }

    @When("I click More Info Button {int}")
    public void iClickMoreInfoButton(int index) {
        loginDashboardPage.clickMoreInfoButton(index);
    }

    @Then("I see the message of Noticeboard")
    public void iSeeTheMessageOfNoticeboard() {
        loginDashboardPage.isDisplayedNoticeboardMessage();
    }

    @Then("I can see the My Chart Grapphic")
    public void iCanSeeTheMyChartGrapphic() {
        loginDashboardPage.isDisplayedMyChart();
    }

    @And("I click on the Quizzes title in the Dashboard.")
    public void iClickOnTheQuizzesTitleInTheDashboard () {
        loginQuizzesPage.quizzesInDashboard.click();}

    @And("I click Completion Certificates link on Dashboard Sidebar")
    public void iClickCompletionCertificatesLinkOnDashboardSidebar() {
        loginDashboardPage.clickCompletionCertificatesLink();
    }

    @When("i click Certificates Link ond Dashboard Sidebar")
    public void iClickCertificatesLinkOndDashboardSidebar() {
        loginDashboardPage.clickCertificatesLink();
    }

    //<<<<<<<<<<<<<<<<<<<Arzu
    @Then("Verifies Instructors title is visible in the sidebar")
    public void verifiesInstructorsTitleIsVisibleInTheSidebar() {
        Assert.assertTrue(loginDashboardPage.dashboardInstructorLink.isDisplayed());
    }

    @When("Clicks on {string} link")
    public void clicksOnLink(String link) {loginDashboardPage.clickInstructorLink();}

    @Then("Verifies visibility and activity of Instructor Submenu")
    public void verifiesVisibilityAndActivityOfInstructorSubmenu() {
        Assert.assertTrue(loginDashboardPage.instructorNewLink.isDisplayed()&&loginDashboardPage.instructorNewLink.isEnabled());
        Assert.assertTrue(loginDashboardPage.instructorListLink.isDisplayed()&&loginDashboardPage.instructorListLink.isEnabled());
    }
    @When("Clicks on {string} submenu")
    public void clicksOnSubmenu(String newMenu) {
        loginDashboardPage.CreateNewInstructor();}

    @When("Clicks on {string} submenu link")
    public void clicksOnSubmenuLink(String listMenu) {
        loginDashboardPage.clickListLink();}

    @Then("Verifies {string} panel is displayed")
    public void verifiesPanelIsDisplayed(String string) {
        Assert.assertTrue(loginDashboardPage.listInstructorPanel.isDisplayed());}

    @Then("Validates and filters filter elements")
    public void validatesAndFiltersFilterElements() {
        loginDashboardPage.isEnabledFilterOption();}

    @When("Clicks {string} button")
    public void clicksButton(String string) {
        ReusableMethods.click(loginDashboardPage.showResult);
        Assert.assertTrue(Integer.parseInt(loginDashboardPage.FilterInstructorCount.getText()) > 0);
        System.out.println(loginDashboardPage.FilterInstructorCount.getText());
        //ReusableMethods.bekle(2);
    }

    @And("Select as from date {int} {string} and as to date {int} {string}")
    public void selectAsFromDateAndAsToDate(int day1, String month1, int day2, String month2) {
        loginDashboardPage.getFromDate2(day1,month1);
        loginDashboardPage.getToDate2(day2,month2);

    }

    @And("Select name {string} for instructor name")
    public void selectNameForInstructorName(String name) {
        loginDashboardPage.nameTextbox.sendKeys(name);
    }

    @And("If the Instructor page is empty click {string} link.")
    public void ıfTheInstructorPageIsEmptyClickLink(String newLink) {
        loginDashboardPage.verifyInstructorList();
    }
}
