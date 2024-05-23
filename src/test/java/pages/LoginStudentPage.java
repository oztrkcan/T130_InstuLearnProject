package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.TestData.TestDataBase;

public class LoginStudentPage extends LoginPage{
    public LoginStudentPage(WebDriver driver) {
        super(driver);
    }
    //////////////////////////-----------------------New------------------------/////////////////////////////////////
    // Student Link
    @FindBy(xpath = "//span[text()='Students']")
    public WebElement studentsLinkOnSidebar;

    public void clickStudentLink(){
        click(studentsLinkOnSidebar);
    }

    // New Link
    @FindBy(xpath = "//*[@id='studentsCollapse']//a")
    public WebElement newLInkOnSidebar;

    public void clickNewLinkOnSidebar(){
        click(newLInkOnSidebar);
    }

    public boolean isDisplayedNewLinkOnSidebar() {
        waitForVisibility(newLInkOnSidebar);
        return newLInkOnSidebar.isDisplayed();
    }

    // List Link
    @FindBy(xpath = "//a[@href='/panel/manage/students']")
    public WebElement listLInkOnSidebar;

    public boolean isDisplayedListOnSidebar() {
        waitForVisibility(listLInkOnSidebar);
        return listLInkOnSidebar.isDisplayed();
    }

    //Email Textbox
    @FindBy(name = "email")
    public WebElement emailTextbox;

    //Password TExtbox
    @FindBy(name = "password")
    public WebElement passwordTextbox;

    //Retype Password Textbox
    @FindBy(name = "password_confirmation")
    public WebElement retypePasswordTextbox;

    //Phone textbox
    @FindBy(name = "mobile")
    public WebElement phoneTextbox;

    // Name
    @FindBy(name = "full_name")
    public WebElement fullNameTextbox;

    public void setFormforNewStudent() {
        sendKeys(emailTextbox, TestDataBase.faker.internet().emailAddress());
        sendKeys(passwordTextbox,TestDataBase.studentValidPassword);
        sendKeys(retypePasswordTextbox,TestDataBase.studentValidPassword);
        sendKeys(fullNameTextbox, TestDataBase.faker.name().name());
        sendKeys(phoneTextbox,TestDataBase.faker.number().digits(8));

    }
    @FindBy(id = "saveData")
    public WebElement saveButtonForRegister;

    public void clickSaveLinkForNewRegister() {
        click(saveButtonForRegister);
    }

    // Request done successfully!
    @FindBy(xpath = "//*[.='Request done successfully!']")
    public WebElement requestDoneSuccessfully;

    public boolean isDisplayedRequestDoneSuccesfullyText(){
        waitForVisibility(requestDoneSuccessfully);
        return requestDoneSuccessfully.isDisplayed();
    }


    //////////////////////////-----------------------List-----------------------/////////////////////////////////////

    @FindBy(xpath = "//a[@href='/panel/manage/students']")
    public WebElement listLinkUnderStudentOnSidebar;

    public void clickListLinkUnderStudentOnSidebar() {
        click(listLinkUnderStudentOnSidebar);
    }
}
