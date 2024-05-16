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
}