package pages;

import org.openqa.selenium.WebDriver;
import utilities.TestData.TestDataBase;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void loadHomePage() {
        driver.get(TestDataBase.homePageUrl);
    }



}
