package javaprj.controlflow;

public class Loops_3 {
	public static void main(String[] args) {

		String months[] = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

		for (int x = 0; x < months.length - 1; x++) {
			for (int y = x + 1; y < months.length; y++) {
				
				if(months[x].compareTo(months[y])>0) {
					String temp = months[x];
					months[x] = months[y];
					months[y] = temp;
				}
			}
		}
		for (int y = 0; y < months.length; y++) {
			System.out.println(months[y]);
		}
	}
}
