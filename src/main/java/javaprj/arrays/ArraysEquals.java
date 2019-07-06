package javaprj.arrays;

import java.util.Arrays;

public class ArraysEquals {
	
	public static void main(String[] args) {
		
		int[] array1 = {2,3,4,5,6};
		int[] array2 = {2,3,4,6,4};
		
		 System.out.println(Arrays.binarySearch(array1, 4)); 
		 
		if(array1.length==array2.length) {
			for(int x=0;x<array1.length;x++) {
				if(array1[x]!=array2[x])
				{
					System.out.println("Not Same values");
					break;
				}
			}
			
		}else
		{
			System.out.println("Not same length");
		}
		
		array1 = array2.clone();
		for(int x=0;x<array1.length;x++) {
			System.out.println(array1[x]);
		}
	}
}
