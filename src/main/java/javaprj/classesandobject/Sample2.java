package javaprj.classesandobject;

public class Sample2 {
	private static String username;
	
	public void addUser() {
		//code to add user
		username = "username001";
	}
	
	public void modifyUser() {
		//code to modifyuser
		username = username.concat("002");
		System.out.println(username);
	}
	
	public void deleteUser() {
		//code to delete
		System.out.println(username);
	}
	
}
