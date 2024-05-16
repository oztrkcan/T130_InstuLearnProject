package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HeaderPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.TestData.TestDataBase;

public class HomePageSteps extends BaseStep {
    LoginPage loginPage = new LoginPage(driver);
    HomePage homePage = new HomePage(driver);

    @Given("i m on Homepage as {string} with {string} email")
    public void iMOnHomepageAsWithEmail(String loginType, String person) {
        loginPage.getLoginrForEveryPerson(loginType,person);
        loginPage.clickHomeLinkInHeader();
    }

    @Given("I am on Home Page as a visitor")
    public void iAmOnHomePageAsAVisitor() {
        homePage.loadHomePage();
    }

    @Then("I can see Instructors on Home Page body")
    public void iCanSeeInstructorsOnHomePageBody() {
        Assert.assertTrue(homePage.isDisplayedInstructorsOnHomePage());
    }

    @When("I click on All Instructors Button")
    public void iClickOnAllInstructorsButton() {
        homePage.clickAllINstructorsButtonOnHomePage();
    }

    @Then("I access Intructors Page")
    public void iAccessIntructorsPage() {
        Assert.assertEquals(TestDataBase.instructorsPageUrl,driver.getCurrentUrl());
    }

    @Then("I can click slider cards of Instructor")
    public void iCanClickSliderCardsOfInstructor() {
        homePage.clickSliderCardOfInstructors();
    }

    @Then("I can see the rating score of Instrcotrs in the card")
    public void iCanSeeTheRatingScoreOfInstrcotrsInTheCard() {
        Assert.assertTrue(homePage.isDisplayedRatingOfScoreOfInstructors());
    }

    @Then("I can see the name Of Instructors in the card")
    public void iCanSeeTheNameOfInstructorsInTheCard() {
        Assert.assertTrue(homePage.isDisplayedNameOfInstructors());
    }

    @Then("I can see the Reserve a Meeting button in the card")
    public void iCanSeeTheReserveAMeetingButtonInTheCard() {
        Assert.assertTrue(homePage.isDisplayedReserveAMeetingForInstructors());
    }
    @When("I click the Reserve a meeting for Instructors in the card")
    public void iClickTheReserveAMeetingForInstructorsInTheCard() {
        homePage.clickReserveAMeeting();
    }



}
