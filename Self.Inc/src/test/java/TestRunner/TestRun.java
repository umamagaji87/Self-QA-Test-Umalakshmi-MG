package TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "Features/PeronalInfo.feature"}
		, glue = { "StepDefination" }, plugin = { "pretty", "html:test-output",
				"json:test-json" }, monochrome = true, dryRun = false

)
public class TestRun {

}
