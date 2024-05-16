package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginMyProfilePage;


public class LoginMyProfilePageSteps extends BaseStep{
    LoginMyProfilePage loginMyProfilePage = new LoginMyProfilePage(driver);

    @Then("i can see My Profile page")
    public void iCanSeeMyProfilePage() {
        Assert.assertTrue(loginMyProfilePage.isDisplayedProfileName());
    }


    @Given("i m on My Profile Page with my {string} email")
    public void iMOnMyProfilePageWithMyEmail(String email) {
      loginMyProfilePage.getLogin(email);
      loginMyProfilePage.clickMyProfileLinkOnDashboardSidebar();
    }

    @Then("i can click About link and see about me")
    public void iCanClickAboutLinkAndSeeAboutMe() {
        loginMyProfilePage.clickAboutOnMyProfileLink();
    }

    @Then("i can click Courses Link and see Courses")
    public void iCanClickCoursesLinkAndSeeCourses() {
        loginMyProfilePage.clickCoursesOnMyProfileLink();
    }

    @Then("i can click Badges link and see Badges")
    public void iCanClickBadgesLinkAndSeeBadges() {
        loginMyProfilePage.clickArticlesOnMyProfileLink();
    }

    @Then("i can click Articles link and see Articles")
    public void iCanClickArticlesLinkAndSeeArticles() {
        loginMyProfilePage.clickBadgesOnMyProfileLink();
    }

    @Then("can click Reserve Meeting and see Reserve meetings")
    public void canClickReserveMeetingAndSeeReserveMeetings() {
        loginMyProfilePage.clickReserveAMeetingOnMyProfileLink();
    }

}
