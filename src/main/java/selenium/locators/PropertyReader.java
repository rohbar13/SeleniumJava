package selenium.locators;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {
	
	private String fileName;
	private String key;
	private String value;
	
	public PropertyReader(String fileName) throws IOException {
		this.fileName = fileName;
		File fl = new File(fileName);
		
		if(fl.exists()) {
			
		}else {
			System.out.println("Build Properties not found!!!");
		}
	}

	public String getKey() throws IOException {
		return key;
	}

	public String getValue(String key) throws IOException {
		InputStream is = new FileInputStream(fileName);
		Properties prop = new Properties();
		prop.load(is);
		value = prop.getProperty(key);

		if(null==value || value.isEmpty() || value.length()==0 || "".equals(value) || null==key) {
			System.out.println("Configuration not found for given Key!!!");
			value="";
		}
		return value;
	}
	
	

}
