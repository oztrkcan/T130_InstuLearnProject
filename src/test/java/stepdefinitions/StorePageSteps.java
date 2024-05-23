package stepdefinitions;

import io.cucumber.java.en.Then;
import pages.StorePage;

public class StorePageSteps extends BaseStep{

    StorePage storePage=new StorePage(driver);

    @Then("I see the Store and click.")
    public void i_see_the_store_and_click() {
        storePage.storeDisableAndClick();

    }

    @Then("I see the Products text.")
    public void i_see_the_products_text() {
        storePage.productsTextIsDisplayed();

    }

    @Then("I see the Search Box and search for {string}.")
    public void i_see_the_search_box_and_search_for(String string) {
        storePage.searchBoxIsDisabledAndSearch(string);

    }

    @Then("I see Filters and I filter.")
    public void i_see_filters_and_i_filter() {
        storePage.filterDisabledAndChoose();
    }

    @Then("I click the first product that appear.")
    public void i_click_the_first_product_that_appear() {
        storePage.firstProductChoose();
    }

    @Then("I see Add to Cart.")
    public void i_see_add_to_cart() {
        storePage.disabledAddToCart();
    }

    @Then("I see Buy now and click.")
    public void i_see_buy_now_and_click() {
        storePage.disableBuyNowAndClick();
    }

    @Then("I buy the product.")
    public void i_buy_the_product() {
        storePage.buyProduct();
    }
}
