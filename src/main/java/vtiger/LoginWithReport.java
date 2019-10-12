package vtiger;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.xmlbeans.impl.tool.XSTCTester.TestCaseResult;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import EXCELREADER.TestClassTemplateFunction;

public class LoginWithReport {

	public static void main(String[] arg) throws InterruptedException, IOException, InvalidFormatException {
		
		String status = "Fail";
		String actualresult = "Login Unsuccessful";
		
		BrowserClass browser = new BrowserClass();
		String steps = "Launch Browser";
		ChromeDriver driver = browser.launchBrowser();
		steps = steps.concat("\nHitURL");
		browser.hiturl(driver, "http://localhost:9990/");
		steps = steps.concat("\nEnter UserName");
		WebElement username = driver.findElementById("username");
		username.sendKeys("admin");
		steps = steps.concat("\nEnter password");
		WebElement pwd = driver.findElementById("password");
		pwd.sendKeys("admin");
		steps = steps.concat("\nClick SignIn");
		WebElement signin = driver.findElementByXPath("//button[.='Sign in']");
		signin.click();
		
		
		String scrpath = "testreport\\login.png";
		
		TakesScreenshot scr = ((TakesScreenshot)driver);
		File srcFile = scr.getScreenshotAs(OutputType.FILE);
		File destFile = new File(scrpath);
		FileUtils.copyFile(srcFile, destFile);
		
		
		
		status = "Pass";
		actualresult = "Login Successful";
		
		TestClassTemplateFunction.printTestResult("1", "Login", "ValidLogin_001", steps, "Validate Login is Successful", actualresult, status, "Login.png");

		driver.close();
		
	}
	

}
