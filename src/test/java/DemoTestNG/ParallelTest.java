package DemoTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTest {
	
	WebDriver driver;
	
	@Test
	void HomePageTitle() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	
		driver.get("https://www.amazon.in/");
		driver.navigate().refresh();
		String Actual_Title=driver.getTitle();
		String Expected_Title="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		Assert.assertEquals(Actual_Title,Expected_Title);
		driver.close();
	}
	
	@Test
	void AmazonMininTv() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.navigate().refresh();
		WebElement AmznTV=driver.findElement(By.xpath("//a[text()='Amazon miniTV']"));
		Assert.assertTrue(AmznTV.isDisplayed());
		driver.close();
	}

}
