package Day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/");

		driver.findElement(By.xpath("//span[@class='sc-gKclnd hSnAGZ']")).click();

		String ExpectedDate = "2";
		String ExpectedMonth = "November";
		String ExpectedYear = "2023";

		driver.findElement(By.xpath("//span[@class='sc-12foipm-22 oSYrJ fswDownArrow']")).click();

		while (true) {
			String StartMonthYear = driver.findElement(By.xpath("//div[@role=\"grid\"][1]//div[@class=\"DayPicker-Caption\"]")).getText();// September 2023

			String array[] = StartMonthYear.split(" ");// September , 2023
			String StartMonth = array[0]; // September
			String StartYear = array[1];// 2023

			// Month and Year Selection
			if (ExpectedMonth.equalsIgnoreCase(StartMonth) && ExpectedYear.equalsIgnoreCase(StartYear)) {

				break;
			}

			else {

				driver.findElement(By.xpath("//div[@class=\"DayPicker-NavBar\"]//span[@aria-label=\"Next Month\"]")).click();
			}

		}
		
		//Date Selection
		List<WebElement> allDates=driver.findElements(By.xpath("(//div[@role=\"rowgroup\"])[2]//div"));
		
		for(WebElement date :allDates)
		{
			
			if(date.getText().equals(ExpectedDate))
			{
				date.click();
			}
		}
		

	}

}
