package api;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssured1 {

	@Test
	public void getWhether() {
		
		// the baseuri is consistent part of your web address
		
		RestAssured.baseURI = "https://demoqa.com/utilities/weather/city";
		
		/*
		 * Create requestSpecification, which allow us to specify that how our request
		 * will look like .
		 */
		RequestSpecification specs = RestAssured.given();
		Response response = specs.request(Method.GET, "/Hyderabad");
		System.out.println(response.asString());
		response.getStatusCode();
		JsonPath path = new JsonPath(response.asString());
		System.out.println(path.get("City"));
		System.out.println(path.get("Temperature"));
		System.out.println(path.getString("Humidity"));
		
	}
}
