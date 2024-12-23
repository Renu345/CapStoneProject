package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features", // Path to your feature files
    glue = {"com.facebook.stepDefinitions", "com.facebook.hooks"}, // Path to your step definitions
    plugin = {
        "pretty", 
        "html:target/cucumber-reports.html",  // Basic HTML report
        "json:target/cucumber.json",          // Cucumber JSON report
        "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm" // Allure plugin for Cucumber
    },
    monochrome = true // Makes the console output more readable
)
public class TestRunner {
    // Empty class, just runs the tests
}
