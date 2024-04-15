package Day7;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream(".//Book2.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Students Data");
		
		for(int i =0 ; i <3 ; i++) {
			
			XSSFRow current_row=sheet.createRow(i);// create my current row
			
			for(int j=0 ; j<3 ; j++) {
				
				current_row.createCell(j).setCellValue("Cell input:"+j);
				
			}
		}
		
		workbook.write(file);
		file.close();
		
		System.out.println("Sheet closed");
		
		
		
		

	}

}
