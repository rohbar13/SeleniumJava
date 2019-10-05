package EXCELREADER;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelRead3 {
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
				row = sheet.getRow(0);
				try {
					cell = row.getCell(0);
					cellvalue = cell.getNumericCellValue()+"";
				} catch (Exception e) {
					System.out.println("Cell exception");
					e.printStackTrace();
				}
			} catch (Exception e) {
				System.out.println("Row exception");
				e.printStackTrace();
			}

			System.out.println(cellvalue);
		} else {
			System.out.println("not present");
		}
		wb.close();
	}

}
