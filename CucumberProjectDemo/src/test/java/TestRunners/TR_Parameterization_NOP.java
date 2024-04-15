package TestRunners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features =".\\Features\\Parameterization_NOP.feature",
		glue="StepDefinitions",
		plugin= {"pretty" , "html:target/cucumber-reports/ParamNopReport.html"}
		)
public class TR_Parameterization_NOP {

}
