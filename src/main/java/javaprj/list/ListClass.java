package javaprj.list;

import java.util.ArrayList;

public class ListClass {

	public static void main(String[] args) {

		int[] x = { 5, 3, 4, 5, 6 };
		System.out.println(x.length);

		ArrayList<String> listitems = new ArrayList<String>();
		System.out.println(listitems.size());

		listitems.add("Atul");
		System.out.println(listitems.size());

		listitems.remove(0);
		System.out.println(listitems.size());

	}

}
