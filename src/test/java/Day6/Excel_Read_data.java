package Day6;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class Excel_Read_data {

	public static void main(String[] args) throws IOException {

		FileInputStream file = new FileInputStream(".//Book1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int Row_Count = sheet.getLastRowNum();// returns row count in sheet
		int Cell_Count = sheet.getRow(0).getLastCellNum();// return column count in sheet

		// Reading data from each cell from each row.
		for (int i = 0; i < Row_Count; i++) {

			XSSFRow current_row = sheet.getRow(i);// locate current row

			for (int j = 0; j < Cell_Count; j++) {

				String Cell_value = current_row.getCell(j).toString();
				System.out.print("   " + Cell_value);
			}
			System.out.println("");
		}

	}

}
