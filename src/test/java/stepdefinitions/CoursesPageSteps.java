package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CoursesPage;

public class CoursesPageSteps extends BaseStep{

    CoursesPage coursesPage = new CoursesPage(driver);

    @Then("Verifies and clicks the visibility of the {string} link under the {string} heading in the dashboard sidebar")
    public void verifies_and_clicks_the_visibility_of_the_link_under_the_heading_in_the_dashboard_sidebar(String title, String smallTitle) {
        coursesPage.displayAndClickTitle(title);
        coursesPage.displayAndClickSmallTitle(smallTitle);
    }

    //////////// The subtitle of the COURSES link is NEW //////////////////
    @When("Choose the Course Type {string}")
    public void chooseTheCourseType(String courseType) {
        coursesPage.chooseToCourseType(courseType);
    }

    @When("Validates the elements in the new page")
    public void verifiesElement() {
        coursesPage.verifiesElementInNewPage();
    }

    @Then("Verifies that the desired {string} has been entered in the Description text-box")
    public void verifiesThatTheDesiredHasBeenEnteredInTheDescriptionTextBox(String text) {
        coursesPage.writeToDescription(text);
    }

    @Then("Enters {string} into the Title text box")
    public void entersIntoTheTitleTextBox(String text) {
        coursesPage.writeToTitle(text);
    }

    @Then("Uploads {string} to thumbnail box")
    public void uploadsImagesToThumbnailBox(String photo) {
        coursesPage.dowloadImageToThumbnail(photo);
    }

    @Then("Uploads {string} to Cover Image box")
    public void uploadsToCoverImageBox(String photo) {
        coursesPage.dowloaImageToCover(photo);
    }

    @Then("Enters {string} into the Description textbox")
    public void entersIntoTheDescriptionTextbox(String text) {
        coursesPage.enterTextToDescription(text);
    }

    @And("Verifies that displays and effective buttons in basic information page")
    public void verifiesThatDisplaysAndEffectiveButton() {
        coursesPage.verifiesButtonsInNewPage();
    }

    @And("scrolls to the bottom of the page")
    public void scrollsToTheBottomOfThePage() {
        coursesPage.scrollToPreviousButton();
    }

    @And("Clicks the {string} button")
    public void clicksTheButton(String clickButton) {
        coursesPage.clicksButtonsInNewPage(clickButton);
    }

    @Then("Enters that {string} students in the capacity box")
    public void entersThatStudentsInTheCapacityBox(String numberOfStudents) {
        coursesPage.enterCapacityBox(numberOfStudents);
    }

    @And("Enters that {string} duration")
    public void entersThatDuration(String minutes){
        coursesPage.enterDuration(minutes);
    }

    @Then("Verifies that displays and effective floating buttons in extra information page")
    public void verifiesThatDisplaysAndEffectiveFloatingButtonsInExtraInformationPage() {
        coursesPage.verifiesFloatingButtonInExtraInformation();
    }

    @Then("Enters {string} in the Tagbox")
    public void entersInTheTagbox(String tag) {
        coursesPage.entersTagText(tag);
    }

    @When("Choose the Category {string}")
    public void chooseTheCategory(String category) {
        coursesPage.selectCategory(category);
    }

    @Then("Verifies that displays and effective buttons in pricing page")
    public void verifiesThatDisplaysAndEffectiveButtonsInPricingPage() {
        coursesPage.verifiesButtonInPricingPage();
    }

    @Then("{string} in the Access Period Box, {string} in the Price Box, and {string} in the Organization Price Box is entred.")
    public void inTheAccessPeriodBoxInThePriceBoxAndInTheOrganizationPriceBoxIsEntred(String accessTime, String normalPrice, String organizationPrice) {
        coursesPage.entersPricingInformation(accessTime,normalPrice,organizationPrice);
    }

    @Then("Adds section {string} from the content page")
    public void addsSectionFromTheContentPage(String sectionTitle) {
        coursesPage.verifiesContentPage(sectionTitle);
    }

    @Then("Verfies prerequisites page")
    public void verfiesPrerequisitesPage() {
        coursesPage.verifiesPrerequisitePage();
    }

    @Then("Verifies FQA page")
    public void verifiesFQAPage() {
        coursesPage.verifiesFQAPage();
    }

    @Then("Verifies Quiz & Certification page")
    public void verifiesQuizCertificationPage() {
        coursesPage.verifiesQuizPage();
    }

    //////////// The subtitle of the COURSES link is MY COURSES //////////////////
    @When("Verifies the visibility of opened courses in My courses page")
    public void verifiesTheVisibilityOfOpenedCourses() {
        coursesPage.verifiesMyCoursesPage();
    }

    //////////// The subtitle of the COURSES link is INVITED COURSES //////////////////
    @When("Verifies the visibility of not opened courses")
    public void verifiesTheVisibilityOfNotOpenedCourses() {
        coursesPage.verifiesInvitedCoursesPage();
    }

    //////////// The subtitle of the COURSES link is MY PURCHASES //////////////////
    @When("Verifies the visibility of opened courses in My purchases")
    public void verifiesTheVisibilityOfOpenedCoursesInMyPurchases() {
        coursesPage.verifiesMyPurchasesPage();
    }

    //////////// The subtitle of the COURSES link is MY COURSE COMMENTS //////////////////
    @When("Validates elements on the page")
    public void validatesElementsOnThePage() {
        coursesPage.verifiesElementInMyCourseCommentPage();
    }

    @Then("Selects the start {string} and end {string} date")
    public void selectsTheStartAndEndDate(String from, String to) {
        coursesPage.selectsDate(from,to);
    }

    @Then("Enters user {string} and course {string} does filtering")
    public void entersUserAndDoesFiltering(String userName,String courseName) {
        coursesPage.entersUserAndCourseForFiltring(userName,courseName);
    }

    @When("Verifies visibility of comments in the {string}")
    public void verifiesVisibilityOfCommentsInTheMyCourseComments() {
        coursesPage.verifiesComments();
    }
}
