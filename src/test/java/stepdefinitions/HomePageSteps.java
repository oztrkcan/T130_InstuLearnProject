package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.HeaderPage;
import pages.LoginPage;

public class HomePageSteps extends BaseStep {
    LoginPage loginPage = new LoginPage(driver);
    HeaderPage headerPage = new HeaderPage(driver);

    @Given("i m on Homepage as {string} with {string} email")
    public void iMOnHomepageAsWithEmail(String loginType, String person) {
        loginPage.getLoginrForEveryPerson(loginType,person);
        headerPage.clickHomeLinkInHeader();
    }
}
