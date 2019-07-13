package javaprj.controlflow;

public class Loops_2 {
	public static void main(String[] args) {

		int array[] = { 23, 6, 10, 10, 89, 10 };

		for (int x = 0; x < array.length - 1; x++) {
			for (int y = x+1; y < array.length; y++) {
				if (array[x] > array[y]) {
					int temp = array[x];
					// System.out.println(array[x]+" "+array[x+1]);
					array[x] = array[y];
					array[y] = temp;
				}
			}
		}

		for (

				int x = 0; x < array.length; x++) {
			System.out.println(array[x]);
		}
	}
}
