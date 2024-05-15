package stepdefinitions;

import driver.Driver;
import org.openqa.selenium.WebDriver;

public class BaseStep {
    public WebDriver driver;
    public BaseStep() {
        this.driver = Driver.getDriver();
    }
}
