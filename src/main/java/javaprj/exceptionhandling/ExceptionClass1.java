package javaprj.exceptionhandling;

public class ExceptionClass1 {
	
	//Unchecked Exception
	
	public static void main(String arg[]) {
		main();
	}
	
	public static int main() {
		String name = "rohit";
		
		String subname = null;
		try {
			System.out.println("Try Block Executed!");
			subname = name.substring(0,2);
		}catch(NumberFormatException e) {
			try {
				
			}catch(Exception e2) {
				
			}finally {
				System.out.println("Will not execute");
			}
			subname="Please enter a name";
			System.out.println("Catch Block Executed!");
			//e.printStackTrace();
		}catch(IllegalArgumentException|NullPointerException e) {
			subname="Please enter a name";
			System.out.println("Catch Block Executed!");
			//e.printStackTrace();
		}catch(ArithmeticException e) {
			subname="Please enter a name";
			System.out.println("Catch Block Executed!");
			//e.printStackTrace();
		}catch(Exception e) {
			subname="Please enter a name";
			System.out.println("Catch Block Executed!");
			//e.printStackTrace();
			return 0;
		}finally {
			System.out.println("Finally Block Executed!");
		}
		
		System.out.println("-----------Program Executed-----------");
		
		System.out.println();
		return 0;
		
	}
}
