package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:/Users/monika/Documents/CucumberFrameWork/src/test/resources/functionalTest",
				glue= {"stepDefinitions"}
		)
public class TestRunner {
}