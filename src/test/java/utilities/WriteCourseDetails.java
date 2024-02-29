package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteCourseDetails {
	public void writecoursedetails(String coursename,String ratings,String time,int r) throws IOException {
		
		
		FileInputStream fileIn = null;
		XSSFWorkbook workbook= null;
		XSSFSheet sheet = null;
		try {
		fileIn= new FileInputStream(System.getProperty("user.dir")+"\\testdata\\courseDetails.xlsx");
		}
		catch(FileNotFoundException e) {
			fileIn = null;
		}
		if(fileIn == null) {
			workbook = new XSSFWorkbook();
		}else {
			workbook=new XSSFWorkbook(fileIn);
		}
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\courseDetails.xlsx");

		if(fileIn == null) {
			sheet = workbook.createSheet();
		}
		else {
			sheet = workbook.getSheetAt(0);
		}
		XSSFRow row2=sheet.createRow(r);
		row2.createCell(0).setCellValue(coursename);
		row2.createCell(1).setCellValue(ratings);
		row2.createCell(2).setCellValue(time);
			
		
		if(fileIn != null) {
			fileIn.close();
		}
		
		
		workbook.write(file);
		workbook.close();
		file.close();
		
		
	}
}
