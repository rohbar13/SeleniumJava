package EXCELREADER;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.common.usermodel.HyperlinkType;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Color;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Hyperlink;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestClassTemplateFunction {

	public static void printTestResult(String srno,String screnario,String tcname,String steps,String exp,String act,String status,String scrshot) throws InvalidFormatException, IOException {

		String reportname = "TestReport.xlsx";
		
		File folder = new File("testreport");
		if(!folder.exists()) {
			folder.mkdir();
		}
		String reportpath = folder.getAbsolutePath()+File.separator+reportname;
		
		File report = new File(reportpath);
		if(!report.exists())
		{
			Workbook wb = new XSSFWorkbook();
			Sheet sh = wb.createSheet("TestCases");
			
			Row row = sh.createRow(0);
			
			row.createCell(0).setCellValue("Sr. No.");
			row.createCell(1).setCellValue("Scenario#");
			row.createCell(2).setCellValue("TestCaseName");
			row.createCell(3).setCellValue("TestSteps");
			row.createCell(4).setCellValue("Expected");
			row.createCell(5).setCellValue("Actual");
			row.createCell(6).setCellValue("Status");
			row.createCell(7).setCellValue("Screenshot");
			
		    FileOutputStream fout = new FileOutputStream(reportpath); 
		    wb.write(fout);
		    fout.close();
		    wb.close();
		}
		
		
		FileInputStream fis = new FileInputStream(reportpath);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sh = wb.getSheet("TestCases");
		
		Row row = sh.createRow(sh.getLastRowNum()+1);
		Cell cell0 = row.createCell(0);
		cell0.setCellValue(srno);
		Cell cell1 = row.createCell(1);
		cell1.setCellValue(screnario);
		Cell cell2 = row.createCell(2);
		cell2.setCellValue(tcname);
		Cell cell3 = row.createCell(3);
		cell3.setCellValue(steps);
		Cell cell4 = row.createCell(4);
		cell4.setCellValue(exp);
		Cell cell5 = row.createCell(5);
		cell5.setCellValue(act);
		
		Cell cell6 = row.createCell(6);
		cell6.setCellValue(status);
		
		if(status.equalsIgnoreCase("pass")) {
			CellStyle backgroundStyle = wb.createCellStyle();
			backgroundStyle.setFillForegroundColor(IndexedColors.GREEN.getIndex());
	        backgroundStyle.setFillPattern(FillPatternType.DIAMONDS);
	        cell6.setCellStyle(backgroundStyle);
		}
		
		
		
		
		Cell cell7 = row.createCell(7);
	    CellStyle hlinkstyle = wb.createCellStyle();

	    Font font = wb.createFont();
	    font.setColor(IndexedColors.BLUE.getIndex());
	    	    
	    CreationHelper cp = wb.getCreationHelper();
		Hyperlink lnk = cp.createHyperlink(HyperlinkType.FILE);
		
		hlinkstyle.setFont(font);
		
		cell7.setCellValue("Screenshot");
		System.out.println(""+scrshot);
		lnk.setAddress(scrshot);
		cell7.setHyperlink(lnk);
	    cell7.setCellStyle(hlinkstyle);
				
		sh.autoSizeColumn(0);
		sh.autoSizeColumn(1);
		sh.autoSizeColumn(2);
		sh.autoSizeColumn(3);
		sh.autoSizeColumn(4);
		sh.autoSizeColumn(5);
		sh.autoSizeColumn(6);
		sh.autoSizeColumn(7);
		
		
		FileOutputStream fout = new FileOutputStream(reportpath); 
	    wb.write(fout);
	    fout.close();
	    wb.close();
		
		
	}
}
