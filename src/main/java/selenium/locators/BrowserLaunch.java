package selenium.locators;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch {

	
	
	WebDriver driver = null;
	
	public static void main(String[] args) throws IOException {
		BrowserLaunch brlaunch = new BrowserLaunch();
		brlaunch.login();
		
	}
	
	public void login() throws IOException {
		WebDriver driver = getBrowser();
	}
	
	public WebDriver getBrowser() throws IOException {
		PropertyReader prop = new PropertyReader("build.properties");
		String browserName = prop.getValue("browserName");
		
		switch (browserName) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://www.gmail.com");
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(prop.getValue("url"));
			break;
		}
		
		return driver;
		
	}
}
