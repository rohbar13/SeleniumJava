package vtiger;

import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
	
	public void selectModule(ChromeDriver driver,String moduleName) {
		
		switch(moduleName.toLowerCase()) {
		
		case "leads":
			driver.findElementById("menubar_item_Leads").click();
			break;
			
		case "contacts":
			driver.findElementById("menubar_item_Contacts").click();
			break;
			
		case "products":
			driver.findElementById("menubar_item_Products").click();
			break;
			
		default:
			System.out.println("Work in progress");
			
		}
		
	}
	
	
	public boolean validateHomePage(ChromeDriver driver) {
		try {
			driver.findElementByXPath("//img[@title='Home']").isDisplayed();
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	
	public void logout(ChromeDriver driver) {
		driver.findElementById("menubar_item_right_Administrator").click();
		driver.findElementById("menubar_item_right_LBL_SIGN_OUT").click();
		
	}
}
