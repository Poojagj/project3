package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadiobtnNchkbx {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@value='Option 2']")).click();
		
		
		
		driver.findElement(By.xpath("//input[@value=\"checkbox2\"]")).click();
		driver.findElement(By.xpath("//input[@value=\"checkbox3\"]")).click();

	}

}
