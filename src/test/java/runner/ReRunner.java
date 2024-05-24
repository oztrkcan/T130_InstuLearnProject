package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports.html",
                "rerun:Failed/failedScenarios.txt"
        },
        monochrome = true,
        features = "@Failed/failedScenarios.txt",
        glue = {"stepdefinitions","hooks"},
        dryRun = false
)
public class ReRunner {
}

