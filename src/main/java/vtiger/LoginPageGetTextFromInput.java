package vtiger;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageGetTextFromInput {

	public static void main(String[] args) throws IOException {

		//Fetch text from a text box 
		
		BrowserClass browser = new BrowserClass();
		ChromeDriver driver = browser.launchBrowser();
		browser.hiturl(driver, "http://localhost:9990/");
		WebElement username = driver.findElementById("username");
		username.sendKeys("admin");
		WebElement pwd = driver.findElementById("password");
		pwd.sendKeys("admin");

		System.out.println(username.getAttribute("value"));
		System.out.println(pwd.getAttribute("value"));
		
		TakesScreenshot scr = ((TakesScreenshot)driver);
		File srcfile = scr.getScreenshotAs(OutputType.FILE);
		File desfile = new File("screenshot//login_1.png");
		//import common.io jar to use fileutil class
		FileUtils.copyFile(srcfile, desfile);
		
	}
}
