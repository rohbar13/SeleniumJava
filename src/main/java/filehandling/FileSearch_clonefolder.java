package filehandling;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FileSearch_clonefolder {

	static String rfile = "testdocument.docx";
	static List<String> list1 = new ArrayList<String>();
	static List<String> list2 = new ArrayList<String>();
	
	public static void main(String[] args) {

		String fileName = "F:\\testfolder";
		String fileName_clone = "F:\\testfolderclone";

		
		
		File file = new File(fileName);
		scanFolder(file,list1,fileName);

		File fileclone = new File(fileName_clone);
		scanFolder(fileclone,list2,fileName_clone);
	
		
		list1.removeAll(list2);
		System.out.println(list1);
		
		
	}

	public static void scanFolder(File folderName,List<String> list,String filenames) {

		if (folderName.exists()) {
			File[] fileArray = folderName.listFiles();
						
			for(File temp:fileArray) {
				
				String t1 = temp.getAbsolutePath().replace(filenames, "");
				
				list.add(t1);
				if (temp.isDirectory()) {
					//System.out.println(temp.getAbsolutePath().replace("F:\\testfolder\\", ""));
					scanFolder(temp,list,filenames);
				}else {
					//System.out.println("---"+temp.getAbsolutePath().replace("F:\\testfolder\\", "")+" is a file");
				}
			}
			
			
		}
	}
	
}