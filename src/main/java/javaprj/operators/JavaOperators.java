package javaprj.operators;

public class JavaOperators {
	
	public static void main(String arg[]) {
		operator();
	}
	
	
	public static void operator() {

		// Arithmetic Operators
		/*
		 * + - / % *
		 */
		
		
		// Bitwise Operators

		/*
		 * Bitwise OR (|) Bitwise AND (&) Bitwise XOR (^ carat) Bitwise Complement (~ tilde)
		 */

		// Relational Operators
		/*
		 * > < >= <= == !=
		 */

		// The Assignment Operators

		/*
		 * = += *= /= -= %= <<= >>= &= ^=
		 */

		// The ? Operator

		/*
		 * ?
		 */

		int a = 8;
		int b = 6;

		System.out.println("a|b = " + (a | b));
		System.out.println("a&b = " + (a & b));
		System.out.println("a^b = " + (a ^ b));
		System.out.println("a = " + (~a));

		System.out.println("-----------------------------------");
		
		
		boolean val = false;
		if (val==false) {
			System.out.println(false);
		} else {
			System.out.println(true);
		}


		boolean v = ((val == false) ? false : true);
		System.out.println("Value is  : "+v);
		
		int y = ((a == 6) ? 5 : 6);
		System.out.println(y);
		
		
		int v1 = 0;
		v1+=5;
		System.out.println(v1);
		
		if(v1%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("ODD");
		}
		
		
		
		
	}
}
