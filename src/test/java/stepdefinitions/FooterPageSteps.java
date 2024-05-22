package stepdefinitions;

import driver.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FooterPage;

public class FooterPageSteps extends BaseStep{

    FooterPage footerPage = new FooterPage(driver);


    // US_018 ///////////////////////////////////////////////////////////////////////////////

    @Then("Verifies visibility of {string} link in footer section and clicks")
    public void verifiesVisibilityOfLinkInFooterSectionAndClicks(String additionalLinks) {
        footerPage.clicksAdditionalLinks(additionalLinks);

    }

    @When("Verifies that the opened page is the relevant {string}")
    public void verifiesThatTheOpenedPageIsTheRelevant(String url) {
        footerPage.urlAssertion(url);
    }

    @And("goes down to the footer section of the page")
    public void goesDownToTheFooterSectionOfThePage() {
        footerPage.scrollToFooter();
    }

    @Then("Verifies that displays social media icons and other icons")
    public void verifiesSocialMediaIcons() {
        footerPage.sacialMediaIconsVerifies();
    }

    @Then("Verifies that a newsletter subscription has been created")
    public void verifiesThatANewsletterSubscriptionHasBeenCreated() {
        footerPage.verifiesNewsletterSubscribe();
    }
}
