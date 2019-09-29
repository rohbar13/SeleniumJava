package vtiger;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserClass {

	public ChromeDriver launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}
	
	public void hiturl(ChromeDriver driver,String URL) {
		driver.get(URL);
	}
	
	public void closeBrowser(ChromeDriver driver) {
		driver.close();
	}
	
	
}
