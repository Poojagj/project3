package day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
//		driver.findElement(By.xpath("//button[@id=\"alertButton\"]")).click();
//		Thread.sleep(3000);
//		driver.switchTo().alert().accept();

		
//		driver.findElement(By.xpath("//button[@id=\"timerAlertButton\"]")).click();
//		Thread.sleep(7000);
//		driver.switchTo().alert().accept();
		
		
//		driver.findElement(By.xpath("//button[@id=\"confirmButton\"]")).click();
//		Thread.sleep(3000);
//		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("//button[@id=\"promtButton\"]")).click();
		
		Alert alt = driver.switchTo().alert();
		Thread.sleep(2000);
		alt.sendKeys("TestUser");
		Thread.sleep(3000);
		alt.accept();
		
		
		
	}

}
