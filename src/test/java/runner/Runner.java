package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:test-output/default-cucumber-reports.html",
                "json:test-output/json-reports/cucumber.json",
                "junit:test-output/htmlReport/cucumber.xml",
        },
        features = "src/test/resources/features",
        glue = {"stepdefinitions","hooks"},
        monochrome = true,
        tags = "@can"
       // dryRun = false
)
public class Runner {

}