package vtiger;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {

	public static void main(String[] args) {
		BrowserClass browser = new BrowserClass();
		ChromeDriver driver = browser.launchBrowser();
		browser.hiturl(driver, "http://localhost:9990/");
		WebElement username = driver.findElementById("username");
		username.sendKeys("admin");
		WebElement pwd = driver.findElementById("password");
		pwd.sendKeys("admin");
		WebElement signin = driver.findElementByXPath("//button[.='Sign in']");
		signin.click();
		
		String mainwindow = driver.getWindowHandle();
		System.out.println(mainwindow);
			
		WebElement feedback = driver.findElementByXPath("//a[@id='menubar_item_right_LBL_FEEDBACK']/img");
		feedback.click();
		
		WebElement documentation = driver.findElementByXPath("//a[@id='menubar_item_right_LBL_DOCUMENTATION']");
		documentation.click();
		
		Set<String> windowhandlesafterclick = driver.getWindowHandles();
		System.out.println(windowhandlesafterclick);
		System.out.println(windowhandlesafterclick.size());
		
		
		for(String temp:windowhandlesafterclick) {
		
			System.out.println("temp variable ----------"+temp);
			if(!mainwindow.equals(temp))
			{
				System.out.println("Other window found -------------");
				driver.switchTo().window(temp);
				if(driver.getPageSource().contains("Welcome to Vtiger 6!")) {
					System.out.println("If condition validated----------------------");
					System.out.println("Text found in new window");
				}
				driver.close();
			}			
		}
		driver.switchTo().window(mainwindow);
		
		//driver.close();
	}
}
