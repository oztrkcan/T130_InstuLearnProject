package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ProductPage;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class ProductPageSteps extends BaseStep{
    ProductPage productPage = new ProductPage(driver);
    @When("I click {string} categories of ProductCards")
    public void iClickCategoriesOfProductCards(String text) {
        productPage.clickWithTextOnCard(productPage.sliderlist, productPage.productCategoryOnStoreProductCards,text);
        List<String> tumWindowHandles = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window(tumWindowHandles.get(1));

    }

    @Then("I see the {string} category on Product Page")
    public void iSeeTheCategoryOnProductPage(String text) {
        ReusableMethods.scrollWithJs(productPage.categoriesTitle);
        Assert.assertEquals(productPage.selectedCategoriesType.getText(), text);
    }

    @And("I scroll the CategoryTitle Product Page")
    public void iScrollTheCategoryTitleProductPage() {
        ReusableMethods.scrollWithJs(productPage.categoriesTitle);
    }


    @When("I click the {string} name on Product Store Card")
    public void iClickTheNameOnProductStoreCard(String productName) {
        productPage.clickWithTextOnCard(productPage.sliderlist, productPage.productCardsNames, productName);
    }

    @Then("I see the details of the product I clicked on {string}")
    public void iSeeTheDetailsOfTheProductIClickedOn(String productName) {
        Assert.assertEquals(productName,productPage.productNameOnProdcutsPage.getText());

    }
}
