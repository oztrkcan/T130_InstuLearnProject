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


    // Table days
    @FindBy(xpath = "//*[@class='table-days']//td")
    public List<WebElement> tableDays;

    public void clickDayOnTableforReserveMeeting(){
        scrollWithJs(sundayOnTableDay);
        for (WebElement day : tableDays){
            if (!day.getAttribute("class").equalsIgnoreCase("disabled")){
                clickWithJs1(day);
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
                System.out.println(each.getText());
                click(each);
            }
        }
    }

    // Description
    @FindBy(xpath = "//textarea[@name='description']")
    public WebElement descriptionForReserveMeeting;
    public void sendDescriptionForReserveMeeting() {
        scrollToElementWithAction(descriptionForReserveMeeting);
        sendKeys(descriptionForReserveMeeting, TestDataBase.fakeMessage);
    }

    // Group meeting Checkbox
    @FindBy(className = "custom-control-label")
    public WebElement groupMeetingCheckbox;
    public void clickGroupMeetingCheckbox() {
        click(groupMeetingCheckbox);
    }
    // Participites Drag and drop
    @FindBy(xpath = "//div[contains(@class,'wrunner__handle wrunner__handle_theme_default')]")
    public WebElement participitesElementDrap;

    //Maximum Group meeting text
    @FindBy(xpath = "(//*[@class='text-danger mt-5 d-block'])[2]")
    public WebElement maximumGroupMeetingText;

//    public void dragAndDropParticipitesDragAndDrop(){
//        Actions actions = new Actions(driver);
//        actions.dragAndDrop(participitesDra, targetElement).perform();
//    }


}
