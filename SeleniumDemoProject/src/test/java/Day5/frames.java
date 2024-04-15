package Day5;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frames {
	WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		
		
//		driver.switchTo().frame(3); //--> by index
//		driver.switchTo().frame("frame1"); // --> using id value
		
		WebElement frame1Locator = driver.findElement(By.xpath("//iframe[@id=\"frame1\"]"));
		driver.switchTo().frame(frame1Locator); // using the frame locator
		
		
		String frame1Text =driver.findElement(By.xpath("//h1[@id=\"sampleHeading\"]")).getText();
		System.out.println(frame1Text);
		driver.close();

	}
	
	

}
