package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HeaderPage;
import utilities.TestData.TestDataBase;

public class HeaderPageSteps extends BaseStep{
        HeaderPage headerPage = new HeaderPage(driver);

    @When("i click My Profile icon on Header")
    public void iClickMyProfileIconOnHeader() {
        headerPage.clickProfileLogoInHeader();
    }

    @Then("i can see and click My Profile icon")
    public void iCanSeeAndClickMyProfileIcon() {
        Assert.assertTrue(headerPage.isDisplayedMyProfileLink());
        Assert.assertTrue(headerPage.isEnabledMyProfileLink());
    }

    @When("I click dashboard link on home page")
    public void ıClickDashboardLinkOnHomePage() {
        headerPage.clickDashboardLink();
    }

    @Then("I access dashboard page")
    public void ıAccessDashboardPage() {
        Assert.assertEquals(TestDataBase.dashboardPageUrl,driver.getCurrentUrl());
    }

    @Then("The Enable offline status button appears")
    public void theEnableOfflineStatusButtonAppears() {
        headerPage.activateOfflineStatusButton.isDisplayed();

    }

    @Then("Activate offline status button is active is verified")
    public void activateOfflineStatusButtonIsActiveIsVerified() {

          headerPage.activateOfflineStatusButton.click();
    }
}
