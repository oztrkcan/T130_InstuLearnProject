package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductPage extends HomePage{

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    // Product Name Product Page
    @FindBy(className = "font-30")
    public WebElement productNameOnProdcutsPage;

    //Product Category
    @FindBy(xpath = "//*[@class='product-card']//*[@class='text-decoration-underline']")
    public List<WebElement> productCategoryOnStoreProductCards;

    // Categories Title ProductPage
    @FindBy(xpath = "//*[.='Categories']")
    public WebElement categoriesTitle;

    // Selected Categories Type
    @FindBy(css = "[class='d-flex align-items-center font-14 font-weight-bold mt-20 text-primary']")
    public WebElement selectedCategoriesType;
}
