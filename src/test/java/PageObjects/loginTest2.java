package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginTest2 {

	@Test
	public void logintest() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		example2_POClass po2 = new example2_POClass(driver);
		
		po2.setUserName("demo1");
		po2.setPassword("demopwrd");
		Thread.sleep(3000);
		po2.clickLoginBtn();
		
	}
}
