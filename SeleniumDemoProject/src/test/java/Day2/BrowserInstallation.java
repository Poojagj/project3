package Day2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserInstallation {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
	
		WebDriverManager.chromedriver().setup();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		//navigations on browser
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.navigate().forward();
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		driver.navigate().to("https://www.facebook.com/");
		
//		driver.close();
		
		driver.quit();
		
		
		
		
		
		
		
		
		


		
		
		

	}

}
