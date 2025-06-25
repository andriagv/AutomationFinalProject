package ui.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"ui.steps"},
        plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumber-html-reports.html",
                "json:target/cucumber-reports/Cucumber.json"
        },
        monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {
}