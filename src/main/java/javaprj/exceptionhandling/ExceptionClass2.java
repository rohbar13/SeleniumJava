package javaprj.exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionClass2 {
	//Checked Exception
	
	public void filehandling() throws FileNotFoundException {
		readFile();
	}
	
	public void readFile() throws FileNotFoundException {
		File file = new File("C:\\selenium-server-standalone.jar");
		FileInputStream fis = new FileInputStream(file);	
	}
}