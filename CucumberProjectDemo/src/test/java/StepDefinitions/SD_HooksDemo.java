package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;

public class SD_HooksDemo {

	@Before
	public void beforeScenario() {

		System.out.println("This will execute before the scenario");
	}

	@After
	public void afterScenario() {

		System.out.println("This will execute after the scenario");
	}
	
	@BeforeStep
	public void beforeStep() {

		System.out.println("This will execute before each step");
	}
	
	@AfterStep
	public void afterStep() {

		System.out.println("This will execute after each step");
	}

	@Given("this is first step")
	public void this_is_first_step() {

	}

	@When("this is second step")
	public void this_is_second_step() {

	}

	@Then("this is third step")
	public void this_is_third_step() {

	}

}
