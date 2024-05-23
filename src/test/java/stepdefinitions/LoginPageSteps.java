package stepdefinitions;

import driver.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import utilities.TestData.TestDataBase;

public class LoginPageSteps extends BaseStep{

    LoginPage loginPage = new LoginPage(driver);

    @Given("i click on login link on Login page")
    public void iClickOnLoginLinkOnLoginPage() {
        loginPage.loadHomePage();
        loginPage.clickLoginLinkInHeader();
    }

    @And("i enter {string} for login")
    public void iEnterForLogin(String email) {
        loginPage.enterEmailForLogin(email);
    }

    @And("i enter {string} password for login")
    public void iEnterPasswordForLogin(String password) {
        loginPage.enterPasswordForLogin(password);
    }

    @When("i click on the login Button for login")
    public void iClickOnTheLoginButtonForLogin() {
        loginPage.clickLoginButtonForLogin();
    }

    @Then("i must be login")
    public void iMustBeLogin() {
        Assert.assertEquals(driver.getCurrentUrl(), TestDataBase.dashboardPageUrl);
    }

    @Given("i m on Dashboard with {string} email")
    public void iMOnDashboardWithEmail(String email) {
        loginPage.getLogin(email);
    }


    @Given("i m on Dashboard as a {string} with {string} email")
    public void iMOnDashboardAsAWithEmail(String loginType, String person) {
    loginPage.getLoginrForEveryPerson(loginType,person);
    }
    //Arzu
    @Given("i m on Dashboard with organization {string} email")
    public void iMOnDashboardWithorganizationEmail(String email) {
        loginPage.getLoginOrganization(email);
    }
}
