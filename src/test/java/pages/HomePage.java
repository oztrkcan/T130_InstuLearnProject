package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import utilities.TestData.TestDataBase;

import java.security.cert.X509Certificate;
import java.util.List;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void loadHomePage() {
        driver.get(TestDataBase.homePageUrl);
    }

    /////////////////////////////////////////----------Search Box---------------///////////////////////////////////////

    // Search Box
    @FindBy(xpath = "(//input[@name='search'])[2]")
    public WebElement searchBoxHomePageBody;

    public void sendKeysSearchBoxHomePageBody(String  text){
        sendKeys(searchBoxHomePageBody, text);
    }
    // Search Button
    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement searchButton;

    public void clickSearchButton(){
        click(searchButton);
    }

    //Search Result
    @FindBy(css = "[class='mt-5 text-center white-space-pre-wrap']")
    public WebElement searchResultText;

    ///////////////////////////////////////------------Newest Cateogry-----------//////////////////////////////////////

    // Newest Course names
    @FindBy(xpath = "//div/div[2]/div/figure/figcaption/a/h3")
    public List<WebElement> newestCourseNames;

    //Newest Course slider
    @FindBy(xpath = "//section[3]/div[2]/div[2]/div/span")
    public List<WebElement> neweztCourseSlider;

    //Newest Course Title
    @FindBy(xpath = "//section[3]/div[1]/div/h2")
    public  WebElement newestCourseTitle;

    /////////////////////////////////////////===========instructor=============////////////////////////////////////////

    //All Instructors button
    @FindBy(linkText = "All Instructors")
    public WebElement allINstructorsButtonOnHomePage;

    // Instructor slider
    @FindBy(css = "[class='owl-dot']")
    public List<WebElement> instructorSliderCards;

    // instructors Rating Score
    @FindBy(xpath = "(//*[@class='owl-item active center'])/div/div/div/div[2]/div ")
    public WebElement ratingScoreOfInstructors;

    // instructors Name
    @FindBy(xpath = "(//*[@class='owl-item active center'])//h3")
    public WebElement nameOfINstructors;

    // instructors Card Reserve a meeting
    @FindBy(xpath = "(//*[@class='owl-item active center'])//a[2]")
    public WebElement reserveaMeetingForInstructors;

    // instructors Reserve a Meeting
    @FindBy(xpath = "//*[@class='owl-item active']//a[.=\"Reserve a live meeting\"]")
    public List<WebElement> reserveMeetings;

    public void clickReserveAMeeting(){
        click(reserveMeetings.getFirst());
    }

    ///////////////////////////////////VİSİTOR////////////////////////////////
    //Home page body>>Join us as an Instructor and start teaching link
    @FindBy(xpath = "//img[@alt='Home - Join as instructor']")
    public WebElement JoinasInstructorSection;

    @FindBy(xpath = "//*[.='Discounted Courses']")
    public WebElement discountedCoursesTitle;

    public boolean isDisplayedJoinAsInstructorSection(){
        scrollWithJs(discountedCoursesTitle);
        return JoinasInstructorSection.isDisplayed();}
    public void clickJoinAsInstructorSection(){
        scrollWithJs(discountedCoursesTitle);
        click(JoinasInstructorSection);}


    /////////////////////////////////////////===========Store Products=============////////////////////////////////////////

    // Store Products Title
    @FindBy(xpath = "//*[.='Store Products']")
    public WebElement storeProductsTitleText;

    // Store Product Slider
    @FindBy(className = "features-swiper-pagination")
    public WebElement sliderOfStoreProducts;

    // Slider
    @FindBy(xpath = "//div[contains(@class,'swiper-pagination new-products-swiper-pagination')]//span")
    public List<WebElement> sliderlist;

    //Price of Products
    @FindBy(xpath = "//*[@class='product-card-body']//*[@class='product-price-box mt-25']")
    public List<WebElement> priceOfProducts;

    //Add to cart Button
    @FindBy(xpath = "//*[@class='product-card']//div[@class='hover-card-action']")
    public List<WebElement> addToCartButton;

    //Like of Product
    @FindBy(xpath = "//*[@class='product-card']//*[@class='badge badge-primary ml-10']")
    public List<WebElement> likeProduct;

    //All product image
    @FindBy(css = "[class='product-card']")
    public List<WebElement> allProduct;

    public boolean isDisplayedHoverOnCard(List<WebElement> cardList, List<WebElement>elementList){
        boolean result= false;
        for (WebElement card : cardList){
            if (card.isDisplayed()){
                    hover(card);
                    for (WebElement element : elementList){
                        if (element.isDisplayed()){
                            result=true;
                        }
                    }
            }
        }
        return result;
    }

    public void clickAddToCard() {
        for (WebElement card : allProduct) {
            try {
                hover(card);
                for (WebElement element : addToCartButton) {
                    if (element.isDisplayed()) {
                        click(element);
                        break;
                    }
                }
            } catch (Exception e) {
            }
        }
    }

    // Product CArds Names
    @FindBy(xpath = "(//h3[contains(@class,'mt-15 product-title')])")
    public List<WebElement> productCardsNames;

    // All Product Button
    @FindBy(xpath = "//*[.='All Products']")
    public WebElement allProductButtonOnHomePage;

    public void clickAllProductButton() {
        clickWithJs1(allProductButtonOnHomePage);
    }

    ////////////////////////////////////----------Subscribe NOw-------------////////////////////////////////////////////

    //Subscribe Now! section on the homepage
    @FindBy (xpath = "//*[text()=\"Subscribe Now!\"]")
    public WebElement subscribeNowText;

    public boolean isDisplayedSubscribeNowText(){
        scrollWithJs(subscribeNowText);
        return subscribeNowText.isDisplayed();
    }

    @FindBy (xpath = "//*[text()=\"Bronze\"]")
    public WebElement bronzeSubscriptionText;
    public boolean isDisplayedBronzeSubscriptionText(){
        scrollWithJs(bronzeSubscriptionText);
        return bronzeSubscriptionText.isDisplayed();
    }

    @FindBy (xpath = "//*[text()=\"Gold\"]")
    public WebElement goldSubscriptionText;
    public boolean isDisplayedGoldSubscriptionText(){
        scrollWithJs(goldSubscriptionText);
        return goldSubscriptionText.isDisplayed();
    }

    @FindBy (xpath = "//*[text()=\"Silver\"]")
    public WebElement silverSubscriptionText;
    public boolean isDisplayedSilverSubscriptionText(){
        scrollWithJs(silverSubscriptionText);
        return silverSubscriptionText.isDisplayed();
    }

    @FindBy(xpath = "//*[@class=\"reward-program-section-hero\"]")
    public WebElement earnClubPointsText;

    @FindBy(xpath = "(//*[@class=\"btn btn-primary mr-15\"])[2]")
    public WebElement rewardsButton;

    @FindBy(xpath = "//*[text()='PointsClubButton']")
    public WebElement pointsClubButton;

    @FindBy(xpath = "//*[text()='PointsDiscountCoupon']")
    public WebElement discountCoupon;


}
