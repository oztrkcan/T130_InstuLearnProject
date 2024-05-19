package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.ReusableMethods;
import utilities.TestData.TestDataBase;

import java.util.List;

public class BasePage extends ReusableMethods {
    protected static WebDriver driver;
    ReusableMethods reusableMethods;

    public BasePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void loadHomePage() {
        driver.get(TestDataBase.baseUrl);
    }

    public void clickSlider(List<WebElement> sliderlist) {
        for (WebElement slide : sliderlist) {
            click(slide);
        }
    }

    public void clickWithTextOnCard2(List<WebElement> sliderList, List<WebElement> elementOfText, String text) {
        for (WebElement element : elementOfText) {
            if (element.getText().equalsIgnoreCase(text)) {
                click(element);
                break;
            } else {
                for (WebElement slide : sliderList) {
                    click(slide);
                }
            }
        }
    }


    public void clickWithTextOnCard(List<WebElement> sliderList,List<WebElement> elementOfText, String text) {
        for (WebElement slide : sliderList) {
            for (WebElement element : elementOfText) {
                if (element.getText().equalsIgnoreCase(text)) {
                    click(element);
                    break;
                }else {
                    click(slide);
                }
            }
        }
    }

}
