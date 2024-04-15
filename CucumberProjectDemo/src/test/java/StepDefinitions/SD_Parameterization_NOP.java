package StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.POC_Parameterization_NOP;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SD_Parameterization_NOP {
	
	WebDriver driver;
	POC_Parameterization_NOP obj;
	
	@Given("Launching chrome browser")
	public void launching_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		   
	}

	@Given("User open Test URL {string}")
	public void user_open_test_url(String url) {
		driver.get(url);
	}

	@When("User enters Email as {string} and {string}")
	public void user_enters_email_as_and(String usrnm, String pwd) {
		
		obj = new POC_Parameterization_NOP(driver);
		obj.setUsername(usrnm);
		obj.setPassword(pwd);
		
	}

	@When("user clicked on Login btn")
	public void user_clicked_on_login_btn() {
		obj.click_LoginBtn();
	   
	}

	@Then("User lands on Homepage with title {string}")
	public void user_lands_on_homepage_with_title(String exp_title) {
		
		String actual_Title = driver.getTitle();
		Assert.assertEquals(exp_title,actual_Title);

	}

	@Then("Close Browser")
	public void close_browser() {
		
		driver.close();
	    
	}

}
