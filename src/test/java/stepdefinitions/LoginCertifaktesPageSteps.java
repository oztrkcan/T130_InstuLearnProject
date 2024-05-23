package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginCertifikatesPage;
import utilities.ReusableMethods;


public class LoginCertifaktesPageSteps extends BaseStep{

    LoginCertifikatesPage loginCertifikatesPage = new LoginCertifikatesPage(driver);


    @Then("I see Achivement Link on Dashboard Sidebar")
    public void iSeeAchivementLinkOnDashboardSidebar() {
        Assert.assertTrue(loginCertifikatesPage.isDisplayedAchvimnetLinkOnSidabar());
    }

    @Then("I see Certificate Validation Link on Dashboard Sidebar")
    public void iSeeCertificateValidationLinkOnDashboardSidebar() {
        Assert.assertTrue(loginCertifikatesPage.certificateValidationLinkOnSidebar.isDisplayed());
    }

    @Then("I see Completion Certificates Link on Dashboard Sidebar")
    public void iSeeCompletionCertificatesLinkOnDashboardSidebar() {
        Assert.assertTrue(loginCertifikatesPage.completionCertificatesLinkOnSidebar.isDisplayed());
    }

    @And("I click Achivement link on Dashboard Sidebar")
    public void iClickAchivementLinkOnDashboardSidebar() {
        loginCertifikatesPage.clickAchivementsLinkOnSidebar();
    }

    @Then("I see My certificates statistics title on the page")
    public void iSeeMyCertificatesStatisticsTitleOnThePage() {
        Assert.assertTrue(loginCertifikatesPage.myCertificatesStatisticsTitle.isDisplayed());
    }


    @And("I select as from date {string} and as to date {string}")
    public void iSelectAsFromDateAndAsToDate(String fromDate, String toDate) {
        loginCertifikatesPage.getFromDate(fromDate);
        loginCertifikatesPage.getToDate(toDate);
    }

    @And("I select {string} for course on the Course Dropdown")
    public void iSelectForCourseOnTheCourseDropdown(String courseType) {
        loginCertifikatesPage.selectCourseType(courseType);
    }

    @When("I click Show Result")
    public void iClickShowResult() {
        loginCertifikatesPage.clickShowResult();
    }

    @Then("I see the Results of Certificates")
    public void iSeeTheResultsOfCertificates() {
        Assert.assertFalse(loginCertifikatesPage.youHaveNoCertificateText.isDisplayed());
    }

    @When("I click toggle Dropdown Menu")
    public void iClickToggleDropdownMenu() {
        loginCertifikatesPage.clickDropdownToogle();
    }

    @Then("I can see the my Certificate")
    public void iCanSeeTheMyCertificate() {
        ReusableMethods.switchToWindow(1);
        Assert.assertTrue(driver.getCurrentUrl().contains("showCertificate"));
    }

    @When("I click Open Button")
    public void iClickOpenButton() {
        loginCertifikatesPage.clickOpenButton();
    }

    @Then("I see the Course Of My Ceriticates")
    public void iSeeTheCourseOfMyCeriticates() {
        Assert.assertFalse(loginCertifikatesPage.isDisplayedyouHaveNoCertificates());
    }
    @Then("I can see the Certificate Statistics")
    public void iCanSeeTheCertificateStatistics() {
        Assert.assertTrue(loginCertifikatesPage.isDisplayedCertificateStatistics());
    }
    @When("I click Show Result for Certificates List")
    public void iClickShowResultForCertificatesList() {
        loginCertifikatesPage.clickShowResult();
    }

    @Then("I can see the list Of Certificates")
    public void iCanSeeTheListOfCertificates() {
        Assert.assertFalse(loginCertifikatesPage.isDisplayedListOfCertificates());
    }

    @When("I click Certificates Validation Link on Sidebar")
    public void iClickCertificatesValidationLinkOnSidebar() {
        loginCertifikatesPage.clickCertificateValidationLink();
    }

    @Then("I can see the Certificate Validation title on the page")
    public void iCanSeeTheCertificateValidationTitleOnThePage() {
        Assert.assertTrue(loginCertifikatesPage.isDisplayedCertificateValidation());
    }


    @Then("I send Id {string} for Certificate validation")
    public void iSendIdForCertificateValidation(String id) {
        loginCertifikatesPage.sendIdForValidation(id);
    }

}
