package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PageObject_Main_Class {

	
	@Test
	public void Login_Test() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//		Example_Page_Object_Class_Facebook POE = new Example_Page_Object_Class_Facebook(driver);
		
		Example_Page_Object_Class_Facebook_2 POE2 = new Example_Page_Object_Class_Facebook_2(driver);
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		POE2.setUserName("abc");
		POE2.setPassword("xyz");
		Thread.sleep(3000);
		POE2.clickLoginBtn();
		
		
		
	}
}
