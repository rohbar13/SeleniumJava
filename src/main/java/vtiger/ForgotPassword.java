package vtiger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgotPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://localhost:9990/");
		driver.findElement(By.id("forgotPassword")).click();
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("emailId")).sendKeys("rohbar13@gmail.com");
		//driver.findElement(By.name("retrievePassword")).click();
		driver.findElement(By.xpath("//*[@id='backButton']/a")).click();
	}

}
