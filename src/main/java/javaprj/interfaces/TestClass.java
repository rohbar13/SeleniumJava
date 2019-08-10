package javaprj.interfaces;

public class TestClass {

	String browserName = "chrome";
	
	public static void main(String[] args) {
		TestClass tc = new TestClass();
		tc.loginFeature();
	}
	
	public void loginFeature() {
		WebDriver driver = null;
		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("chrome"))
		{
			driver = new FirefoxDriver();
		}
		closeBrowser(driver);
	}
	
	public void openURL(WebDriver driver,String URL) {
		driver.hitURL("http://google.com");
	}
	
	public void closeBrowser(WebDriver driver) {
		driver.quitDriver(driver);
	}
	
	
}
