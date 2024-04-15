package TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={".\\Features\\mutipleScenario.feature",
				".\\Features\\Demo1.feature"},
		glue="StepDefinitions",
		plugin= {"pretty","html:target/cucumber-reports/reports.html"}
		)
public class TR_multipleScenarios {

}
