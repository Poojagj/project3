package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SD_Demo1 {
	
	@Given("User launches the browser")
	public void user_launches_the_browser() {

		System.out.println("browser launched");
	}

	@Given("launches login Page")
	public void launches_login_page() {
		System.out.println("Login Page launched");
	}
	   

	@When("Enter username and password")
	public void enter_username_and_password() {
		System.out.println("Entering UN and PW");
	}

	@When("click on login button")
	public void click_on_login_button() {
		System.out.println("Click on login btn");
	}

	@Then("user lands on Homepage")
	public void user_lands_on_homepage() {
		System.out.println("Verify home page");
	}

}
