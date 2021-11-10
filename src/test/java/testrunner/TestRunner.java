package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\Users\\sonal\\eclipse-workspace\\BDDCucumberExtentReport\\src\\main\\java\\features"},
		glue = {"stepdefinitions", "AppHooks"},
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/"		
		},
				dryRun=false,
		tags = "@Test5"
		)
public class TestRunner {

}
