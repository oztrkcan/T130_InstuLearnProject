package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.TestData.TestDataBase;

import java.util.List;

public class FooterPage extends BasePage{
    public FooterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "(//*[@class='mt-20'])[2]//font")
    List<WebElement> additionalLinks;

    public void clicksAdditionalLinks(String additionalLink) {
        for (WebElement links : additionalLinks) {
            if (links.getText().contains(additionalLink)) {
                click(links);
                wait(3);
                System.out.println(driver.getCurrentUrl());
            }
        }
    }

    public void additionalLink(){
        for (int i = 0; i < additionalLinks.size(); i++) {
            additionalLinks.get(i).click();
        }
    }

    public void urlAssertion(String url) {
        Assert.assertTrue(driver.getCurrentUrl().contains(url));
    }



    @FindBy(xpath = "//span[text()='Additional Links']")
    WebElement addtionalLinkText;

    public void scrollToFooter() {scrollWithJs(addtionalLinkText);}



    @FindBy(xpath = "//img[@alt='Instagram']")
    WebElement instagramlink;

    @FindBy(xpath = "//img[@alt='Whatsapp']")
    WebElement whatsUpplink;

    @FindBy(xpath = "//img[@alt='Twitter']")
    WebElement twitterlink;

    @FindBy(xpath = "//img[@alt='Facebook']")
    WebElement facebooklink;

    @FindBy(xpath = "//div[@class='font-14 text-white']")
    WebElement textInFooter;

    @FindBy(xpath = "//div[text()[normalize-space()='424-369-1867']]")
    WebElement numberInFooter;

    @FindBy(xpath = "(//div[contains(@class,'border-left mx-5')]/following-sibling::div)[2]")
    WebElement mailInFooter;

    public void sacialMediaIconsVerifies(){
        Assert.assertTrue(textInFooter.isDisplayed());
        Assert.assertTrue(numberInFooter.isDisplayed());
        Assert.assertTrue(mailInFooter.isDisplayed());
        wait(2);

        instagramlink.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.instagram.com/"));
        driver.navigate().back();

        whatsUpplink.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("https://web.whatsapp.com/"));
        driver.navigate().back();

        twitterlink.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("https://x.com/"));
        driver.navigate().to("https://qa.instulearn.com/");

        facebooklink.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.facebook.com/"));

    }



    @FindBy(xpath = "//*[@class='flex-grow-1']")
    WebElement joinUsTitle;

    @FindBy(name = "newsletter_email")
    WebElement emailBoxInFooter;

    @FindBy(xpath = "(//*[@type='submit'])[3]")
    WebElement joinButton;

    @FindBy(xpath = "//div[@role='alert']")
    WebElement alert;

    public void verifiesNewsletterSubscribe(){
        Assert.assertTrue(joinUsTitle.isDisplayed() && emailBoxInFooter.isDisplayed());
        wait(3);
        sendKeysWithJS(emailBoxInFooter, TestDataBase.fakeRegisterEmail);
        click(joinButton);
        Assert.assertTrue(alert.isDisplayed());
    }
}
