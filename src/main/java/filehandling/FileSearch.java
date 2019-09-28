package filehandling;

import java.io.File;

public class FileSearch {

	static String rfile = "testdocument.docx";

	public static void main(String[] args) {

		String fileName = "F:\\testfolder";
		File file = new File(fileName);

		scanFolder(file);

	}

	public static void scanFolder(File folderName) {

		if (folderName.exists()) {
			File[] fileArray = folderName.listFiles();
						
			for(File temp:fileArray) {
				if (temp.isDirectory()) {
					System.out.println(temp.getAbsolutePath().replace("F:\\testfolder\\", ""));
					scanFolder(temp);
				}else {
					System.out.println("---"+temp.getAbsolutePath().replace("F:\\testfolder\\", "")+" is a file");
				}
			}
			
			
		}
	}
}
