package Day6;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Write_data {

	public static void main(String[] args) throws IOException {

		 FileOutputStream file = new FileOutputStream(".//Book3.xlsx");
		 
		// workbook object
		XSSFWorkbook workbook = new XSSFWorkbook();

		// spreadsheet object
		XSSFSheet sheet = workbook.createSheet(" Student Data ");
		
		for (int i = 0; i < 6; i++) {

			XSSFRow current_row = sheet.createRow(i);// create current row

			for (int j = 0; j < 3; j++) {

				current_row.createCell(j).setCellValue("Cell Input :"+j);
			}
			
		}
		workbook.write(file);
		file.close();
		
		System.out.println("Sheet closed");
		
		
		
		
		
	}

}
