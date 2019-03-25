package Resources;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteToExcel {
	
	public void writeExcel(ArrayList<String> titles, String excelFilePath) throws IOException {
	    Workbook workbook = new XSSFWorkbook();
	    Sheet sheet = workbook.createSheet();
	 
	    int rowCount = 0;
	 
	    for (String title : titles) {
	        Row row = sheet.createRow(rowCount++);
	        writeTitle(title, row);
	    }
	    
	    try (FileOutputStream outputStream = new FileOutputStream(excelFilePath)) {
	        workbook.write(outputStream);
	    }
	    
	}
	    
	    
	   private void writeTitle(String title, Row row) {
	       Cell cell = row.createCell(0);        
	       cell.setCellValue(title);	    
	        	
	        
	    }
	       
	        
	        

}
	
	
	
	

