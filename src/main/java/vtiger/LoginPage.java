package vtiger;

import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public void login(ChromeDriver driver,String uname,String password) {
		driver.findElementById("username").sendKeys(uname);
		driver.findElementById("password").sendKeys(password);
		driver.findElementByXPath("//button[.='Sign in']").click();
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
