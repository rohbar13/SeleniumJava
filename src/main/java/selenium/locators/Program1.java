package selenium.locators;

import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); // an instance of new browser of chrome will be launched
		
		driver.manage().window().maximize(); // will maximize 
		
		String URL = "http://localhost:9990/";
		
		driver.get(URL);
		
		String expectedTitle = "Users";
		String actualTitle = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("Title match found : "+actualTitle);
		}else {
			System.out.println("Title match not found : "+actualTitle);
		}
		
		String actualURL = driver.getCurrentUrl();
		
		if(actualURL.contains(URL)) {
			System.out.println("URL match found : "+actualURL);
		}else {
			System.out.println("URL match not found : "+actualURL);
		}
		
		String expectedText = "Get more out of Vtiger";
		
		if(driver.getPageSource().contains(expectedText)) {
			System.out.println("Text match found : "+expectedText);
		}else {
			System.out.println("Text match not found : "+expectedText);
		}
		
		//System.out.println(driver.getPageSource()); // Prints the page source
		
		Thread.sleep(5000); // the parameter is in milliseconds
		driver.close(); // this will close the browser
		
	}

}
