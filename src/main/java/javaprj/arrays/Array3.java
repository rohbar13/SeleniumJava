package javaprj.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Array3 {
	public static void main(String[] args) {
		
		String str1 = "listen";
		String str2 = "silent";
		
		char[] s1 = str1.toCharArray();
		char[] s2 = str2.toCharArray();
		
		Arrays.sort(s1);
		Arrays.sort(s2);

		String string1 = new String(s1);
		String string2 = new String(s2);
		
		if(string1.equals(string2)) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not Anagram");
		}
		
	}
}
