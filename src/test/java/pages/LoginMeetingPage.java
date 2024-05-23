package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.TestData.TestDataBase;

import java.util.List;

public class LoginMeetingPage extends LoginDashboardPage{
    public LoginMeetingPage(WebDriver driver) {
        super(driver);
    }

    //////////////////////////////----------My Reservations------------////////////////////////////////////////////////

    // Meeting statistics
    @FindBy(xpath = "//*[.='Meeting statistics']")
    public WebElement meetingStatisticText;

    //From Date
    @FindBy(name = "from")
    public WebElement fromDate;

    public void sendKeysFromDate(String date){
        sendKeys(fromDate, date);
    }

    //To Date
    @FindBy(name = "to")
    public WebElement toDate;

    public void sendKeysToDate(String date){
        sendKeys(toDate, date);
    }

    // Day
    @FindBy(id = "day")
    public WebElement dayDropdown;

    public void selectDayDropdown(String day){
        selectByVisibleText(dayDropdown,day);
    }

    // Instructor
    @FindBy(name= "instructor_id")
    public WebElement instructorDropdown;

    public void selectInstructorDropdown(String instructor){
        selectByVisibleText(instructorDropdown, instructor);
    }

    // Student
    @FindBy(id = "select2-student_id-dc-container")
    public WebElement studentDropdown;

    public void selectStudentDropdwon(String student){
        selectByVisibleText(studentDropdown,student);
    }

    // Status
    @FindBy(name = "status")
    public WebElement statusDropdown;

    public void selectStatusDropdown(String status){
        selectByVisibleText(statusDropdown, status);
    }

    //Show only open meetings checkbox
    @FindBy(xpath = "//label[@for='openMeetingResult']")
    public WebElement showOnlyOpenMeetingsCheckbox;

    public void clickShowOnlyOpenMeetingCheckbox() {
        click(showOnlyOpenMeetingsCheckbox);
    }



    //////////////////////////////------------------Requests-----------/////////////////////////////////////////////////




    //////////////////////////////------------------Settings-----------/////////////////////////////////////////////////

    // Toggles Button
    @FindBy(css = "[class='feather feather-more-vertical']")
    public List<WebElement> toggleButtonsOnSettings;

    public void clickToggleButtonOnSettings(int index){
        click(toggleButtonsOnSettings.get(index));
        clickAddTimeButton(index);
    }

    // Add time button
    @FindBy(xpath = "//*[.='Add Time']")
    public List<WebElement> addTimeButton;

    public void clickAddTimeButton(int index) {
        click(addTimeButton.get(index));
    }

    // Am Pm check box
    @FindBy(css = "[for='timeTwelveSwitch']")
    public WebElement amPmCheckBox;

    public void clickAmPMCheckox() {
        click(amPmCheckBox);
    }

    // Meeting Type
    @FindBy(name = "meeting_type")
    public WebElement meetingTypeCheckBox;

    public void selectMeetingType(String type){
        selectByVisibleText(meetingStatisticText, type);
    }

    // Clockpicker Tip time
    @FindBy(css = "[class='clockpicker-tick']")
    public List<WebElement> hourMinut;

    // Clockpicker Tip Minutes
    @FindBy(xpath = "//*[@class='clockpicker-dial clockpicker-hours clockpicker-dial-out']//div")
    public List<WebElement> hours;

    public void setTime(String time){
        String[] arr = time.split(":");
        String hour= arr[0];
        String minut= arr[1];
        wait(1);
        for (WebElement h :hourMinut){
            if (h.getText().equalsIgnoreCase(hour)){
                click(h);
            }
        }
        for (WebElement m: hourMinut){
            if (m.getText().equalsIgnoreCase(minut)){
                click(m);
            }
        }
    }
    // Save Button
    @FindBy(id = "saveTime")
    public WebElement saveButton;

    public void clickSaveButton(){
        click(saveButton);
    }


    // Description
    @FindBy(css = "[name='description']")
    public WebElement descriptionForMeeting;

    public void sendDescriptionForMeeting(String description){
        sendKeys(descriptionForMeeting, description);
    }


    // Group Meeting text
    @FindBy(xpath = "//h2[text()='Group meeting']")
    public WebElement groupMeetingPage;

    public void scrolltoGroupMeeting() {
        scrollWithJs(groupMeetingPage);
    }

    // Amount Text Box
    @FindBy(name = "amount")
    public WebElement amountTextBox;

    public void sendAmountForMeeting(int amount) {
        sendKeys(amountTextBox, amount+"");
    }

    // Discount TExt Box
    @FindBy(name = "discount")
    public WebElement discountTextBox;

    public void sendDiscountForMeeting(int discount) {
        sendKeys(discountTextBox,discount+"");
    }


    //Available for In-person meetings
    @FindBy(xpath = "//*[.='Available for In-person meetings']")
    public WebElement inPersonMeetings;

    public void clickAvailableForInPersonChekbox() {
        clickWithJs1(inPersonMeetings);
    }
    // Hourly Price TextBox
    @FindBy(name = "in_person_amount")
    public WebElement hourlyPriceTextBox;

    public void sendHourlyPrice(int hourlyPrice) {
        sendKeys(hourlyPriceTextBox,hourlyPrice+"");
    }
    //Group Meeting Checkbox
    @FindBy(id= "groupMeetingSwitch")
    public WebElement groupMeetingCheckbox;

    public void clickAVailableForGroupMeetingCheckbox() {
        scrollWithJs(groupMeetingCheckbox);
        click(groupMeetingCheckbox);
    }

    // Minimum Student
    @FindBy(name = "online_group_min_student")
    public WebElement minimumStudent;
    public void sendMinForStudent(int min) {
        sendKeys(minimumStudent, min+"");
    }
    //Maksimum Student
    @FindBy(name = "online_group_max_student")
    public WebElement maksimumStudent;


    public void sendMaxForStudent(int max) {
        sendKeys(maksimumStudent,max+"");
    }
}
