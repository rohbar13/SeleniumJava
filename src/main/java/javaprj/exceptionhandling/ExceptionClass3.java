package javaprj.exceptionhandling;

public class ExceptionClass3 {

	public static void main(String str[]) throws Throwable {
		methodThrowsException(1);
	}
	
	public static void methodThrowsException() throws Exception {
		
		int arr[] = {2,4,5};
		
		try {
			System.out.println(arr[6]);
		}catch(ArrayIndexOutOfBoundsException ex) {
			throw new Exception("Array was full");
		}
	}
	
	
	public static void methodThrowsException(int x) throws Exception {
		
		int arr[] = {2,4,5};
		
		try {
			System.out.println(arr[6]);
		}catch(ArrayIndexOutOfBoundsException ex) {
			throw new SeleniumException("Selenium is throwing ");
		}
	}
	
	
	
}