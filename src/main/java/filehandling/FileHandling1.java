package filehandling;

import java.io.File;

public class FileHandling1 {

	public static void main(String[] args) {
		
		String fileName = "C:\\Users\\ROHBA_000\\Documents\\Tutorial.java";
		
		File f = new File(fileName);
		
		if(f.exists()) {
			System.out.println("File Found");
		
			if(f.isDirectory()) {
				System.out.println("----------is a folder");
			}else {
				System.out.println("----------is a file");
			}
		}else {
			System.out.println("File Not Found");
		}
		
		
		String folderName = "C:\\Users\\ROHBA_000\\Documents\\Bluetooth";
		File f1 = new File(folderName);
		
		if(f1.isDirectory()) {
			System.out.println("is a folder");
		}else {
			System.out.println("is a file");
		}
		
		
		
		
		
	}
}
