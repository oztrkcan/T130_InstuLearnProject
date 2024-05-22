package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginSupportPage;

public class LoginSupportPageSteps extends BaseStep{

    LoginSupportPage loginSupportPage=new LoginSupportPage(driver);

    @Then("verify visibility and clickability {string}")
    public void verify_visibility_and_clickability(String supportLink) {
        Assert.assertTrue(loginSupportPage.DashboardSupportMenu.isDisplayed());
        Assert.assertTrue(loginSupportPage.DashboardSupportMenu.isEnabled());
        loginSupportPage.DashboardSupportMenu.click();

    }

    @Then("Verifies the visibility and activation of the {string}")
    public void verifiesTheVisibilityAndActivationOfThe(String submenu) {
        Assert.assertTrue(loginSupportPage.supportNewLink.isEnabled()&& loginSupportPage.supportNewLink.isDisplayed());
        Assert.assertTrue(loginSupportPage.supportCoursesSupportLink.isEnabled()&& loginSupportPage.supportCoursesSupportLink.isDisplayed());
        Assert.assertTrue(loginSupportPage.supportTicketLink.isEnabled()&& loginSupportPage.supportTicketLink.isDisplayed());}

    @When("Click submenu of support {string} and verify new support created")
    public void clickSubmenuOfSupportandverifynewsupportcreated(String menu) {
        loginSupportPage.clickSubMenuNewOption();}

    @When("Click {string} from submenu")
    public void clickFromSubmenu(String arg0) {
        loginSupportPage.clickCoursesSupportSubMenu();
    }
    @Then("Verify summary support panel")
    public void verifySummarySupportPanel() {
        loginSupportPage.verifySummarySupportPanel();
    }

    @And("Select other filter option and click {string}")
    public void selectOtherFilterOptionAndClick(String button) {
        loginSupportPage.filteringWithOtherData();}

    @When("Click {string} from submenu of Support")
    public void clickFromSubmenuOfSupport(String newSubMenu) {
        loginSupportPage.clickNewSubMenu();
    }

    @Then("Verify visibility of ticket message title")
    public void verifyVisibilityOfTicketMessageTitle() {
        loginSupportPage.verifyVisibilityOfTicketMessageList();
    }

    @When("Click on the message,write reply message and display the reply message")
    public void clickOnTheMessageWriteReplyMessageAndDisplayTheReplyMessage() {
        loginSupportPage.writeAndViewReplyMessage();
    }
}
