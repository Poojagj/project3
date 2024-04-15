package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageObjects.PO_FBLogin;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SD_FBLogin {
	
	WebDriver driver;
	PO_FBLogin obj;
	
	@Given("The user launches Chrome browser")
	public void the_user_launches_chrome_browser() {
		
	 System.setProperty("webdriver.chrome.driver","");
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	  
	}

	@Given("User opens Facebook Login Page")
	public void user_opens_facebook_login_page() {
		
		driver.get("https://www.facebook.com/");
	}

	@When("The user enters valid username and valid password")
	public void the_user_enters_valid_username_and_valid_password() throws InterruptedException {
		obj= new PO_FBLogin(driver);
		obj.setUserName("user1");
		obj.setPassword("password1");
		Thread.sleep(3000);
	}

	@When("the user clicks on login btn")
	public void the_user_clicks_on_login_btn() {
		obj.clickLoginBtn();
	    
	}

	@Then("User lands on Facebook home page")
	public void user_lands_on_facebook_home_page() {
		
		driver.close();
	  
	}

}
