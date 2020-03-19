package util;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import actions.DisneyActions;
import controller.DisneyConrtollers;

public class DisneyUtil extends DisneyActions{
	
	public String[][] dataSheet(String dataFile) throws IOException {
		String[][] data = null;
		FileInputStream file = new FileInputStream(dataFile);
		XSSFWorkbook book = new XSSFWorkbook(file);
		XSSFSheet sheet = book.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();
		int colCount = sheet.getRow(0).getLastCellNum();
		data = new String [rowCount][colCount];
		for (int i=1;i<=rowCount;i++) {
			XSSFRow row = sheet.getRow(i);
			for(int j=0;j<colCount;j++) {
				String value = row.getCell(j).getStringCellValue();
				data [i-1][j] = value;
				System.out.println(value);
			}
		}
		
		
		
		return data;
		
	}
	

}
