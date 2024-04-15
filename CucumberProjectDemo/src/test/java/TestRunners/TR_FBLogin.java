package TestRunners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features =".\\Features\\FBLogin.feature",
		glue="StepDefinitions",
		plugin= {"pretty" , "html:target/cucumber-reports/FBLoginReport.html"}
		)
public class TR_FBLogin {

}
