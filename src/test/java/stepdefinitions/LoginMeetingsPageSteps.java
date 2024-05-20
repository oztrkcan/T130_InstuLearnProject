package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginMeetingPage;
import utilities.ReusableMethods;
import utilities.TestData.TestDataBase;

public class LoginMeetingsPageSteps extends BaseStep{

    LoginMeetingPage loginMeetingPage = new LoginMeetingPage(driver);

    @Then("I see the title of 'Meeting statistics")
    public void iSeeTheTitleOfMeetingStatistics() {
        Assert.assertTrue(loginMeetingPage.meetingStatisticText.isDisplayed());
    }

    @And("I send date {string} as a from and {string}  as a to")
    public void iSendDateAsAFromAndAsATo(String fromDate, String toDAte) {
        loginMeetingPage.sendKeysFromDate(fromDate);
        loginMeetingPage.sendKeysToDate(toDAte);
    }

    @And("I select a {string} , {string} , {string} for filter Meetings")
    public void iSelectAForFilterMeetings(String day, String instructor, String status) {
        loginMeetingPage.selectDayDropdown(day);
        loginMeetingPage.selectInstructorDropdown(instructor);
        loginMeetingPage.selectStatusDropdown(status);
    }

    @And("I can click Show only open meetings checkbox")
    public void iCanClickShowOnlyOpenMeetingsCheckbox() {
        loginMeetingPage.clickShowOnlyOpenMeetingCheckbox();
    }

    @When("I click Reques Link on the Sidebar")
    public void iClickRequesLinkOnTheSidebar() {
        loginMeetingPage.clickRequestLinkOnSidebar();
    }

    @And("I select a {string} , {string} for filter Request")
    public void iSelectAForFilterRequest(String day, String status) {
        loginMeetingPage.selectDayDropdown(day);
        loginMeetingPage.selectStatusDropdown(status);
    }

    @And("I click toggle Dropdown Menu the {int} one and click Add Time Button on Settings")
    public void iClickToggleDropdownMenuTheOneAndClickAddTimeButtonOnSettings(int index) {
        loginMeetingPage.clickToggleButtonOnSettings(index);
    }

    @And("I click Am-Pm checkbox")
    public void iClickAmPmCheckbox() {
        loginMeetingPage.clickAmPMCheckox();
    }


    @And("I set the time ab {string} to {string} for the meeting")
    public void iSetTheTimeAbToForTheMeeting(String ab, String to) {
        loginMeetingPage.setTime(ab);
        loginMeetingPage.setTime(to);
    }

    @And("I send a {string} descripton for meeting")
    public void iSendADescriptonForMeeting(String description) {
        loginMeetingPage.sendDescriptionForMeeting(description);
    }

    @When("I click Save button")
    public void iClickSaveButton() {
        loginMeetingPage.clickSaveButton();
    }

}
