package TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features =".\\Features\\DemoTags.feature",
		glue="StepDefinitions",
		tags="@sanity and not @regression",
		plugin= {"pretty" , "html:target/cucumber-reports/DemotagsReport.html"}
		)

public class TR_DemoTags {

}
