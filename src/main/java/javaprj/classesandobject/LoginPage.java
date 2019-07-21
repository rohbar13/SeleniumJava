package javaprj.classesandobject;

public class LoginPage {

	String username;
	String password;
	String browserName;
	
	public LoginPage(String browser,String user,String pass) {
		username = user;
		password = pass;
		browserName = browser;
	}
	
	public void submit() {
		System.out.println("Open Browser "+browserName);
		System.out.println(username);
		System.out.println(password);
		System.out.println("Click on Submit Button");
	}
	
	public void submit(String browser,String username, String password) {
		System.out.println("Open Browser "+browser);
		System.out.println(username);
		System.out.println(password);
		System.out.println("Click on Submit Button");
	}
	
	public void invalidLoginSubmit(String browser,String username,String password) {
		System.out.println("Open Browser "+browser);
		System.out.println(username);
		System.out.println(password);
		System.out.println("Click on Submit Button");
	}
	
	public void invalidLoginSubmit() {
		System.out.println("Open Browser "+browserName);
		System.out.println(username);
		System.out.println(password);
		System.out.println("Click on Submit Button");
	}
	
	
	
}
