package javaprj.interfaces;

public class ChromeDriver implements WebDriver{

	public ChromeDriver() {
		System.out.println("Opens a new instance of chrome browser");
	}

	@Override
	public void hitURL(String URL) {
		System.out.println("This method will hit the URL on chrome");
	}
	
	public void quitDriver(WebDriver driver) {
		System.out.println("Quit chrome Driver");
	}

	
	
}
