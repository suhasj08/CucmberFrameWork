package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigReader {

	public static Properties InitializeProperties() {
		
		Properties prop = new Properties();
		File profile = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\config\\config.properties");
		try {
			FileInputStream fis = new FileInputStream(profile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return prop;
		
	}

}
