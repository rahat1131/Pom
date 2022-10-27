package lib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ExcelRead {

	Sheet sh;

	public ExcelRead(String filename, String sheetname) throws IOException {

		FileInputStream fis = new FileInputStream(filename);

		Workbook wb = new HSSFWorkbook(fis);

		sh = wb.getSheet(sheetname);

	}

	

	public Object[][] excelToArray() throws IOException {
		Object[][] t;
		int totalRows = sh.getPhysicalNumberOfRows();
		int totalcols = sh.getRow(0).getPhysicalNumberOfCells();

		t = new Object[totalRows - 1][totalcols];

		for (int r = 1; r < totalRows; r = r + 1) {

			for (int col = 0; col < totalcols; col = col + 1) {
				
				Cell c=sh.getRow(r).getCell(col);

			String value = "";

		

		
	

	



			if (c.getCellType() == Cell.CELL_TYPE_STRING) {

				value = c.getStringCellValue();

			}

			else {
				value = "" + c.getNumericCellValue();

			}
			
			t[r - 1][col] = value;
		}
		
	}
		return t;

}
}