package utilities;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReusableMethods {
    private  static WebDriver driver;
    public ReusableMethods(WebDriver driver) {
        this.driver = driver;
    }
    //========Switching Window=====//

    //SwitchToWindow1
    public static void switchToWindow(int sayi){
        List<String> tumWindowHandles = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tumWindowHandles.get(sayi));
    }
    //SwitchToWindow2
    public static void window(int sayi){
        driver.switchTo().window(driver.getWindowHandles().toArray()[sayi].toString());
    }
    //========Switching Window=====//
    public static void switchToWindowWithTitle(String targetTitle) {
        String origin = driver.getWindowHandle();
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
            if (driver.getTitle().equals(targetTitle)) {
                return;
            }
        }
        driver.switchTo().window(origin);
    }
    public static void scrollToElementWithAction(WebElement element) {
        WebElement bottom = element;
        Actions actions = new Actions(driver);
        actions.scrollToElement(bottom).perform();
    }

    public static void sendKeys(WebElement webElement, String textToType){
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(GlobalVars.DefaultExplicitTimeOut));
        wait.until(ExpectedConditions.elementToBeClickable(webElement)).sendKeys(textToType);
    }
    public static void click(WebElement webElement){
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(GlobalVars.DefaultExplicitTimeOut));
        wait.until(ExpectedConditions.elementToBeClickable(webElement)).click();
    }

    public static void hover(WebElement element) {
        waitForVisibility(element);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

    public static   void doubleClick(WebElement element) {
        waitForClickablility(element);
        new Actions(driver).doubleClick(element).build().perform();
    }
    public static void selectByVisibleText(WebElement element, String text) {
        Select objSelect = new Select(element);
        objSelect.selectByVisibleText(text);
    }

    public static void selectByIndex(WebElement element, int index) {
        Select objSelect = new Select(element);
        objSelect.selectByIndex(index);
    }

    public static void selectByValue(WebElement element, String value) {
        Select objSelect = new Select(element);
        List<WebElement> elementCount = objSelect.getOptions();
        objSelect.selectByValue(value);
        System.out.println("number of elements: " + elementCount.size());
    }


    //Alert ACCEPT
    public static void alertAccept(WebDriver driver) {
        alertWait();
        driver.switchTo().alert().accept();

    }

    //Alert DISMISS
    public static void alertDismiss(WebDriver driver) {
        alertWait();
        driver.switchTo().alert().dismiss();
    }

    //Alert getText()
    public static void alertText(WebDriver driver) {
        alertWait();
        driver.switchTo().alert().getText();
    }

    //Alert promptBox
    public static void alertSentText(WebDriver driver,String text) {
        alertWait();
        driver.switchTo().alert().sendKeys(text);
    }

    //Click Method
    public static void clickWithJs1(WebElement element) {
        try {
            element.click();
        } catch (Exception e) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", element);
        }
    }

    //JS Scroll
    public static void scrollWithJs(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    //JS SendKeys
    public static void sendKeysWithJS(WebElement element, String text) {
        waitForClickablility(element);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value='" + text + "'", element);
    }

    /**
     * Clicks on an element using JavaScript
     *
     * @param element
     */
    public static void clickWithJS2(WebElement element) {
        waitForClickablility(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }


    public static void cleanByJs(WebElement element) {
        waitForVisibility(element);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].value = '';", element);
    }


    /**
     * JavaScript ile webelement olusturma
     *
     * @param javascriptYolu internet sitesinden sag klik ile JS yolunu kopyala ile alınan metin olacak
     */
    public static WebElement webelementJavaScript(String javascriptYolu) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement webElement = (WebElement) js.executeScript("return " + javascriptYolu + "");
        return webElement;
    }

    /**
     * bu metot ile JS yolu string olarak verilen elementi JavascriptExecutor kullanarak tiklayabilirim
     * @param //webElement click yapilacak webelement yolu string olarak verilir
     */
    public static void clickJSElementWithJavaScript(String javascriptYolu) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        WebElement webElement = (WebElement) jse.executeScript("return " + javascriptYolu + "");
        jse.executeScript("arguments[0].click();", webElement);

    }

    /**
     * Bu metot ile elementin xpath değeri string olarak verilerek o classtaki text alinir.
     *     * @param  xpath text degeri alinmak istenen elementin xpathi string olarak verilir
     * @return
     */
    public static String getTextWithJavaScriptXpath(String xpath) {
        WebElement element = driver.findElement(By.xpath(xpath));

        // JavaScriptExecutor kullanarak elementin içeriğini al
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        String text = (String) jsExecutor.executeScript("return arguments[0].textContent;", element);
        return text;
    }


    public static WebElement waitForVisibility(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(GlobalVars.DefaultExplicitTimeOut));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static WebElement waitForClickablility(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(GlobalVars.DefaultExplicitTimeOut));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    //Alert Wait
    public static void alertWait() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(GlobalVars.DefaultExplicitTimeOut));
        wait.until(ExpectedConditions.alertIsPresent());

    }

    //HARD WAIT METHOD
    public static void bekle(int saniye) {
        try {
            Thread.sleep(saniye * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    //WebElement ScreenShot
    public static void webElementScreenShoot(WebElement element){
        String tarih = new SimpleDateFormat("_hh_mm_ss_ddMMyyyy").format(new Date());
        String dosyaYolu = "TestOutput/webElementScreenshot"+tarih+".png";
        try {
            FileUtils.copyFile(element.getScreenshotAs(OutputType.FILE),new File(dosyaYolu));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    //==========Return a list of string given a list of Web Element====////
    public static List<String> getElementsText(List<WebElement> list) {
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : list) {
            if (!el.getText().isEmpty()) {
                elemTexts.add(el.getText());
            }
        }
        return elemTexts;
    }
    public static List<String> stringListeCevir(List<WebElement> webElementList){

        List<String> stringList = new ArrayList<>();

        for (WebElement eachElement : webElementList
        ) {

            stringList.add(eachElement.getText());
        }

        return stringList;
    }

}
