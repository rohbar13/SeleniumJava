package javaprj.interfaces;

public class FirefoxDriver implements WebDriver{
	public FirefoxDriver() {
		System.out.println("Opens a new instance of firefox browser");
	}

	@Override
	public void hitURL(String URL) {
		System.out.println("This method will hit the URL on firefox");
	}
	
	public void quitDriver(WebDriver driver) {
		System.out.println("Quit firefox Driver");
	}
}
