package Day6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		//getWindowHandle() --> return unique id of the browser window.
		
		driver.get("https://www.amazon.in/");
		String AmazonID=driver.getWindowHandle();
		System.out.println(AmazonID);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.flipkart.com/");
		String fkID=driver.getWindowHandle();
		System.out.println(fkID);
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.myntra.com/");
		String mynID=driver.getWindowHandle();
		System.out.println(mynID);
		
		driver.switchTo().window(AmazonID);
		
		
		
		
		
		
	}

}
