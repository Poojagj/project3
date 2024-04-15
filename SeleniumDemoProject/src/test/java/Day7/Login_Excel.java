package Day7;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Excel {

	public static void main(String[] args) throws IOException, InterruptedException {
	
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
        FileInputStream file = new FileInputStream(".//Login.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int Row_Count=sheet.getLastRowNum();// return row count in the Sheet
		
		//Reading data from each cell
		for(int row = 1; row<Row_Count ; row++) {
			
			XSSFRow current_row =sheet.getRow(row);// return current row
			
			String userName=current_row.getCell(0).getStringCellValue();
			String passWord=current_row.getCell(1).getStringCellValue();
			
			driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys(userName);
			driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys(passWord);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
			
		}

	}

}
