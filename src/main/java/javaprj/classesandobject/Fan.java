package javaprj.classesandobject;

public class Fan {

	public Fan() {
		System.out.println("Constructor calling");
	}
	
	static int x;
	
	static {
		x = 20;
		System.out.println(x);
	}

	/*
	 * public Fan(int x) { this.x = x; }
	 * 
	 * public void add() { System.out.println(Fan.x); }
	 */
	
}
