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

    @Then("I see the product On the Shopping Card logo at the Header")
    public void iSeeTheProductOnTheShoppingCardLogoAtTheHeader() {
        Assert.assertTrue(headerPage.productCountOfAtTheCard.isDisplayed());
    }

    @Then("I see Categories link on Header")
    public void iSeeCategoriesTitleOnHeader() {
        Assert.assertTrue(headerPage.isDisplayedCategoriesLInk());
    }

    @Then("I see  Home link on Header")
    public void iSeeHomeLinkOnHeader() {
        Assert.assertTrue(headerPage.homeLInk.isDisplayed());
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
        Assert.assertTrue(headerPage.isDisplayedActivateButton());
    }

    @Then("Activate offline status button is active is verified")
    public void activateOfflineStatusButtonIsActiveIsVerified() {

        Assert.assertTrue(headerPage.isEnabledActivateButton());
    }

    @When("I click Categories Link on the Header")
    public void iClickCategoriesLinkOnTheHeader() {
        headerPage.clickCategoriesLinkOnHedaer();
    }

    @Then("I see the Development Link on the Header")
    public void iSeeTheDevelopmentLinkOnTheHeader() {
        headerPage.isDisplayedDevelopmentHeader();
    }

    @When("I click Home Link on Header")
    public void iClickHomeLinkOnHeader() {
        headerPage.clickHomeLinkInHeader();
    }

    @Then("I see the Url {string}")
    public void iSeeTheUrl(String url) {
        Assert.assertEquals(url, driver.getCurrentUrl());
    }

    @When("I click Courses Link on Header")
    public void iClickCoursesLinkOnHeader() {
        headerPage.clickCoursesLinkOnHeader();
    }
}
