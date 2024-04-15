package DemoTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class reporters {
	WebDriver driver;
	@Test
	@Parameters({"Browser" ,"TestURL"})
	void Browser_Setup(String browser , String URL) throws InterruptedException {
		
		if(browser.equalsIgnoreCase("chrome"))
		{
		Reporter.log("Launching Chrome Browser");	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		Reporter.log("Chrome Browser launched Successfully");
		}
		
		else if(browser.equalsIgnoreCase("firefox"))
		{
			Reporter.log("Launching Firefox Browser");	
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			Reporter.log("Firefox Browser launched Successfully");
		}
		else
		{
			Reporter.log("Launching Edge Browser");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			Reporter.log("Edge Browser launched Successfully");
		}
		driver.manage().window().maximize();
		driver.get(URL);
		driver.navigate().refresh();
	}
	
	
	@Test
	void titleVerification() {
		
		Reporter.log("Verification started for Page Title");
		String Actual_Title=driver.getTitle();
		String Expected_Title="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		Assert.assertEquals(Actual_Title,Expected_Title);
		Reporter.log("Verification for Page Title -Successfull");
	}
	
	
	@AfterClass
	void tearDown_Browser() {
		Reporter.log("Closing Browser");
		driver.close();
		Reporter.log("Closed Browser");
	}

}
