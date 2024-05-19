package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HeaderPage;

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
}
