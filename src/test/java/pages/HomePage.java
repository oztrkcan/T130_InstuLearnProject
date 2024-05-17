package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.TestData.TestDataBase;

import java.util.List;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void loadHomePage() {
        driver.get(TestDataBase.homePageUrl);
    }

    /////////////////////////////////////////===========instructor=============////////////////////////////////////////
    // instructor all card section
    @FindBy(css = "[class='owl-stage']")
    public WebElement allcardSectionOfInstructor;

    //All Instructors button
    @FindBy(linkText = "All Instructors")
    public WebElement allINstructorsButtonOnHomePage;
    public void clickAllINstructorsButtonOnHomePage() {
        scrollToElementWithAction(allINstructorsButtonOnHomePage);
        click(allINstructorsButtonOnHomePage);
    }

    public boolean isDisplayedInstructorsOnHomePage() {
        return allINstructorsButtonOnHomePage.isDisplayed();
    }

    // Instructor slider Card
    @FindBy(css = "[class='owl-dot']")
    public List<WebElement> instructorSliderCards;
    public void clickSliderCardOfInstructors() {
        scrollToElementWithAction(allINstructorsButtonOnHomePage);
        for (WebElement card: instructorSliderCards){
            click(card);
        }
    }
    // instructors RAting Score
    @FindBy(xpath = "(//*[@class='owl-item active center'])/div/div/div/div[2]/div ")
    public WebElement ratingScoreOfInstructors;

    public boolean isDisplayedRatingOfScoreOfInstructors() {
        scrollToElementWithAction(allcardSectionOfInstructor);
        return ratingScoreOfInstructors.isDisplayed();
    }
    // instructors Name
    @FindBy(xpath = "(//*[@class='owl-item active center'])//h3")
    public WebElement nameOfINstructors;

    public boolean isDisplayedNameOfInstructors() {
        scrollToElementWithAction(allcardSectionOfInstructor);
        return nameOfINstructors.isDisplayed();
    }

    // instructors CArd Reserve a meeting
    @FindBy(xpath = "(//*[@class='owl-item active center'])//a[2]")
    public WebElement reserveaMeetingForInstructors;
    public boolean isDisplayedReserveAMeetingForInstructors() {
        scrollToElementWithAction(allcardSectionOfInstructor);
        return reserveaMeetingForInstructors.isDisplayed();
    }
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
        scrollToElementWithAction(discountedCoursesTitle);
        click(JoinasInstructorSection);}


    /////////////////////////////////////////===========Store Products=============////////////////////////////////////////

    // Store Products Title
    @FindBy(xpath = "//*[.='Store Products']")
    public WebElement storeProductsTitleText;

    // Store Product Slider
    @FindBy(className = "features-swiper-pagination")
    public WebElement sliderOfStoreProducts;

    public boolean isDisplayedStoreProductTitleText(){
        boolean result= false;
        if(sliderOfStoreProducts.isDisplayed() & storeProductsTitleText.isDisplayed()){
            result = true;
        }
        return result;
    }
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

    public boolean isDisplayedOnCard(List<WebElement> slider,List<WebElement> elementList) {
        boolean result= false;

        for (WebElement slide : slider) {
            click(slide);
            for (WebElement element: elementList){
                if (element.isDisplayed()){
                    result=true;
                    break;
                }
            }
        }
        return result;
    }

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


}
