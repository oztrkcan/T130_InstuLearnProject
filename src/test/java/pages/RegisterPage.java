package pages;

import driver.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ConfigReader;
import utilities.TestData.TestDataBase;

import java.util.List;

public class RegisterPage extends BasePage{
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void loadRegisterPage(){
        driver.get(TestDataBase.registerPageUrl);
    }

    @FindBy(xpath = "//*[text()='Register']")
    WebElement registerLink;

    @FindBy(xpath = "(//*[@class='img-cover'])[2]")
    WebElement imageInRegisterPage;

    // Email Textbox ///////////////////////////////////
    @FindBy(id = "email")
    WebElement emailbox;
    public void enterEmailForRegister(String email){
        sendKeys(emailbox,email);
    }


    // Full Name Textbox ///////////////////////////////////
    @FindBy(name = "full_name")
    WebElement fullNamebox;
    public void enterFullNameForRegister(String fullName){
        sendKeys(fullNamebox,fullName);
    }


    // Password Textbox ///////////////////////////////////
    @FindBy(id = "password")
    WebElement passwordbox;
    public void enterPasswordForRegister(String password){
        sendKeys(passwordbox,password);
    }


    // Retype Password Textbox ///////////////////////////////////
    @FindBy(id = "confirm_password")
    WebElement retypePasswordBox;
    public void enterRetypePasswordForRegister(String retypePassword){
        sendKeys(retypePasswordBox,retypePassword);
    }


    // I Agree With ... CheckBox ///////////////////////////////////
    @FindBy(xpath = "//input[@type='checkbox']")
    WebElement iAgreeWithText;
    public void clickIAgreeCheckBox(){
        clickWithJs1(iAgreeWithText);
    }


    // Signup Button ///////////////////////////////////
    @FindBy(xpath = "(//button[@type='submit'])[2]")
    WebElement signupButtonInRegisterPage;
    public void clickSignupButton(){clickWithJs1(signupButtonInRegisterPage);}


    // Allready Have ... Text ///////////////////////////////////
    @FindBy(xpath = "//span[@class='text-secondary']")
    WebElement alreadyHaveAccountText;

    @FindBy(xpath = "//label[@class='input-label']")
    List<WebElement> signupFormInRegister;

    @FindBy(xpath = "//div[@class='invalid-feedback']")
    WebElement errorMessageText;






    public void registerLinkClicks(){
        click(registerLink);
    }
    public boolean registerLinkDisplays(){
        return registerLink.isDisplayed();
    }
    public boolean verifyRegisterpage(){
        String expectedUrl = "https://qa.instulearn.com/register";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        return expectedUrl.equals(actualUrl);
    }



    public void verifySignupFormInRegisterPage(){
        for (int i = 0; i < signupFormInRegister.size(); i++) {
            Assert.assertTrue( signupFormInRegister.get(i).isDisplayed());
        }
        Assert.assertTrue(imageInRegisterPage.isDisplayed());
        Assert.assertTrue(signupButtonInRegisterPage.isDisplayed());
        Assert.assertTrue(alreadyHaveAccountText.isDisplayed());
    }



    public void validRegister(String loginType, String person){
        String mail= TestDataBase.fakeRegisterEmail;
        String password= ConfigReader.getProperty(loginType.toLowerCase()+"password");

        enterEmailForRegister(mail);
        enterFullNameForRegister(person);
        enterPasswordForRegister(password);
        enterRetypePasswordForRegister(password);
        clickIAgreeCheckBox();
        clickSignupButton();
        wait(5);

    }
    public boolean displaysErrorMessage(){return errorMessageText.isDisplayed();}

    public void nonInformationRegister(){
        clickIAgreeCheckBox();
        clickSignupButton();
        wait(5);
    }


    // Acount Type
    @FindBy(css = "[class='font-12 cursor-pointer px-15 py-10']")
    List<WebElement> accountTypes;

    public void selectAccontType(String str){
        for (WebElement type: accountTypes){
            if (type.getText().equalsIgnoreCase(str)){
                click(type);
            }
        }
    }


    public void tryRegister(String email, String person, String password){

        enterEmailForRegister(email);
        enterFullNameForRegister(person);
        enterPasswordForRegister(password);
        enterRetypePasswordForRegister(password);
        clickIAgreeCheckBox();
        clickSignupButton();
        wait(5);
    }

    public void fakeValidRegister(){
        String password = TestDataBase.teacherValidPassword;
        enterEmailForRegister(TestDataBase.faker.internet().emailAddress());
        enterFullNameForRegister(TestDataBase.faker.name().fullName());
        enterPasswordForRegister(password);
        enterRetypePasswordForRegister(password);
        clickIAgreeCheckBox();
        clickSignupButton();
        wait(5);
    }
}
