package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginDashboardPage;

import static utilities.ReusableMethods.scrollToElementWithAction;

public class LoginDashboardSteps extends BaseStep{
    LoginDashboardPage loginDashboardPage = new LoginDashboardPage(driver);
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
        scrollToElementWithAction(loginDashboardPage.noticeboard);
        Assert.assertTrue(loginDashboardPage.isDisplayednoticeboard());
        loginDashboardPage.click(loginDashboardPage.noticeboardMoreInfoButton1);






    @When("I click Meeting Link on the Dashboard Sidebar")
    public void iClickMeetingLinkOnTheDashboardSidebar() {
        loginDashboardPage.clickMeetingsLinkOnSidebar();
    }

    @Then("I can see the My reservations Link on the Sidebar")
    public void iCanSeeTheMyReservationsLinkOnTheSidebar() {
        Assert.assertTrue(loginDashboardPage.meetingsLinkOnSidebar.isDisplayed());
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


    @When("I click Settings Link on the Sidebar")
    public void iClickSettingsLinkOnTheSidebar() {
        loginDashboardPage.clickSettingsLinkOnSidebar();

    }
}
