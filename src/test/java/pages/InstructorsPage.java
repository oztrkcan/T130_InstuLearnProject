package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.TestData.TestDataBase;
import java.util.List;

public class InstructorsPage extends BasePage{
    public InstructorsPage(WebDriver driver) {
        super(driver);
    }
    //////////////////////////////////============ Reserve a Meeting======================/////////////////////////////

    // Time for Meeting
    @FindBy(xpath = "//*[@id=\"availableTimes\"]//div")
    public List<WebElement> timeforReserveMeeting;

    // Sunday
    @FindBy(xpath = "//div[text()='Su']")
    public WebElement sundayOnTableDay;

    // Pick a Time
    @FindBy(xpath = "(//h3[@class='font-16 font-weight-bold text-dark-blue'])[2]")
    public WebElement pickATimeText;


    // Table days
    @FindBy(xpath = "//*[@class='table-days']//td")
    public List<WebElement> tableDays;

    public void clickDayOnTableforReserveMeeting(){
        scrollWithJs(sundayOnTableDay);
        for (WebElement day : tableDays){
            if (!day.getAttribute("class").contains("disabled")){
                click(day);
                waitForVisibility(pickATimeText);
                if (!timeforReserveMeeting.isEmpty()){
                    click(timeforReserveMeeting.getFirst());
                }else {
                    System.out.println("There isnt available time");
                }
                break;
            }
        }
    }

    // Types of Meeting
    @FindBy(className= "meeting-type-reserve")
    public List<WebElement> typesOfMeeting;
    public void clickTypeOfMeeting(String type) {
        for (WebElement each: typesOfMeeting){
            if (each.getText().equalsIgnoreCase(type)){
                click(each);
            }
        }
    }

    // Description
    @FindBy(xpath = "//textarea[@name='description']")
    public WebElement descriptionForReserveMeeting;
    public void sendDescriptionForReserveMeeting() {
        sendKeys(descriptionForReserveMeeting, TestDataBase.fakeMessage);
    }
    // Group meeting Text
    @FindBy(xpath = "//*[.='Group meeting']")
    public WebElement groupMeetingText;


    // Group meeting Checkbox
    @FindBy(className = "custom-control-label")
    public WebElement groupMeetingCheckbox;
    public void clickGroupMeetingCheckbox() {
        if (groupMeetingText.isDisplayed()) {
            scrollWithJs(groupMeetingText);
            clickWithJs1(groupMeetingCheckbox);
        }
    }

    //Maximum Group meeting text
    @FindBy(xpath = "(//*[@class='text-danger mt-5 d-block'])[2]")
    public WebElement maximumGroupMeetingText;

    // Participites Drag and drop
    @FindBy(className = "wrunner__path_direction_horizontal")
    public WebElement participitesElementDrap;

    public void clickPaticiptesElementDrop(){
        if (maximumGroupMeetingText.isDisplayed()) {
            scrollToElementWithAction(maximumGroupMeetingText);
            click(participitesElementDrap);
        }
    }

    //Reserve A Meeting Button
    @FindBy(xpath = "//button[text()='Reserve a Meeting']")
    public WebElement reserveAMeetingButton;

    public void clickReserveAMeetingButton(){
        scrollToElementWithAction(reserveAMeetingButton);
        click(reserveAMeetingButton);
    }

    // Continiue Shopping Button
    @FindBy(css = "[class='btn btn-sm btn-primary mt-25']")
    public WebElement continueShoppingButton;


    public boolean isDisplayedContinueShoppingButton(){
        waitForVisibility(continueShoppingButton);
        return continueShoppingButton.isDisplayed();
    }



}
