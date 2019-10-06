package vtiger;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public void login(ChromeDriver driver,String uname,String password) throws InterruptedException, IOException {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		WebElement username = driver.findElementById("username");
		js.executeScript("arguments[0].setAttribute('style','border: solid 2px blue');", username);
		username.sendKeys(uname);
		
		WebElement pwd = driver.findElementById("password");
		js.executeScript("arguments[0].setAttribute('style','border: solid 2px yellow');", pwd);
		pwd.sendKeys(password);
		
		WebElement signin = driver.findElementByXPath("//button[.='Sign in']");
		js.executeScript("arguments[0].setAttribute('style','border: solid 2px red');", signin);
		Screenshot sc = new Screenshot();
		sc.takeScreenshot(driver, "login.png");
		sc.takesScreenshotWithText(driver, "loginwithtext.png",signin);
		signin.click();
		
	}
	
	public boolean validateLoginPage(ChromeDriver driver) {
		try {
			driver.findElementById("username").isDisplayed();
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	

}
