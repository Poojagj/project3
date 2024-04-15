package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropDown {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
		
		
		WebElement date=driver.findElement(By.xpath("//select[@id=\"day\"]"));
		Select dt = new Select(date);
//		dt.selectByIndex(9);
//		dt.selectByValue("16");
		dt.selectByVisibleText("31");
		
		WebElement month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
		Select mt=new Select(month);
//		mt.selectByIndex(2);
//		mt.selectByValue("10");
		mt.selectByVisibleText("Dec");
		
		
	}

}
