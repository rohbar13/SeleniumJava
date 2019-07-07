package javaprj.operators;

public class JavaOperators {
	
	public static void main(String arg[]) {
		operator();
	}
	
	
	public static void operator() {

		// Arithmetic Operators
		// Bitwise Operators

		/*
		 * Bitwise OR (|) Bitwise AND (&) Bitwise XOR (^) Bitwise Complement (~)
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

		boolean val = false;
		if (val==false) {
			System.out.println(false);
		} else {
			System.out.println(true);
		}

		int y = ((a == 6) ? 5 : 6);

		boolean v = ((val == false) ? false : true);
		
	}
}
