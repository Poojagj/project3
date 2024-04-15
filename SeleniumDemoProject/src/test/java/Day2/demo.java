package Day2;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class demo {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
//		String fbID = driver.getWindowHandle();
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.flipkart.com/");
//		String fkID = driver.getWindowHandle();

		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.myntra.com/");
//		String MyID = driver.getWindowHandle();
		
//		driver.switchTo().window(fbID);
		  Set<String> AllWindowIDs = driver.getWindowHandles();
		  for (String id : AllWindowIDs)
	         {
	        	 String title=driver.switchTo().window(id).getTitle();
	        	 if(title.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!")) 
	        	 { driver.switchTo().window(id);
	        		break; 
	        	 }
	        
	         }
	}

}
