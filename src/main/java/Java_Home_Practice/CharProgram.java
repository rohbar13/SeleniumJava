package Java_Home_Practice;

import java.util.Scanner;

public class CharProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//How to create a char arrray , take user input and print the array
		int arraySize=5;
		System.out.println("Enter your charachter");
		Scanner scan =new Scanner(System.in);
		char charArray[]=new char[arraySize];
		
		for(int i=0;i<5;i++)
		{
			char c=scan.next().charAt(0);
			charArray[i]=c;
		}
		for(int i=0;i<5;i++)
		{
			System.out.print(charArray[i]+",");
		}
		
		
		//Sorting of array
		
	for(int i=0;i<5;i++)
		for(int j=0;j<charArray.length;j++)
		{
			if(charArray[i]>charArray[j])
					{
						char temp=charArray[i];
						charArray[i]=charArray[j];
						charArray[j]=temp;
					}
			
		}
		
	System.out.println("Shorted Array is:");
	for(int i=0;i<5;i++)
	{
		System.out.print(charArray[i]+",");
	}
	
	}
	
}
