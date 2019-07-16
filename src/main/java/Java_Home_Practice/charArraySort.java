package Java_Home_Practice;

import java.util.Scanner;

public class charArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Create a char array,Please mention the size of  array");
		Scanner scan=new Scanner(System.in);
		int size=scan.nextInt();
		charArraySort obj=new charArraySort();
		obj.createCharArray(size);
	}
	public void createCharArray(int size)
	{
		Scanner scan=new Scanner(System.in);
		char[] charArray=new char[size];
		
		System.out.println("Please enter char array value");
		
		for(int i=0;i<size;i++)
		{
			charArray=scan.next().charAt(index)();
					}
		for(int i=0;i<size;i++)
		{
			System.out.println("first character entered:"+charArray[i]);
		}
	}
	

}
