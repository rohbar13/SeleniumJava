package filehandling;

import java.io.File;

public class FolderCreation {
	public static void main(String[] args) {
		
		String folderPath = "f://testfolder//samplefolder";
		
		File file = new File(folderPath);
		if(!file.exists())
		{
			file.mkdirs();
		}
	}
}
