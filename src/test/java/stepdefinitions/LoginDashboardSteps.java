package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginDashboardPage;

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
