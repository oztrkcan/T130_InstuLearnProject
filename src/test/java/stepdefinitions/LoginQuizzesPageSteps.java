package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginQuizzesPage;
import utilities.ReusableMethods;

public class LoginQuizzesPageSteps extends BaseStep {

    LoginQuizzesPage loginQuizzesPage=new LoginQuizzesPage(driver);

    @Then("Click on the New quiz link under the Quizzes heading and go to the relevant page.")
    public void clickOnTheNewQuizLinkUnderTheQuizzesHeadingAndGoToTheRelevantPage() {
        ReusableMethods.wait(2);
        loginQuizzesPage.newQuizInDashboard.click();
        ReusableMethods.wait(2);
    }

    @Then("Click on the List link under the Quizzes heading and go to the relevant page.")
    public void clickOnTheListLinkUnderTheQuizzesHeadingAndGoToTheRelevantPage() {
        loginQuizzesPage.listInDashboard.click();
        ReusableMethods.wait(2);    }


    @Then("Click on the Results link under the Quizzes heading and go to the relevant page.")
    public void clickOnTheResultsLinkUnderTheQuizzesHeadingAndGoToTheRelevantPage() {
        loginQuizzesPage.resultsInDashboard.click();
        ReusableMethods.wait(2);
    }


    @Then("Click on the My results link under the Quizzes heading and go to the relevant page.")
    public void clickOnTheMyResultsLinkUnderTheQuizzesHeadingAndGoToTheRelevantPage() {
        loginQuizzesPage.myResultsInDashboard.click();
        ReusableMethods.wait(2);
    }


    @Then("Click on the Not Participated link under the Quizzes heading and go to the relevant page.")
    public void clickOnTheNotParticipatedLinkUnderTheQuizzesHeadingAndGoToTheRelevantPage() {
        loginQuizzesPage.notParticipatedInDashboard.click();
        ReusableMethods.wait(2);
    }

    @Then("Fill {string} the Quiz title.")
    public void fill_the_quiz_title(String quizTitle) {
        loginQuizzesPage.quizTitleTextBox.sendKeys(quizTitle);
        ReusableMethods.wait(1);
    }

    @Then("Fill {string} the Time title.")
    public void fill_the_time_title(String time) {
        loginQuizzesPage.timeTextBox.sendKeys(time);
        ReusableMethods.wait(1);
    }

    @Then("Fill {string} the Number of attempts title.")
    public void fill_the_number_of_attempts_title(String attempt) {
        loginQuizzesPage.attemptTextBox.sendKeys(attempt);
        ReusableMethods.wait(1);
    }

    @Then("Fill {string} the Pass mark title.")
    public void fill_the_pass_mark_title(String passMark) {
        loginQuizzesPage.passmarkTextBox.sendKeys(passMark);
        ReusableMethods.wait(1);
    }

    @Then("Fill {string} the Expiry days title.")
    public void fill_the_expiry_days_title(String expiryDay) {
        loginQuizzesPage.expirydaysTextBox.sendKeys(expiryDay);
        ReusableMethods.wait(1);
    }

    @Then("Click the Display questions randomly button.")
    public void click_the_display_questions_randomly_button() {
        loginQuizzesPage.quizButton1.click();
        ReusableMethods.wait(1);
    }

    @Then("Click the Certificate included button.")
    public void click_the_certificate_included_button() {
        loginQuizzesPage.quizButton2.click();
        ReusableMethods.wait(1);
    }
    @Then("Click the Active quiz button.")
    public void click_the_active_quiz_button() {
        loginQuizzesPage.quizButton3.click();
        ReusableMethods.wait(1);
    }
    @Then("Click the Create button.")
    public void click_the_create_button() {
        loginQuizzesPage.createButton.click();
        ReusableMethods.wait(1);
    }
    @Then("Click the Save button.")
    public void click_the_save_button() {
        ReusableMethods.scrollWithJs(loginQuizzesPage.saveButton);
        ReusableMethods.wait(1);
        loginQuizzesPage.saveButton.click();
        ReusableMethods.wait(1);
    }
    @When("Verify the text Item added successfully.")
    public void verify_the_text_item_added_successfully() {
        Assert.assertTrue(loginQuizzesPage.successfullyText.isDisplayed());
    }

}
