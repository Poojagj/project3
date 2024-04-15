package TestRunners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features =".\\Features\\BackgroundDemo.feature",
		glue="StepDefinitions",
		plugin= {"pretty" , "html:target/cucumber-reports/backgroundDemo.html"}
		)
public class TR_BackgroundDemo {

}
