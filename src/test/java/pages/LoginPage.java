package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ConfigReader;
import utilities.TestData.TestDataBase;

public class LoginPage extends HeaderPage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void loadLoginPage(){
        driver.get(TestDataBase.loginPageUrl);
    }

    // Email Textbox//////////////////////////////////////////
    @FindBy(id = "email")
    public WebElement emailTextBox;

    public void enterEmailForLogin(String email){
        sendKeys(emailTextBox, email);
    }


    // Password Textbox///////////////////////////////////////
    @FindBy(id = "password")
    public WebElement passwordTextBox;

    public void enterPasswordForLogin(String password){
        sendKeys(passwordTextBox, password);
    }

    // Login button////////////////////////////////////////////
    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginButton;

    public void clickLoginButtonForLogin(){
        click(loginButton);
    }

    //////////////////////////////////////////////========METHODS========////////////////////////////////////////////////
    // get login//////////////////////////////////////////////////
    public void getLogin(String email){
        loadLoginPage();
        enterPasswordForLogin(TestDataBase.studentValidPassword);
        enterEmailForLogin(email);
        clickLoginButtonForLogin();
    }

    public void getLoginwithParameter(String email, String password){
        loadLoginPage();
        enterPasswordForLogin(password);
        enterEmailForLogin(email);
        clickLoginButtonForLogin();
    }

    public void getLoginrForEveryPerson(String loginType, String person) {
        String mail= ConfigReader.getProperty(person.toLowerCase()+loginType.toLowerCase());
        String password=ConfigReader.getProperty(loginType.toLowerCase()+"password");

        loadLoginPage();
        enterPasswordForLogin(password);
        enterEmailForLogin(mail);
        clickLoginButtonForLogin();
    }
//Arzu

    public void getLoginOrganization(String email){
        loadLoginPage();
        enterEmailForLogin(email);
        enterPasswordForLogin(TestDataBase.arzuOrganizationPassword);
        clickLoginButtonForLogin();}

}
