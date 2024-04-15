package DemoTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertions {
	WebDriver driver;
	
	@BeforeClass
	void Browser_Setup() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.navigate().refresh();
		
	}
	
	@Test(priority=1)
	void Amazon_miniTv() {
		
		WebElement AmznTV=driver.findElement(By.xpath("//a[text()='Amazon miniTV']"));
		Assert.assertTrue(AmznTV.isDisplayed());
		
	}
	
	@Test(priority=2)
	void titleVerification() {
		
		String Actual_Title=driver.getTitle();
		String Expected_Title="Onliiiine Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		Assert.assertEquals(Actual_Title,Expected_Title);
	}
	
	@Test(priority=3)
	void TitleVerification2() {
		
		SoftAssert softassert = new SoftAssert();
		String Actual_Title=driver.getTitle();
		String Expected_Title="Onliiiine Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		softassert.assertEquals(Actual_Title,Expected_Title);
	}
	
	
	@AfterClass
	void tearDown_Browser() {
		
		driver.close();
	}
	
	
	


}
