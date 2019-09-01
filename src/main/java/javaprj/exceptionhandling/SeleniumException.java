package javaprj.exceptionhandling;

public class SeleniumException extends Exception{
	//Custom Exception
	public SeleniumException(String text) {
		System.out.println(text);
	}
}
