package utilities;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class FileReadWrite {
	
Properties prop;

public FileReadWrite() {
		
}	

public Properties getPropertyRef() {
		prop = new Properties();
		String fileName = "src/test/resources/config/config.properties";
		try {
			FileInputStream inputStream = new FileInputStream(fileName);
			prop.load(inputStream);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		return prop;
		
	}	
	public String readConfigFile(String key) {
		
		return getPropertyRef().getProperty(key);
	}
	
	public void writeConfigFile(String key, String val) {
		
		getPropertyRef().setProperty(key, val);
		if (getPropertyRef().getProperty(key)==null) {
			System.out.println("property value is not set!!");
		}
	}
	
	}
	