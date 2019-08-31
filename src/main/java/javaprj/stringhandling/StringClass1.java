package javaprj.stringhandling;

public class StringClass1 {

	public static void main(String[] args) {

		String str1 = "Welcome: Rohit Kant";
		System.out.println(str1.charAt(0));
		str1.concat("to add this string");
		System.out.println(str1);
		System.out.println(str1.replace("[^a-zA-Z0-9]", "*"));
		System.out.println(str1);
		System.out.println(str1.replaceAll("[^a-zA-Z0-9]", "*"));
		System.out.println(str1.length());
		
		String expected = "Rohit Kant";
		String text = "Welcome: ";
		
		String actual = "Welcome: Rohit Kant";
		
		if(actual.equals(text+expected)) {
			System.out.println("Match found");
		}else {
			System.out.println("Match not found");
		}
		
		if(actual.replace(text, "").equals(expected)) {
			System.out.println("Match found");
		}else {
			System.out.println("Match not found");
		}
		
		
		System.out.println(actual.substring(9));
		System.out.println(actual.substring(9,14));
		
		System.out.println(actual.indexOf(' '));

		//
		
		String s1 = "Bye world";
		System.out.println(s1.hashCode());
		String s2 = "Bye world";
		System.out.println(s2.hashCode());
		
		String obj1 = new String("Welcome");
		System.out.println(obj1.hashCode());
		
		String obj2 = new String("Welcome");
		System.out.println(obj2.hashCode());
		
		if(s1==s2) {
			System.out.println("Same");
		}else {
			System.out.println("different");
		}
		
		if(obj1==obj2) {
			System.out.println("Same");
		}else {
			System.out.println("different");
		}
		
		String obj3 = new String("Welcome");
		System.out.println(obj3.hashCode());
		
		String obj4 = obj3;
		System.out.println(obj4.hashCode());
		
		if(obj3==obj4) {
			System.out.println("Same");
		}else {
			System.out.println("different");
		}
		
		// upper case and lower case
		
		String v1 = "Atul";
		String v2 = "Aauz";
		
		System.out.println(v1.compareTo(v2));
		
		v1 = v1.toUpperCase();
		
		System.out.println(v1);
		
		
		//split
		
		
		String value = " My name is khubaib";
		
		String[] v = value.split(" ");
		
		System.out.println(v.length);
		
		for(String temp:v) {
			System.out.println("word : "+temp);
		}
		
	}
}
