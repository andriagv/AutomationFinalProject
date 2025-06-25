package ui.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utils.DriverManager;

public class Hooks {

    // @Before
    // public void setup() {
    //
    // }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            WebDriver driver = DriverManager.getDriver();
            if (driver != null) {
                final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", "screenshot");
            }
        }
        DriverManager.closeDriver();
    }
}