package api;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

import org.testng.annotations.Test;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ReadJson {
	
	@Test
	public void readJson() {
	JsonParser jparse = new JsonParser();
	/*
	 * Object obj = jparse.parse(new FileReader(System.getProperty("user.dir")+
	 * "/src/test/resources/TestData/sample" + ".json"));
	 */

		try {
		Reader reader = new FileReader(System.getProperty("user.dir")+"/src/test/resources/TestData/sample.json");
			Object object = jparse.parse(reader); // return parse tree of json element
			
			//convert object to JSONobject
			JsonObject json = (JsonObject) object;
			System.out.println(json.get("Name"));
			JsonArray arr = (JsonArray)json.get("Countries");
			System.out.println(json.get("Countries"));
			System.out.println(arr.get(0));
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
