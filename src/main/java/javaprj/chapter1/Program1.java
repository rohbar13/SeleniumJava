package javaprj.chapter1;


/**
 * This is the first class for program1
 * @author ROHBA_000
 *
 */
class Program1 {
	
	static char c;
	static boolean bl;
	static byte b;
	
	
	/**
	 * This is the first method of the first class
	 * @param args
	 */
	public static void main(String args[]) {
		
		System.out.println(c);
		System.out.println(bl);
		System.out.println(b);
		
		System.out.println("Hello World");
		method(1f);
	}

	public static void method(long x) {
		System.out.println("long : "+x);
	}
	
	public static void method(int x) {
		System.out.println("int : "+x);
	}
	
	public static void method(float x) {
		System.out.println("float : "+x);
	}
	
	
}
