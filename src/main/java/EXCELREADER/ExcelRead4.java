package EXCELREADER;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelRead4 {
	public static void main(String[] args) throws Exception {
		File file = new File("testdata/WorkBook1.xlsx");

		Workbook wb = null;
		if (file.exists()) {
			System.out.println("present");
			FileInputStream fis = new FileInputStream(file);

			if (file.getAbsolutePath().endsWith(".xlsx")) {
				wb = new XSSFWorkbook(fis);
			} else {
				wb = new HSSFWorkbook(fis);
			}

			Sheet sheet = wb.getSheet("Sheet1");
			Row row = null;
			Cell cell = null;
			String cellvalue = "";
			try {
				row = sheet.createRow(0);
				try {
					cell = row.createCell(0);
				} catch (Exception e) {
					
				}
			} catch (Exception e) {
			}
			
			cell.setCellValue("Hello world");

		} else {
			System.out.println("not present");
		}
		FileOutputStream fout = new FileOutputStream(file);
		wb.write(fout);
		fout.close();
		wb.close();
	}

}
