package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import pages.LoginPage;
import utilities.ReusableMethods;
import utilities.TestData.TestDataBase;

import java.util.ArrayList;
import java.util.List;

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
        Assert.assertTrue(homePage.allINstructorsButtonOnHomePage.isDisplayed());
    }

    @When("I click on All Instructors Button")
    public void iClickOnAllInstructorsButton() {
        ReusableMethods.click(homePage.allINstructorsButtonOnHomePage);
    }

    @Then("I access Intructors Page")
    public void iAccessIntructorsPage() {
        Assert.assertEquals(TestDataBase.instructorsPageUrl,driver.getCurrentUrl());
    }

    @Then("I can click slider cards of Instructor")
    public void iCanClickSliderCardsOfInstructor() {
        homePage.clickSlider(homePage.instructorSliderCards);
    }

    @Then("I can see the rating score of Instrcotrs in the card")
    public void iCanSeeTheRatingScoreOfInstrcotrsInTheCard() {
        Assert.assertTrue(homePage.ratingScoreOfInstructors.isDisplayed());
    }

    @Then("I can see the name Of Instructors in the card")
    public void iCanSeeTheNameOfInstructorsInTheCard() {
        Assert.assertTrue(homePage.nameOfINstructors.isDisplayed());
    }

    @Then("I can see the Reserve a Meeting button in the card")
    public void iCanSeeTheReserveAMeetingButtonInTheCard() {
        Assert.assertTrue(homePage.reserveaMeetingForInstructors.isDisplayed());
    }
    @When("I click the Reserve a meeting for Instructors in the card")
    public void iClickTheReserveAMeetingForInstructorsInTheCard() {
        ReusableMethods.click(homePage.reserveMeetings.getFirst());
    }

    @Then("verify Join as instructor section  is visible in the body section")
    public void verifyJoinAsInstructorSectionIsVisibleInTheBodySection() {
        Assert.assertTrue(homePage.isDisplayedJoinAsInstructorSection());
    }

    @When("Click on the Join as instructor section")
    public void clickOnTheJoinAsInstructorSection() {
        homePage.clickJoinAsInstructorSection();
    }

    @Then("Verifies accessed the login page in the Home Page")
    public void verifiesAccessedTheLoginPageInTheHomePage() {
        Assert.assertEquals(TestDataBase.loginPageUrl, driver.getCurrentUrl());
    }

    @Then("I see the title of the Store Products and Slider on the Home Page")
    public void iSeeTheTitleOfTheStoreProductsAndSliderOnTheHomePage() {
        Assert.assertTrue(homePage.storeProductsTitleText.isDisplayed());
        Assert.assertTrue(homePage.sliderOfStoreProducts.isDisplayed());
    }

    @Then("I see  price, like score, add to cart icon on product cards on the Home Page")
    public void iSeePriceLikeScoreAddToCartIconOnProductCardsOnTheHomePage() {
        Assert.assertTrue(homePage.sliderlist.getFirst().isDisplayed());
        Assert.assertTrue(homePage.likeProduct.getFirst().isDisplayed());
        Assert.assertTrue(homePage.priceOfProducts.getFirst().isDisplayed());
       Assert.assertTrue(homePage.isDisplayedHoverOnCard(homePage.allProduct,homePage.addToCartButton));
    }

    @Then("I click one of Add to Card Button in Store Product Cards")
    public void iClickOneOfAddToCardButtonInStoreProductCards() {
        homePage.clickAddToCard();
    }

    @And("I scroll the Store Product Cards On Home Page")
    public void iScrollTheStoreProductCardsOnHomePage() {
        ReusableMethods.scrollWithJs(homePage.storeProductsTitleText);
    }


}
