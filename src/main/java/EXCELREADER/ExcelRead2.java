package EXCELREADER;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead2 {
	public static void main(String[] args) throws Exception {

		File file = new File("testdata/WorkBook1.xlsx");

		if (file.exists() && file.getAbsolutePath().endsWith(".xlsx")) {
			System.out.println("present");
			FileInputStream fis = new FileInputStream(file);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheet("Sheet1");
			XSSFRow row = sheet.getRow(0);
			XSSFCell cell = row.getCell(0);
			String cellvalue = cell.getStringCellValue();
			System.out.println(cellvalue);
		} else if (file.exists() && file.getAbsolutePath().endsWith(".xls")) {
			System.out.println("present");
			FileInputStream fis = new FileInputStream(file);
			HSSFWorkbook wb = new HSSFWorkbook(fis);
			HSSFSheet sheet = wb.getSheet("Sheet1");
			HSSFRow row = sheet.getRow(0);
			HSSFCell cell = row.getCell(0);
			String cellvalue = cell.getStringCellValue();
			System.out.println(cellvalue);
		} else {
			System.out.println("not present");
		}

	}

}
