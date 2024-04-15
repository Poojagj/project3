package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webTables {

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		//finding number of rows in the table
		int row_count=driver.findElements(By.xpath("//table[@class=\"dataTable\"]//tr")).size();
		System.out.println("Total number of rows in the table :" +row_count);

		int Col_count=driver.findElements(By.xpath("//table[@class=\"dataTable\"]//th")).size();
		System.out.println("Total number of rows in the table :" +Col_count);
		
		//find value of specific row/col data
		String value = driver.findElement(By.xpath("//table[@class=\"dataTable\"]//tbody//tr[3]//td[3]")).getText();
		System.out.println(value);
		
		//read data of the whole table
		for(int r=1; r<row_count; r++) {
			
			for(int c=1 ; c<=Col_count ; c++)
			{
				
				String cell_value = driver.findElement(By.xpath("//table[@class=\"dataTable\"]//tbody//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(cell_value+ "     ");
				
			}
			System.out.println();
			
		}
	}

}
