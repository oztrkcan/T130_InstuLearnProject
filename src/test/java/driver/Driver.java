package driver;

import log.Logger;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import utilities.GlobalVars;
import java.time.Duration;

public class Driver {
    private Driver(){
    }
    private static WebDriver driver;


    public static WebDriver getDriver(){
        String browserType = GlobalVars.browser;
        Logger.info("Driver name "+browserType);
        if (driver == null){
            Logger.info("Driver is null");
            switch (browserType){

                case "firefox" :
                    driver = new FirefoxDriver();
                    Logger.info("Driver equal Firefox");
                    break;

                case "edge" :
                    driver = new EdgeDriver();
                    Logger.info("Driver equal Edge");
                    break;

                case "safari" :
                    driver = new SafariDriver();
                    Logger.info("Driver equal Safari");
                    break;
                default:
                    driver = new ChromeDriver();
                    Logger.info("Driver default Chrome");
                  ChromeOptions chromeOptions = new ChromeOptions();
                   chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
                   Logger.info("Chrome option is normal");
                   chromeOptions.setPageLoadTimeout(Duration.ofSeconds(GlobalVars.DefaultExplicitTimeOut));
                   Logger.info("Chrome set page load timeout "+ GlobalVars.DefaultExplicitTimeOut + " second");
            }
            driver.manage().window().maximize();
            Logger.info("window is maximize");
        }
        return driver;

    }
    public static void closeDriver() {
        if (driver != null) {
            Logger.info("Driver is not null");
            driver.quit();
            Logger.info("Driver is closed in Driver class");
            driver = null;
            Logger.info("Driver is now nul");
        }
    }

    public static void quitDriver(){

        if (driver != null){
            Logger.info("Driver is not null");
            driver.quit();
            Logger.info("Driver is closed in Driver class");
            driver = null;
            Logger.info("Driver is now nul");
        }
    }
}
