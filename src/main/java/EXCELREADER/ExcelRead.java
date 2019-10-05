package EXCELREADER;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	public static void main(String[] args) throws Exception {

		File file = new File("testdata/WorkBook1.xlsx");

		if (file.exists()) {
			System.out.println("present");
			FileInputStream fis = new FileInputStream(file);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheet("Sheet1");
			XSSFRow row = sheet.getRow(0);
			XSSFCell cell = row.getCell(0);
			String cellvalue = cell.getStringCellValue();
			System.out.println(cellvalue);
		} else {
			System.out.println("not present");
		}

	}

}
