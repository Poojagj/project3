package DemoTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DP2 {

	@Test(dataProvider="LoginCredentials" , dataProviderClass=dataProvidertest.class)
	public void Facebook_Login(String userName, String password) throws InterruptedException {

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

}
