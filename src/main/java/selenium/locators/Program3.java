package selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program3 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); // an instance of new browser of chrome will be launched
		
		driver.manage().window().maximize(); // will maximize 
		
		String URL = "http://localhost:9990/";
		
		driver.get(URL);
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("admin");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("admin");
		WebElement signIn = driver.findElementByXPath("//button[contains(text(),'Sign in')]");
		signIn.click();
		
		Thread.sleep(5000); // the parameter is in milliseconds
		driver.close(); // this will close the browser
		
	}
}
