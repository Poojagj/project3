package Day6;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multiplewindowID {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		//getWindowHandles() --> return unique id of all the browser windows open.
		
		driver.get("https://www.amazon.in/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.flipkart.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.myntra.com/");
		
		Set<String> allWindowIDs=driver.getWindowHandles();
		
		for(String id:allWindowIDs)
		{
			String title =driver.switchTo().window(id).getTitle();
			if(title.equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"))
			{
				driver.switchTo().window(id);
				break;
				
			}
			
		}
		
		
		
		
	}

}
