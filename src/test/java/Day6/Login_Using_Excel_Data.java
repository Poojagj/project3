package Day6;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
//import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Using_Excel_Data {

	public static void main(String[] args) throws InterruptedException, IOException {


		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

//		FileInputStream file = new FileInputStream(".//Book2.xlsx");
//		XSSFWorkbook workbook = new XSSFWorkbook(file);
//		XSSFSheet sheet = workbook.getSheet("Sheet1");
//
//		int Row_Count = sheet.getLastRowNum();// returns row count in sheet
//
//		System.out.println("Number of Records :" + Row_Count);
//
//		// Reading data from each cell from each row.
//		for (int row = 1; row <= Row_Count; row++) {
//
//			XSSFRow current_row = sheet.getRow(row);// locate current row
//
//			String User_Name = current_row.getCell(0).getStringCellValue();
//			String Password = current_row.getCell(1).getStringCellValue();
//
////			System.out.println(User_Name);
////			System.out.println(Password);
//
//			driver.findElement(By.id("email")).sendKeys(User_Name);
//			driver.findElement(By.id("pass")).sendKeys(Password);
//
//			driver.findElement(By.name("login")).click();
//			
//			driver.get("https://www.facebook.com/");
//			
//
//		}
//
//		driver.close();

	}

}
