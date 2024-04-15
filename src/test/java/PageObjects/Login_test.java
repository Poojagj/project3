package PageObjects;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_test {
	
	
	@Test
	public void logintest() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Example1_PageObjectClass_Facebook po1 = new Example1_PageObjectClass_Facebook(driver);
		
		
		po1.setUserName("abc");
		po1.setPassword("xyz");
		Thread.sleep(3000);
		po1.clickLoginBtn();
		
		
	}

}
