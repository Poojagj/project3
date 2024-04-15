package TestRunners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features =".\\Features\\HooksDemo.feature",
		glue="StepDefinitions",
		plugin= {"pretty" , "html:target/cucumber-reports/hooksDemo.html"}
		)
public class TR_HooksDemo {

}
