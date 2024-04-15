package DemoTestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class dataProvidertest {
	
	@Test(dataProvider="LoginCredentials")
	public void Facebook_Login(String userName , String password) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys(password);
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
		
		Thread.sleep(3000);
		driver.close();
	}
	

    @DataProvider(name="LoginCredentials")
	public Object[][] getData(){
		
		Object[][] data= {
				{"user1@gmaill.com" , "user1"},
				{"user2@gmaill.com" , "user2"},
				{"user3@gmaill.com" , "user3"},		
		};
		
		return data;
	}
}
