package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NestedFrames {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demoqa.com/nestedframes");
		driver.manage().window().maximize();
		
		//switching to Parent Frame 
		driver.switchTo().frame("frame1");
		String pFText=driver.findElement(By.xpath("//body")).getText();
		System.out.println(pFText);
		
		//switching to Child Frame
		driver.switchTo().frame(0);
		String CFText=driver.findElement(By.xpath("//body")).getText();
		System.out.println(CFText);
		
//		driver.switchTo().parentFrame();
//		String pF2Text=driver.findElement(By.xpath("//body")).getText();
//		System.out.println(pF2Text);
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-1']")).click();
	 
//		driver.close();
		

	}

}
