package ec.edu.espol.workshops;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty","html:build/reports/cucumber-report.html"}
		,monochrome = true)
public class Runner {
	
}