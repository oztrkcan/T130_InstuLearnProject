package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import utilities.ReusableMethods;
import utilities.TestData.TestDataBase;

import java.util.List;

public class LoginSupportPage extends LoginPage{
    public LoginSupportPage(WebDriver driver) {
        super(driver);
    }

    //<<<<<<<<<<<<<<<<<<<<<<<<<Arzu
    @FindBy(xpath = "//span[text()='Support']")
    public WebElement DashboardSupportMenu;
    @FindBy(xpath = "//a[@href='/panel/support/new']")
    public WebElement supportNewLink;
    @FindBy(xpath = "(//a[@href='/panel/support'])[1]")
    public WebElement supportCoursesSupportLink;
    @FindBy(xpath = "//a[@href='/panel/support/tickets']")
    public WebElement supportTicketLink;
    @FindBy(className = "section-title")
    public WebElement newSupportTitleText;
    @FindBy(name = "title")
    public WebElement newSubjectBox;
    @FindBy(id = "supportType")
    public WebElement newTypeDropBox;
    @FindBy(xpath = "(//*[@class='form-control select2 select2-hidden-accessible'])[2]")
    public WebElement newCourseDropBox;
    @FindBy(xpath = "//textarea[@name='message']")
    public WebElement newMessageBox;
    @FindBy(xpath = "//*[@type='submit']")
    public WebElement newSendMessageButton;
    @FindBy(xpath = "//*[text()='Support summary']")
    public WebElement supportSummaryText;
    @FindBy(xpath = "//span[text()='Open conversations']")
    public WebElement SupportOpenConversationText;
    @FindBy(xpath = "//span[text()='Closed conversations']")
    public WebElement SupportCloseConversationText;
    @FindBy(xpath = "//span[text()='Total conversations']")
    public WebElement SupportTotalConversationText;
    @FindBy(xpath = "//select[@name='teacher']")
    public WebElement instructorDropdownBox;
    @FindBy(xpath = "//select[@name='webinar']")
    public WebElement coursesDropdownBox;
    @FindBy(xpath = "//select[@name='status']")
    public WebElement statusDropdownBox;
    @FindBy(xpath = "//*[@type='submit']")
    public WebElement showResultButton;
    @FindBy(xpath = "//h2[text()='Select a conversation']")
    public WebElement filterVerifyText;
    @FindBy(xpath ="//select[@name='department_id']")
    public WebElement departmentDropdownBox;
    @FindBy(xpath = "(//tr//th)")
    public List<WebElement> ticketPageMessageTitleList;
    @FindBy(xpath = "(//tr//td)[1]")
    public WebElement messageTableFirstOption;
    @FindBy(xpath = "//textarea[@name='message']")
    public WebElement replyMessageBox;
    @FindBy(xpath = "//h3[text()='Reply to the conversation']")
    public WebElement replyMessageText;
    @FindBy(xpath = "(//*[@type='submit'])[2]")
    public WebElement sendMessageButton;
    @FindBy(xpath = "//*[@class='btn btn-primary btn-sm']")
    public WebElement closedRequestButton;
    @FindBy(xpath = "(//tr//td)[4]")
    public WebElement statusColumnValue;

    //******************METHODS*********************
    public void CreatingNewSupportMessage(){
        Assert.assertTrue(newSupportTitleText.isDisplayed());
        newSubjectBox.sendKeys("About Exceptions");
        ReusableMethods.wait(1);
        Select typeOption=new Select(newTypeDropBox);
        typeOption.selectByIndex(1);
        ReusableMethods.wait(1);
        Select courseOption=new Select(newCourseDropBox);
        courseOption.selectByIndex(1);
        ReusableMethods.wait(1);
        newMessageBox.sendKeys("Help me please!!");
        ReusableMethods.wait(1);
        click(newSendMessageButton);
        ReusableMethods.wait(2);
        Assert.assertTrue(supportSummaryText.isDisplayed());
        System.out.println("Mesaj Oluşturuldu..." + supportSummaryText.getText());}
    public void CreatingNewTicketMessage() {
        Assert.assertTrue(newSupportTitleText.isDisplayed());
        newSubjectBox.sendKeys("About Wage");
        ReusableMethods.wait(1);
        Select typeOption = new Select(newTypeDropBox);
        typeOption.selectByIndex(2);
        ReusableMethods.wait(1);
        Select departmenOption = new Select(departmentDropdownBox);
        departmenOption.selectByIndex(1);
        ReusableMethods.wait(1);
        newMessageBox.sendKeys("Help me please!!");
        ReusableMethods.wait(1);
        click(newSendMessageButton);
        ReusableMethods.wait(2);
        Assert.assertEquals(TestDataBase.expectedTicketPageUrl, driver.getCurrentUrl());}
    public void clickSubMenuNewOption(){
        click(DashboardSupportMenu);
        click(supportNewLink);
        ReusableMethods.wait(1);
        //ReusableMethods.scrollWithJs(supportTicketLink);
        CreatingNewSupportMessage();}
    public void clickCoursesSupportSubMenu(){
        ReusableMethods.wait(1);
        click(supportCoursesSupportLink);}
    public void verifySummarySupportPanel(){
        Assert.assertTrue(supportSummaryText.isDisplayed());
        Assert.assertTrue(SupportOpenConversationText.isDisplayed());
        Assert.assertTrue(SupportCloseConversationText.isDisplayed());
        Assert.assertTrue(SupportTotalConversationText.isDisplayed());}
    public void filteringWithOtherData(){
        Select instructorOption=new Select(instructorDropdownBox);
        instructorOption.getOptions().getFirst();
        System.out.println("instructorOption>>>"+ instructorOption.getOptions().getFirst().getText());
        Select courseOption=new Select(coursesDropdownBox);
        courseOption.selectByIndex(2);
        System.out.println("courseOption>>>>"+ courseOption.getFirstSelectedOption().getText());
        Select statusOption=new Select(statusDropdownBox);
        statusOption.getOptions().getFirst();
        System.out.println("statusOption>>>>"+ statusOption.getOptions().getFirst().getText());
        click(showResultButton);
        Assert.assertTrue(filterVerifyText.isDisplayed());
        System.out.println(filterVerifyText.getText());}
    public void clickNewSubMenu(){
        click(supportNewLink);
        CreatingNewTicketMessage();}
    public void verifyVisibilityOfTicketMessageList(){
        for (WebElement each:ticketPageMessageTitleList){
            Assert.assertTrue(each.isDisplayed());
            System.out.println(each.getText());}}
    public void writeAndViewReplyMessage(){
        click(messageTableFirstOption);
        ReusableMethods.wait(1);
        Assert.assertTrue(replyMessageText.isDisplayed());
        replyMessageBox.sendKeys("That's Answer for message");
        ReusableMethods.wait(1);
        click(sendMessageButton);
        Assert.assertTrue(closedRequestButton.isEnabled());
        click(closedRequestButton);
        ReusableMethods.wait(2);
        Assert.assertTrue(statusColumnValue.getText().contains("Closed"));}
}
