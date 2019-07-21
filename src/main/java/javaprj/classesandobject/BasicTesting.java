package javaprj.classesandobject;

public class BasicTesting {

	public static void main(String[] args) {

		String username = "atul";
		String password = "test123";
		String browser = "chrome";
		
		LoginPage lp = new LoginPage(browser, username,password);
		lp.submit();
		lp.submit(browser, username, password);
		lp.submit(browser, "rohit", "test1234");
		lp.invalidLoginSubmit();
		lp.invalidLoginSubmit(browser,username, password);

	}

}
