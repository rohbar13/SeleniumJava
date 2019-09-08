package selenium.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); // an instance of new browser of chrome will be launched
		
		driver.manage().window().maximize(); // will maximize 
		
		String URL = "http://localhost:9990/";
		
		driver.get(URL);
		
		List<WebElement> linkText = driver.findElementsByTagName("a");
		System.out.println("# of links : "+linkText.size());
		
		for(int i=0;i<linkText.size();i++) {
			if(!linkText.get(i).getText().isEmpty())
			{
				System.out.println(i +" : "+ linkText.get(i).getText());
			}
		}
		
		WebElement vtigerWebsite = driver.findElementByLinkText("Vtiger Website");
		vtigerWebsite.click();
		
		Thread.sleep(5000); // the parameter is in milliseconds
		driver.close(); // this will close the browser
		
	}
}
