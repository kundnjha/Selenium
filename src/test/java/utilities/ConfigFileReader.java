package utilities;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.Properties;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ConfigFileReader {
	
Properties prop;

public ConfigFileReader() {
		
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
	
	public String readJsonData(String key, String fileName) {
		String val = null;
		String path = System.getProperty("user.dir")+"/src/test/resources/TestData"+fileName;
		try{	
		Reader file = new FileReader(path);
		JsonParser parser = new JsonParser();
		JsonObject json = (JsonObject) parser.parse(file); // returns parse tree of json element
		val = json.get(key).getAsString();
		
	} catch(FileNotFoundException e) {
		e.printStackTrace();
		
	}
		return val;
	}
	
	public void writeJson(String key, String val, String fileName) {
	String path = System.getProperty("user.dir")+"/src/test/resources/TestData"+fileName;
	JsonObject obj = new JsonObject();
	obj.addProperty(path, val);
		
	}
}