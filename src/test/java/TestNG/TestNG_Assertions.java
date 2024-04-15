package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG_Assertions {
	
	WebDriver driver;
	@BeforeClass
	void setup_Browser() {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	
	@Test
	void Search_Box() throws InterruptedException {
		
		WebElement searchBox=driver.findElement(By.name("field-keywords"));
		Assert.assertTrue(searchBox.isDisplayed(),"Search Box not displayed");//Message displayed when assertion fails
//		Assert.assertFalse(searchBox.isDisplayed());//if want to perform negative test
		
	}
	
	@Test
	void Home_Page_2() throws InterruptedException {
		
		String Actual_Title=driver.getTitle();
		String Expected_Title = "Onliine Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		Assert.assertEquals(Actual_Title, Expected_Title,"Title Not matched");
		
	}
	
	@Test
	void Home_Page_3() throws InterruptedException {
		
	SoftAssert softassert = new SoftAssert();
   
	String Actual_Title=driver.getTitle();
	String Expected_Title = "Onliine Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
    softassert.assertEquals(Actual_Title, Expected_Title,"Title Not matched");
    

	}
	
	@AfterClass
	void close_Browser() {
		
		 driver.close();
	}
}
