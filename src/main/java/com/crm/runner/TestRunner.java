package com.crm.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "C:\\Users\\Gopi Srinivas Putta\\eclipse-workspace\\CucumberPOM\\src\\main\\java\\com\\crm\\features\\freecrm.feature",
		glue = {"com/crm/stepDefinitions"},
		monochrome=true,
		strict=true,
		dryRun=false
		)

public class TestRunner {

}
