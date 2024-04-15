package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cssSelector {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

//		driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
//		
//		driver.findElement(By.cssSelector("#email")).sendKeys("abc");
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		//click on best sellers 
//		driver.findElement(By.cssSelector("[data-csa-c-content-id='nav_cs_bestsellers']")).click();
		
		//clicking on Today's Deal   
//		driver.findElement(By.cssSelector("a.nav-a[data-csa-c-slot-id=\"nav_cs_3\"]")).click();
		
		//clicking amazon mini tv 
//		driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_0']")).click();
		
		//click on Mobiles 
//		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
		
		//give input to my search box 
		WebElement searchBox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		searchBox.sendKeys("jeans for men");
		Thread.sleep(3000);
		searchBox.clear();
		System.out.println(searchBox.getAttribute("aria-label"));
		String tag=searchBox.getTagName();
		System.out.println(tag);
		System.out.println(searchBox.isDisplayed());
		

	}

}
