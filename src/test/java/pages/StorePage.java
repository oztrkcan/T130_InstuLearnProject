package pages;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ReusableMethods;

public class StorePage extends BasePage{
    public StorePage(WebDriver driver) {
        super(driver);
    }

    public static StorePage storePage=new StorePage(driver);

    /* Batuhan burada çalıştı */
    @FindBy(xpath = "//*[text()='Store']")
    public WebElement storeText;

    @FindBy(xpath = "//*[text()='Products']")
    public WebElement productsText;

    public void storeDisableAndClick(){
        Assert.assertTrue(storePage.storeText.isDisplayed());
        storePage.storeText.click();
    }

    public void productsTextIsDisplayed(){
        Assert.assertTrue(productsText.isDisplayed()
        );
    }

    @FindBy(xpath = "//*[@placeholder=\"Search in store\"]")
    public WebElement searchBox;

    @FindBy(xpath = "(//*[@type=\"submit\"])[2]")
    public WebElement searchButton;

    @FindBy(xpath = "(//*[@class=\"product-card\"])[1]")
    public WebElement firstProductInSearch;

    @FindBy(xpath = "//*[@class=\"mt-15 product-title font-weight-bold font-16 text-dark-blue\"]")
    public WebElement firstProduct;

    @FindBy(xpath = "//*[text()='Virtual']")
    public WebElement firstFilterButton;

    @FindBy(xpath = "//*[text()='Physical']")
    public WebElement secondFilterButton;

    @FindBy(xpath = "//*[text()='Only available products']")
    public WebElement thirdFilterButton;

    @FindBy(xpath = "(//*[text()='Filter items'])[1]")
    public WebElement firstFilterSearchButton;

    @FindBy(xpath = "(//*[text()='Filter items'])[2]")
    public WebElement secondFilterSearchButton;

    public void searchBoxIsDisabledAndSearch(String metin){
        Assert.assertTrue(searchBox.isDisplayed());
        ReusableMethods.sendKeys(searchBox,metin);
        searchButton.click();
    }

    public void filterDisabledAndChoose(){
        firstFilterButton.click();
        secondFilterButton.click();
        thirdFilterButton.click();
        firstFilterSearchButton.click();
        ReusableMethods.wait(2);
    }

    public void firstProductChoose(){
        ReusableMethods.click(firstProduct);
    }

    @FindBy(xpath = "(//*[@type='submit'])[2]")
    public WebElement addToCartButton;

    @FindBy(xpath = "(//*[@type='button'])[8]")
    public WebElement buyNowButton;

    public void disabledAddToCart(){
        Assert.assertTrue(addToCartButton.isDisplayed());

    }

    @FindBy(xpath = "//*[text()='Checkout']")
    public WebElement checkoutButton;

    @FindBy(xpath = "//*[@for=\"offline\"]")
    public WebElement stripeButton;

    @FindBy(xpath = "//*[text()='Start Payment']")
    public WebElement startPaymentButton;

    @FindBy(xpath = "(//*[@class=\"InputContainer\"])[1]")
    public WebElement stripeEmailTextBox;

    @FindBy(xpath = "(//*[@class=\"InputContainer\"])[2]")
    public WebElement stripeCreditCardTextBox;

    @FindBy(xpath = "(//*[@class=\"InputContainer\"])[3]")
    public WebElement stripeCardDateTextBox;

    @FindBy(xpath = "(//*[@class=\"InputContainer\"])[4]")
    public WebElement stripeCardCVCTextBox;

    @FindBy(xpath = "(//*[@class=\"InputContainer\"])[5]")
    public WebElement stripeNameTextBox;

    @FindBy(xpath = "//*[@class=\"SubmitButton-IconContainer\"]")
    public WebElement stripePayButton;

    @FindBy(xpath = "//*[text()='Congratulations!']")
    public WebElement congratulationsPaymentText;
    Faker faker=new Faker();

    public void buyWithStripe(){
        ReusableMethods.click(stripeButton);
        // ReusableMethods.waitForClickablility(startPaymentButton);
        // startPaymentButton.click();
        // //stripeEmailTextBox.click();
        // ReusableMethods.sendKeys(stripeEmailTextBox,"batuhan@gmail.com");
        // ReusableMethods.sendKeys(stripeCreditCardTextBox,"4242424242424242");
        // ReusableMethods.sendKeys(stripeCardDateTextBox,"1225");
        // ReusableMethods.sendKeys(stripeCardCVCTextBox,"123");
        // ReusableMethods.sendKeys(stripeNameTextBox,"batuhan yıldız");
        ReusableMethods.click(startPaymentButton);
        ReusableMethods.waitForVisibility(congratulationsPaymentText);
        Assert.assertTrue(congratulationsPaymentText.isDisplayed());



    }

    public void disableBuyNowAndClick(){
        ReusableMethods.click(buyNowButton);
        ReusableMethods.click(checkoutButton);
    }

    public void buyProduct(){
        buyWithStripe();

    }
}
