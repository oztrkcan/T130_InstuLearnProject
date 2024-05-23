package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ReusableMethods;

import java.security.cert.X509Certificate;
import java.util.List;

public class LoginCertifikatesPage extends LoginPage{
    public LoginCertifikatesPage(WebDriver driver) {
        super(driver);
    }

    ///////////////////////////////////----------------List-----------////////////////////////////////////////////////
    // No Certificates Text
    @FindBy(className = "text-dark-blue")
    public WebElement noCertificatesText;
    public boolean isDisplayedListOfCertificates() {
        waitForVisibility(noCertificatesText);
        return noCertificatesText.isDisplayed();
    }

    ///////////////////////////////////----------------Achievements-----------/////////////////////////////////////////

    // Achivemnets Link
    @FindBy(linkText = "Achievements")
    public WebElement achivementsLinkonDashboardSidebar;

    public boolean isDisplayedAchvimnetLinkOnSidabar(){
        try {
            waitForVisibility(achivementsLinkonDashboardSidebar);
        }catch (Exception e){}
        return achivementsLinkonDashboardSidebar.isDisplayed();
    }

    public void clickAchivementsLinkOnSidebar() {
        click(achivementsLinkonDashboardSidebar);
    }

    // My certificates statistics
    @FindBy(xpath = "//*[.='My certificates statistics']")
    public WebElement myCertificatesStatisticsTitle;

    // From Date
    @FindBy(name = "from")
    public WebElement fromDate;

    public void clickFrom(){
        click(fromDate);
    }
    //Prev From Date
    @FindBy(xpath = "//table[@class='table-condensed']//th")
    public WebElement prevFromDate;

    //Next From Date
    @FindBy(xpath = "(//th[@class='next available']//span)[3]")
    public WebElement nextForToDate;

    // Month And Year from date
    @FindBy(xpath = "//th[@class='month']")
    public List<WebElement> monthsAndYearsFromDate;

    // Month And Year to date
    @FindBy(xpath = "(//th[@class='month'])[3]")
    public List<WebElement> monthsAndYearToDate;
    // Day From Date
    @FindBy(xpath = "//button[text()='Apply']")
    public WebElement applyForFromDate;
    // To date
    @FindBy(name = "to")
    public WebElement toDate;

    // Apply For To Date
    @FindBy(xpath = "(//button[text()='Apply'])[2]")
    public WebElement applyToDate;

    public void clickToDate(){
        click(toDate);
    }

    public void getFromDate(String date){
        clickFrom();
        int i = 0;
        while (!monthsAndYearsFromDate.get(i).getText().equalsIgnoreCase(date)) {
            click(prevFromDate);
            if (monthsAndYearsFromDate.get(i).getText().equalsIgnoreCase("Feb 2022")) {
                break;
            }
        }
                clickWithJs1(applyForFromDate);
    }
    public void getToDate(String date){
        clickToDate();
        int i = 0;
        while (!monthsAndYearToDate.get(i).getText().equalsIgnoreCase(date)) {
            click(nextForToDate);
            if (monthsAndYearToDate.get(i).getText().equalsIgnoreCase("Feb 2027")) {
                break;
            }
        }
        clickWithJs1(applyToDate);
    }
    @FindBy(css = "[name='webinar_id']")
    public WebElement courseDropdown;

    public void selectCourseType(String courseType) {
        selectByVisibleText(courseDropdown,courseType);
    }

    //Show Result
    @FindBy(xpath = "//*[.='Show Results']")
    public WebElement showResult;

    public void clickShowResult() {
        click(showResult);
    }

    // Certificates
    @FindBy(css = "[class='d-block text-dark-blue font-weight-500']")
    public List<WebElement> certificatesList;

    // You have no Certificates text
    @FindBy(xpath = "//*[.='You have no certificate!']")
    public WebElement youHaveNoCertificateText;

    // Dropdown Toogle
    @FindBy(css = "[class='btn-group dropdown table-actions']")
    public WebElement dropdwonToogle;

    public void clickDropdownToogle(){
        click(dropdwonToogle);
    }

    // Open Button
    @FindBy(xpath = "//*[.='Open']")
    public WebElement openButton;

    public void clickOpenButton(){
        click(openButton);
    }







    ////////////////////////////////////---------------Certificate Validation------------//////////////////////////////

    @FindBy(linkText = "Certificate Validation")
    public WebElement certificateValidationLinkOnSidebar;

    @FindBy(xpath = "//*[.='Certificate Validation']")
    public WebElement certificateVAlidationText;

    public void clickCertificateValidationLink() {
        click(certificateValidationLinkOnSidebar);
    }

    public boolean isDisplayedCertificateValidation() {
        waitForVisibility(certificateVAlidationText);
        return certificateVAlidationText.isDisplayed();
    }

    // Id
    @FindBy(id = "certificate_id")
    public WebElement certificateId;

    public void sendIdForValidation(String  id) {
        sendKeys(certificateId, id);
    }








    ///////////////////////////////////----------------Completion Certificates---------------//////////////////////////
    @FindBy(linkText = "Completion Certificates")
    public WebElement completionCertificatesLinkOnSidebar;
    // You have No Certificates Text;
    @FindBy(className = "text-dark-blue")
    public WebElement youHaveNoCertificatesText;

    public boolean isDisplayedyouHaveNoCertificates(){
        try {
            waitForVisibility(youHaveNoCertificatesText);
        }catch (Exception e) {}
        return youHaveNoCertificatesText.isDisplayed();
    }
    // Certificates statistics
    @FindBy(css = "[class='section-title']")
    public WebElement certificatesStatistics;

    public boolean isDisplayedCertificateStatistics() {
        waitForVisibility(certificatesStatistics);
        return certificatesStatistics.isDisplayed();
    }



}
