package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"Features"}
		,glue={"stepDefinations"},
		plugin = { "pretty", "html:target/cucumber-reports" },
		monochrome = true,
		tags = {}
		)
public class TestRunner {

	

}
