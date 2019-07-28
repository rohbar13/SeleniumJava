package javaprj.classesandobject;

public class Sample1 {
	
	public static void main(String[] args) {
		int[] values = {2,3,5};
		int[] sumvalues = add("Hello",10,values);
		
		System.out.println(sumvalues[0]+" ----- "+sumvalues[1]);
	}
	
	public static void add(int val1) {
		System.out.println("add1 : "+(val1+10));
	}
	
	public static void add(int val1,int val2) {
		System.out.println("add2 : "+(val1+val2));
	}
	
	//varargs cannot be more than 1 in one method
	//varargs needs to be the last variable
	public static int[] add(String str,int y,int ...arg) {  //varargs
		int sum = 0;
		System.out.println("Hello");
		System.out.println(arg.length);
		
		for(int x:arg) {
			sum+=x;
		}
		
		int[] returnvalue = {sum,y};
		return returnvalue;
		//System.out.println("add3 : "+sum);
	}
}
