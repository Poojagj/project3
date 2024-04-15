package Day7;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream(".//Book1.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int Row_Count=sheet.getLastRowNum();// return row count in the Sheet
		int Column_Count=sheet.getRow(0).getLastCellNum();// return column count in the Sheet
		
		//Read data from each cell 
		
		for(int i=0 ;i<Row_Count; i++) {
			
			XSSFRow current_row = sheet.getRow(i); // return current row
			
			for(int j=0 ; j<Column_Count ;j++ ) {
				
				String Cell_value=current_row.getCell(j).toString();
				System.out.print("  "+Cell_value);
			}
			
			System.out.println();
		}

		
	}

}
