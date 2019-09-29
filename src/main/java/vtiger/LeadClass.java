package vtiger;

import org.openqa.selenium.chrome.ChromeDriver;

public class LeadClass {

	public void addLead(ChromeDriver driver,String name) {
		driver.findElementById("Leads_listView_basicAction_LBL_ADD_RECORD").click();
		driver.findElementById("Leads_editView_fieldName_firstname").sendKeys(name);
		driver.findElementById("Leads_editView_fieldName_lastname").sendKeys("last");
		driver.findElementByXPath("//div[@class='contentHeader row-fluid']//button[@type='submit']").click();
	
		String firstName = driver.findElementByXPath("//label[.='First Name']/ancestor::tr[1]/td[2]").getText();
	
		if(firstName.trim().equalsIgnoreCase("Test")) {
			System.out.println("-------------Lead Added--------------");
		}else {
			System.out.println("---------------Lead Not added--------------");
		}
	}
	
	public void selectLead(ChromeDriver driver,String name) {
		driver.findElementByXPath("//td[@data-field-type='salutation']/a[.='"+name+"']/ancestor::tr[1]//input[1]").click();
	}
	
	public void deleteLead(ChromeDriver driver) throws InterruptedException {
		driver.findElementByXPath("//button[@data-toggle='dropdown']").click();
		driver.findElementByXPath("//li[@id='Leads_listView_massAction_LBL_DELETE']/a").click();
		Thread.sleep(5000);
		driver.findElementByXPath("//*[@class='modal-footer']/a[contains(text(),'Yes')]").click();
	}
	
}
