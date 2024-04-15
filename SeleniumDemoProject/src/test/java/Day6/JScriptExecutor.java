package Day6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//refresh the webpage
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		Thread.sleep(3000);
//		js.executeScript("history.go[0]");
		
		//create an alert Pop up
//		js.executeScript("alert('This is my Alert ');");
//		Thread.sleep(3000);
//		driver.switchTo().alert().accept();
		
		//click action
//		driver.get("https://demoqa.com/alerts");
//		WebElement promptAlert=driver.findElement(By.xpath("//button[@id=\"promtButton\"]"));
//		js.executeScript("arguments[0].click()", promptAlert);
//		Alert alt = driver.switchTo().alert();
//		Thread.sleep(2000);
//		alt.sendKeys("TestUser");
//		Thread.sleep(3000);
//		alt.accept();
		
		//scroll the page height
//		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		//scroll to a particular webElement
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		WebElement fkviewAllBtn = driver.findElement(By.xpath("//body/div[@id='container']/div/div[@class='_6t1WkM _3HqJxg']/div[4]/div[1]/div[1]/div[1]/div[1]/a[1]"));
		js.executeScript("arguments[0].scrollIntoView();", fkviewAllBtn);
		
		fkviewAllBtn.click();
		
		
		
		
		

	}

}
