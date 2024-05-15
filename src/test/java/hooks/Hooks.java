package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import log.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import driver.Driver;


public class Hooks {


    @Before
    public void setUp(Scenario scenario){
        System.out.println("scenario name= " + scenario.getName());
    }

    @After
    public void tearDown(Scenario scenario){

        if (scenario.isFailed()) {
            final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "failed_screenshot"+scenario.getName());
            Logger.info("Taked is a screenshoot");
        }
        Driver.closeDriver();
        Logger.info("Driver closed in hooks");
    }


}
