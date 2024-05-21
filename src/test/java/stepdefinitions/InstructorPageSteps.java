package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.InstructorsPage;

public class InstructorPageSteps extends BaseStep{
    InstructorsPage instructorsPage = new InstructorsPage(driver);



    @And("I reserve a Day and time which is not disabled")
    public void iReserveADayAndTimeWhichIsNotDisabled() {
        instructorsPage.clickDayOnTableforReserveMeeting();
    }


    @And("I select {string} of meeting")
    public void iSelectOfMeeting(String type) {
        instructorsPage.clickTypeOfMeeting(type);
    }

    @And("I enter Description for Reserve Meeting")
    public void iEnterDescriptionForReserveMeeting() {
        instructorsPage.sendDescriptionForReserveMeeting();
    }

    @And("I click Group Meetings checkbox")
    public void iClickGroupMeetingsCheckbox() {
        instructorsPage.clickGroupMeetingCheckbox();
    }


    @And("I click Students Count in the capasities")
    public void iClickStudentsCountInTheCapasities() {
        instructorsPage.clickPaticiptesElementDrop();
    }

    @When("I click Reserve a Meeting Button")
    public void iClickReserveAMeetingButton() {
        instructorsPage.clickReserveAMeetingButton();
    }

    @Then("i see sucsessull message for Reserve a meeting")
    public void iSeeSucsessullMessageForReserveAMeeting() {
        Assert.assertFalse( instructorsPage.isDisplayedrequestFailedText());

    }


}
