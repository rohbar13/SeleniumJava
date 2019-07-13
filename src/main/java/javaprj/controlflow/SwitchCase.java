package javaprj.controlflow;

public class SwitchCase {
	public static void main(String[] args) {

		String day = "monday";

		switch (day) {
		case "sunday":
			System.out.println("This is the 1st day of the week");
			break;
		case "monday":
			System.out.println("This is the 2nd day of the week");
			break;
		case "tuesday":
			System.out.println("This is the 3rd day of the week");
			break;
		default:
			System.out.println("Other days of the week");
		}
	}
}
