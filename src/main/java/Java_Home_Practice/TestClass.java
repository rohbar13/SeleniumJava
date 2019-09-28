package Java_Home_Practice;

import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int a = 1;
		
		int z = a+x;
		System.out.println(z);
		
		String y = "Hello World";
		scan.nextLine();
		String s = scan.nextLine();
		
		System.out.println(y.concat(s));
		
		
		
	}

}
