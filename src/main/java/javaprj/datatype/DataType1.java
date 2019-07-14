package javaprj.datatype;

public class DataType1 {

	int x = 10;
	
	public static void main(String[] args) {
		
		boolean bl = true;
		
		char c = 1000;
		for(int x=0;x<=127;x++) {
			System.out.println(x + " : "+(char)x);
		}
		calc(144411.0d);
	}
	
	public static void calc(long l) {
		System.out.println("long "+l);
	}
	public static void calc(int i) {
		System.out.println("int "+i);
	}
	public static void calc(float f) {
		System.out.println("float "+f);
	}
	public static void calc(double d) {
		System.out.println("double "+d);
	}
	
}
