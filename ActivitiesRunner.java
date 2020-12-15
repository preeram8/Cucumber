package CucumberTest;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "Features",
    glue = {"stepDefinitions"},
    //tags = "@activity1_1",
    //tags = "@activity2_2",
    tags = "@SimpleAlert",
    strict = true,
    //plugin = {"pretty"},
 	plugin = {"html: target/test-reports"},
   // plugin = {"json: test-reports/json-report.json"},
    monochrome = true
)
public class ActivitiesRunner {
    //empty
}


