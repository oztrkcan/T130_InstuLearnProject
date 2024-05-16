package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
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
}
