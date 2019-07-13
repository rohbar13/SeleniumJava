package javaprj.operators;

public class RelationalOperator {
	public static void main(String[] args) {

		int val1 = 90;
		int val2 = 90;
		int val3 = 130;

		if (val1 == val2 && val2 == val3) {
			System.out.println("All values are same");
		} else if (val1 >= val2 && val1 >= val3) {
			if (val1 == val2) {
				System.out.println("val1 and val2 is max");
			} else {
				System.out.println("val1 is max");
			}
		} else if (val2 >= val3) {
			if (val2 == val3) {
				System.out.println("val2 and val3 is max");
			} else {
				System.out.println("val2 is max");
			}
		} else {
			System.out.println("val3 is max");
		}
	}
}
