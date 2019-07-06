package javaprj.arrays;


public class Array5 {
	public static void main(String[] args) {
		int[]  arr1 = new int[50];
		System.out.println(arr1.hashCode());
	    int[]  arr2 = new int[100];
	    System.out.println(arr2.hashCode());
	    arr1 = arr2;
	    System.out.println(arr1.hashCode());
	    System.out.println(arr2.hashCode());
	    System.out.println(arr1.length);
	}
}
