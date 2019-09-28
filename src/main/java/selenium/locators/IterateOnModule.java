package selenium.locators;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IterateOnModule {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); // an instance of new browser of chrome will be launched
		
		driver.manage().window().maximize(); // will maximize 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String URL = "http://localhost:9990/";
		
		driver.get(URL);
		
		/*
		 * WebElement username = driver.findElement(By.id("username"));
		 * username.sendKeys("admin"); WebElement password =
		 * driver.findElement(By.id("password")); password.sendKeys("admin"); WebElement
		 * signIn = driver.findElementByXPath("//button[contains(text(),'Sign in')]");
		 * signIn.click();
		 */
		
		List<WebElement> module_element = driver.findElements(By.xpath("//div[@class='helpLinks']/a"));
		System.out.println(module_element.size());
		
		for(WebElement temp:module_element) {
			module_element = driver.findElements(By.xpath("//div[@class='helpLinks']/a"));
			System.out.println(temp.getText());
			temp.click();
			driver.navigate().back();
			module_element = driver.findElements(By.xpath("//div[@class='helpLinks']/a"));
		}
		
		Thread.sleep(5000); // the parameter is in milliseconds
		driver.close(); // this will close the browser
		
	}

}
