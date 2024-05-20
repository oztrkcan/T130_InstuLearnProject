package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
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

    @Given("visitor tests for the {string} text visibility displayed in the body section")
    public void visitor_tests_for_the_text_visibility_displayed_in_the_body_section(String givenText) {
        Assert.assertEquals(givenText,homePage.subscribeNowText.getText());
        Assert.assertTrue(homePage.isDisplayedSubscribeNowText());
    }

    @Given("displays the {string} subscription option under Subscribe Now! menu")
    public void displays_the_under_subscribe_now_menu(String string) {
        switch (string) {
            case "Bronze" -> Assert.assertTrue(homePage.isDisplayedBronzeSubscriptionText());
            case "Gold" -> Assert.assertTrue(homePage.isDisplayedGoldSubscriptionText());
            case "Silver" -> Assert.assertTrue(homePage.isDisplayedSilverSubscriptionText());
        }
    }


    @Then("I see the title of Home Page {string}")
    public void iSeeTheTitleOfHomePage(String title) {
        Assert.assertEquals(title, driver.getTitle());
    }

    @Then("I see Search Box  on Home Page body")
    public void iSeeSearchBoxOnHomePageBody() {
        Assert.assertTrue(homePage.searchBoxHomePageBody.isDisplayed());
    }

    @When("I enter a {string} at the Search box")
    public void iEnterAAtTheSearchBox(String text) {
        homePage.sendKeysSearchBoxHomePageBody(text);
    }

    @And("I click Search Button")
    public void iClickSearchButton() {
        homePage.clickSearchButton();
    }

    @Then("I see the results of my search {string}")
    public void iSeeTheResultsOfMySearch(String text) {
        Assert.assertTrue(homePage.searchResultText.getText().contains(text));
    }

    @When("I click All Product Button on Home Page")
    public void iClickAllProductButtonOnHomePage() {
        homePage.clickAllProductButton();
    }

    @Then("I see the {string} url")
    public void iSeeTheUrl(String url) {
        Assert.assertEquals(url,driver.getCurrentUrl());
    }

    @Then("I click {string} one of the newest course")
    public void iClickOneOfTheNewestCourse(String text) {
        homePage.clickWithTextOnCard(homePage.neweztCourseSlider,homePage.newestCourseNames, text);
    }

    @And("I scroll the Newest Course Cards On Home Page")
    public void iScrollTheNewestCourseCardsOnHomePage() {
        ReusableMethods.scrollWithJs(homePage.newestCourseTitle);
    }

    @Then("I should see the Earn Club Points On Home Page")
    public void iScrollTheEarnClubPointsOnHomePage() {
        ReusableMethods.scrollWithJs(homePage.earnClubPointsText);
        Assert.assertTrue(homePage.earnClubPointsText.isDisplayed());
        ReusableMethods.wait(2);
    }

    @Then("I should see the Rewards Button On Home Page And Click")
    public void iScrollTheRewardsButtonOnHomePageAndClick() {
        ReusableMethods.scrollWithJs(homePage.earnClubPointsText);
        ReusableMethods.wait(2);
        Assert.assertTrue(homePage.rewardsButton.isDisplayed());
        homePage.rewardsButton.click();
        ReusableMethods.wait(2);
    }

    @Then("I should see the Points Club Button On Home Page And Click")
    public void iScrollThePointsClubButtonOnHomePageAndClick() {
        ReusableMethods.scrollWithJs(homePage.earnClubPointsText);
        ReusableMethods.wait(2);
        Assert.assertTrue(homePage.pointsClubButton.isDisplayed());
        homePage.pointsClubButton.click();
    }

    @Then("I should see the Discount Coupon On Home Page And Click")
    public void iScrollTheDiscountCouponOnHomePageAndClick() {
        ReusableMethods.scrollWithJs(homePage.earnClubPointsText);
        ReusableMethods.wait(2);
        Assert.assertTrue(homePage.discountCoupon.isDisplayed());
        homePage.discountCoupon.click();
    }
}
