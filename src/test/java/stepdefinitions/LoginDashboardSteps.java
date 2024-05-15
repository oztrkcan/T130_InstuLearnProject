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
}
