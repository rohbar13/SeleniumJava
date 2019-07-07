package Java_Home_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArraySorting obj = new ArraySorting();

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array you want");

		int size = scan.nextInt();
		// Declare a single dimensional array

		int array[] = obj.createArray(size);
		System.out.println("Enterd values for array are");

		obj.printArray(array);
		
		//int sortedArray[]=obj.arraySort(array);
		//Doubt If I am not giving return type also the code run why? and how
		
	//Below Line--	
		obj.arraySort(array);
		obj.printArray(array);
		
		
		

	}

	public int[] createArray(int size) {

		int array[] = new int[size];
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < array.length; i++) {
			System.out.println("enter " + (i + 1) + " value for array");
			array[i] = scan.nextInt();
		}
		return array;

	}

	public void printArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public int[] arraySort(int array[]) {
		int rawArray[] = array;
		int temp = 0;
		// method one Array.sort() of util package
		// Arrays.sort(rawArray);
		System.out.println("Sorted array :");
		// Method 2 using bubble sort

		for (int i = 0; i < rawArray.length; i++) {
			for (int j = 0; j < rawArray.length - 1; j++) {
				if (rawArray[j] > rawArray[i]) {
					temp = rawArray[i];
					rawArray[i] = rawArray[j];
					rawArray[j] = temp;
				}
			}
		}
		return rawArray;
	}

}
