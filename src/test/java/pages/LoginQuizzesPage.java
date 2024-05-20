package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginQuizzesPage extends LoginPage{
    public LoginQuizzesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[text()='Quizzes']")
    public WebElement quizzesInDashboard;

    @FindBy(xpath = "//*[text()='New quiz']")
    public WebElement newQuizInDashboard;

    @FindBy(xpath = "//*[text()='List']")
    public WebElement listInDashboard;

    @FindBy(xpath = "//*[text()='Results']")
    public WebElement resultsInDashboard;

    @FindBy(xpath = "//*[text()='My results']")
    public WebElement myResultsInDashboard;

    @FindBy(xpath = "//*[text()='Not Participated']")
    public WebElement notParticipatedInDashboard;

    @FindBy(xpath = "//*[@name=\"ajax[new][title]\"]")
    public WebElement quizTitleTextBox;

    @FindBy(xpath = "//*[@name=\"ajax[new][time]\"]")
    public WebElement timeTextBox;

    @FindBy(xpath = "//*[@name=\"ajax[new][attempt]\"]")
    public WebElement attemptTextBox;

    @FindBy(xpath = "//*[@name=\"ajax[new][pass_mark]\"]")
    public WebElement passmarkTextBox;

    @FindBy(xpath = "//*[@name=\"ajax[new][expiry_days]\"]")
    public WebElement expirydaysTextBox;

    @FindBy(xpath = "(//*[@class=\"custom-control custom-switch\"])[1]")
    public  WebElement quizButton1;

    @FindBy(xpath = "(//*[@class=\"custom-control custom-switch\"])[2]")
    public  WebElement quizButton2;

    @FindBy(xpath = "(//*[@class=\"custom-control custom-switch\"])[3]")
    public  WebElement quizButton3;

    @FindBy(xpath = "//*[text()='Create']")
    public WebElement createButton;

    @FindBy(xpath = "(//*[text()='Save'])[1]")
    public WebElement saveButton;

    @FindBy(xpath = "//*[text()='Item added successfully.']")
    public WebElement successfullyText;
}
