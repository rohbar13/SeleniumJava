package javaprj.arrays;

import java.util.Arrays;

public class Array4 {
	public static void main(String[] args) {

		// There are repetitions
		int[] a = { 1, 1, 3, 4, 5, 2, 1, 3, 5,5 };
		// {1,1,1,2,2,3,3,3,4,5}

		// int[] nArrays=arrays
		Arrays.sort(a);

		// Print the values
		// 1 - 2 times
		// 3 - 3 times
		// 4 - 1 times
		// 5 - 1 times
		// 2 - 2 times

		int nbOccurences = 1;

	    for (int i = 0, length = a.length; i < length; i++) {
	        if (i < length - 1) {
	            if (a[i] == a[i + 1]) {
	                nbOccurences++;
	            }
	        } else {
	            System.out.println(a[i] + " occurs " + nbOccurences
	                    + " time(s)"); //end of array
	        }

	        if (i < length - 1 && a[i] != a[i + 1]) {
	            System.out.println(a[i] + " occurs " + nbOccurences
	                    + " time(s)"); //moving to new element in array
	            nbOccurences = 1;
	        }

	    }
		}
	}


