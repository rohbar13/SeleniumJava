package javaprj.controlflow;

public class TernaryOperators {
	public static void main(String[] args) {
		int x = 10;
		
		int b = x>15?sum():sub();
		System.out.println(b);
		
	}
	
	public static int sum() {
		System.out.println("1st method");
		return 10;
	}
	public static int sub() {
		System.out.println("2nd method");
		return 15;
	}
	
	
}
