package Day7;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class waits {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element =mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Amazon miniTV']")));
		element.click();
		
		
		
		//Declaring Fluent Wait
				Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(100))
						.pollingEvery(Duration.ofSeconds(10)).ignoring(NoSuchElementException.class);

				WebElement Element = fluentWait.until(new Function<WebDriver, WebElement>()
				{
					public WebElement apply(WebDriver driver) 
					{
						return driver.findElement(By.xpath("//a[text()='Mobiles']"));

					}
				});

				Element.click();
	}

	

}
