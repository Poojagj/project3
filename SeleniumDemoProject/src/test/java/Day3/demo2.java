package Day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		
		String url=driver.findElement(By.xpath("//a")).getAttribute("href");
		System.out.println(url);
		
		List <WebElement> allLinks = driver.findElements(By.xpath("//a"));
		int size=allLinks.size();
		
		System.out.println(size);
		
		for(WebElement link :allLinks )
		{
			
			System.out.println(link.getAttribute("href"));
		}
		
		driver.close();
		
	}

}
