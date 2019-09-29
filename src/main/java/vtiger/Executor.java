package vtiger;

import org.openqa.selenium.chrome.ChromeDriver;

public class Executor {
	public static void main(String[] args) throws InterruptedException {

		BrowserClass browser = new BrowserClass();
		ChromeDriver driver = browser.launchBrowser();
		browser.hiturl(driver, "http://localhost:9990/");
		
		LoginPage lp = new LoginPage();
		lp.login(driver,"admin","admin");
		
		HomePage hp = new HomePage();
		boolean loginsuccess = hp.validateHomePage(driver);
		
		if(loginsuccess==false) {
			System.out.println("-----------Login was unsuccessful-------------");
		}else {
			System.out.println("-----------Login Successful---------------");
		}
		
		
			
		hp.selectModule(driver, "Leads");
		
		LeadClass lc = new LeadClass();
		lc.addLead(driver,"Testing");
		
		hp.selectModule(driver, "Leads");
		
		lc.selectLead(driver,"Testing");
		
		lc.deleteLead(driver);
		
		hp.logout(driver);
		
		if(lp.validateLoginPage(driver)==true) {
			System.out.println("---------Successfully loged out---------");
		}else {
			System.out.println("-------Logout failed-------");
		}
		
		browser.closeBrowser(driver);
		
		
		
	}
}
