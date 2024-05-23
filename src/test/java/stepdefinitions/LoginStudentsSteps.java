package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginStudentPage;

public class LoginStudentsSteps extends BaseStep{
    LoginStudentPage loginStudentsPage = new LoginStudentPage(driver);

    @And("I click Student Link on Sidebar")
    public void iClickStudentLinkOnSidebar() {
        loginStudentsPage.clickStudentLink();
    }

    @Then("I can see New link on Sidebar")
    public void iCanSeeNewLinkOnSidebar() {
        Assert.assertTrue(loginStudentsPage.isDisplayedNewLinkOnSidebar());
    }

    @Then("I can see List on Sidebar")
    public void iCanSeeListOnSidebar() {
        Assert.assertTrue(loginStudentsPage.isDisplayedListOnSidebar());
    }

    @Given("I click New link on Sidebar")
    public void iClickNewLinkOnSidebar() {
        loginStudentsPage.clickNewLinkOnSidebar();
    }

    @When("I click Save button for new Student register")
    public void iClickSaveButtonForNewStudentRegister() {
        loginStudentsPage.clickSaveLinkForNewRegister();
    }

    @Then("I see Request done successfully! message")
    public void iSeeRequestDoneSuccessfullyMessage() {
        Assert.assertTrue(loginStudentsPage.isDisplayedRequestDoneSuccesfullyText());
    }

    @And("I send information for new Student add")
    public void iSendInformationForNewStudentAdd() {
        loginStudentsPage.setFormforNewStudent();
    }

    @Given("I click List Link under The Students Sidebar")
    public void iClickListLinkUnderTheStudentsSidebar() {
        loginStudentsPage.clickListLinkUnderStudentOnSidebar();
    }
}
