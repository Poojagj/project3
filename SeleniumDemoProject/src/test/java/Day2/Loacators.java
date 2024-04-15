package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loacators {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		WebDriverManager.chromedriver().setup();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		WebElement Email_input = driver.findElement(By.id("email"));
		Email_input.sendKeys("abc");
		
		driver.findElement(By.id("pass")).sendKeys("xyz");
		
//		driver.findElement(By.tagName("button")).click();
		
//		driver.findElement(By.linkText("Create new account")).click();
	
		driver.findElement(By.partialLinkText("Create new")).click();
		
//		driver.findElement(By.xpath("//a[@id=\"u_0_0_lu\"]")).click();
		

	}

}
