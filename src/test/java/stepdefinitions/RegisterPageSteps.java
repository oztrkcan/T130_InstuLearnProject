package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.RegisterPage;
import utilities.ReusableMethods;
import utilities.TestData.TestDataBase;

public class RegisterPageSteps extends BaseStep{
    RegisterPage registerPage = new RegisterPage(driver);

    @Then("Displays the Register link in the home page and clicks.")
    public void displaysTheRegisterLinkInTheHomePageAndClicks() {
        Assert.assertTrue(registerPage.registerLinkDisplays());
        registerPage.registerLinkClicks();
    }

    @Then("Verifies that the opened page is the Register page.")
    public void verifiesThatTheOpenedPageIsTheRegisterPage() {
        Assert.assertTrue(registerPage.verifyRegisterpage());
    }

    @Then("Displays the image and signup form on the registration page")
    public void displaysTheImageAndSignupFormOnTheRegistrationPage() {
        registerPage.verifySignupFormInRegisterPage();
    }

    @When("i am register as a {string} with {string} email")
    public void iAmRegisterAsAWithEmail(String loginType, String person) {
        registerPage.validRegister(loginType,person);
    }

    @Then("Verifies that the opened page is the home page")
    public void verifiesThatTheOpenedPageIsTheHomePage() {
        String expectedUrl = TestDataBase.baseUrl;
        String actualData = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualData);
    }


    @Then("Verifies that it is not registered and gets an error message")
    public void verifiesThatItIsNotRegisteredAndGetsAnErrorMessage() {
        Assert.assertTrue(registerPage.displaysErrorMessage());
    }

    @When("Verifies that registration is not done without entering information")
    public void verifiesThatRegistrationIsNotDoneWithoutEnteringInformation() {
        registerPage.nonInformationRegister();
    }

    @And("select {string} as a Account Type")
    public void selectAsAAccountType(String type) {
        registerPage.selectAccontType(type);
        ReusableMethods.wait(3);
    }

    @Then("Verifies that you cannot be reached with a {string} name {string} and {string}")
    public void verifiesThatYouCannotBeReachedWithANameAnd(String name, String email, String password) {
        registerPage.tryRegister(email,name,password);
    }

    @Then("Verifies with valid information register")
    public void verifiesWithValidInformationRegister() {
        registerPage.fakeValidRegister();
    }

    @Then("Verifies that displays {string}")
    public void verifiesThatDisplaysLoginpage(String url) {
        Assert.assertEquals(url,driver.getCurrentUrl());
    }
}
