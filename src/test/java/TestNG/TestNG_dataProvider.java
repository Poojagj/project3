package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_dataProvider {
	
	
	@Test(dataProvider = "LoginUserCredentials")
	public void Facebook_Login(String userName , String password) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys(userName);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(3000);
		driver.close();
	}
	
	@DataProvider(name="LoginUserCredentials")
	public Object[][] getData(){
		
		Object[][] data = { {"user1@gmail.com","user1"},{"user2@gmail.com","user2"},{"user3@gmail.com","user3"}};
		
		return data;
	}

}
	