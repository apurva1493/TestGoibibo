package runner;

import org.junit.runner.RunWith; 

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		strict = true,
		features = "src/test/java/Feature",
glue = "steps",
plugin = { "pretty", "html:target/cucumber-reports" },
monochrome = true,
tags = {}
)
public class TestRunner {

}
