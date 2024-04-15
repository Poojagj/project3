package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOperations {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
//		//Double Click
//		WebElement dbBtn=driver.findElement(By.xpath("//button[@id=\"doubleClickBtn\"]"));
//		Thread.sleep(3000);
//		act.doubleClick(dbBtn).perform();
//		
//		//Right Click
//		WebElement rcBtn=driver.findElement(By.xpath("//button[@id=\"rightClickBtn\"]"));
//		Thread.sleep(3000);
//		act.contextClick(rcBtn).perform();
//		
//		//Drag & Drop
//		driver.get("https://demoqa.com/droppable/");
//		
//		WebElement drag=driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
//		WebElement drop=driver.findElement(By.xpath("//div[@class=\"simple-drop-container\"]//div[@id=\"droppable\"]"));
//		
//		act.dragAndDrop(drag, drop).perform();
		
		//Click and Hold
		
		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		
		WebElement B = driver.findElement(By.xpath("//li[text()='B']"));
		WebElement A = driver.findElement(By.xpath("//li[text()='A']"));
		
		act.moveToElement(B);
		act.clickAndHold();
		act.moveToElement(A);
		act.release().perform();
		
		
		
		
		
		
		
		
		

	}

}
