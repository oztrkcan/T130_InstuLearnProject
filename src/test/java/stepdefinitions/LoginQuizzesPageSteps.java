package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginQuizzesPage;
import utilities.ReusableMethods;

public class LoginQuizzesPageSteps extends BaseStep {

    LoginQuizzesPage loginQuizzesPage=new LoginQuizzesPage(driver);

    @Then("I click on the New quiz link under the Quizzes heading and go to the relevant page.")
    public void iClickOnTheNewQuizLinkUnderTheQuizzesHeadingAndGoToTheRelevantPage() {
        ReusableMethods.wait(2);
        loginQuizzesPage.newQuizInDashboard.click();
        ReusableMethods.wait(2);
    }

    @Then("I click on the List link under the Quizzes heading and go to the relevant page.")
    public void iClickOnTheListLinkUnderTheQuizzesHeadingAndGoToTheRelevantPage() {
        loginQuizzesPage.listInDashboard.click();
        ReusableMethods.wait(2);    }


    @Then("I click on the Results link under the Quizzes heading and go to the relevant page.")
    public void iClickOnTheResultsLinkUnderTheQuizzesHeadingAndGoToTheRelevantPage() {
        loginQuizzesPage.resultsInDashboard.click();
        ReusableMethods.wait(2);
    }


    @Then("I click on the My results link under the Quizzes heading and go to the relevant page.")
    public void iClickOnTheMyResultsLinkUnderTheQuizzesHeadingAndGoToTheRelevantPage() {
        loginQuizzesPage.myResultsInDashboard.click();
        ReusableMethods.wait(2);
    }


    @Then("I click on the Not Participated link under the Quizzes heading and go to the relevant page.")
    public void iClickOnTheNotParticipatedLinkUnderTheQuizzesHeadingAndGoToTheRelevantPage() {
        loginQuizzesPage.notParticipatedInDashboard.click();
        ReusableMethods.wait(2);
    }

    @Then("I fill {string} the Quiz title.")
    public void i_fill_the_quiz_title(String quizTitle) {
        loginQuizzesPage.quizTitleTextBox.sendKeys(quizTitle);
        ReusableMethods.wait(1);
    }

    @Then("I fill {string} the Time title.")
    public void i_fill_the_time_title(String time) {
        loginQuizzesPage.timeTextBox.sendKeys(time);
        ReusableMethods.wait(1);
    }

    @Then("I fill {string} the Number of attempts title.")
    public void i_fill_the_number_of_attempts_title(String attempt) {
        loginQuizzesPage.attemptTextBox.sendKeys(attempt);
        ReusableMethods.wait(1);
    }

    @Then("I fill {string} the Pass mark title.")
    public void i_fill_the_pass_mark_title(String passMark) {
        loginQuizzesPage.passmarkTextBox.sendKeys(passMark);
        ReusableMethods.wait(1);
    }

    @Then("I fill {string} the Expiry days title.")
    public void i_fill_the_expiry_days_title(String expiryDay) {
        loginQuizzesPage.expirydaysTextBox.sendKeys(expiryDay);
        ReusableMethods.wait(1);
    }

    @Then("I click the Display questions randomly button.")
    public void i_click_the_display_questions_randomly_button() {
        loginQuizzesPage.quizButton1.click();
        ReusableMethods.wait(1);
    }

    @Then("I click the Certificate included button.")
    public void i_click_the_certificate_included_button() {
        loginQuizzesPage.quizButton2.click();
        ReusableMethods.wait(1);
    }
    @Then("I click the Active quiz button.")
    public void i_click_the_active_quiz_button() {
        loginQuizzesPage.quizButton3.click();
        ReusableMethods.wait(1);
    }
    @Then("I click the Create button.")
    public void i_click_the_create_button() {
        loginQuizzesPage.createButton.click();
        ReusableMethods.wait(1);
    }
    @Then("I click the Save button.")
    public void i_click_the_save_button() {
        ReusableMethods.scrollWithJs(loginQuizzesPage.saveButton);
        ReusableMethods.wait(1);
        loginQuizzesPage.saveButton.click();
        ReusableMethods.wait(1);
    }
    @When("I verify the text Item added successfully.")
    public void i_verify_the_text_item_added_successfully() {
        Assert.assertTrue(loginQuizzesPage.successfullyText.isDisplayed());
    }

}
