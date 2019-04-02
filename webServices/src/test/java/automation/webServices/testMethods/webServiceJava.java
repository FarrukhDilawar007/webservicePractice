package automation.webServices.testMethods;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class webServiceJava {
	
	
	public static Response Post(String uRI, String stringJSON) {
		
		requestSpecification = given().body(stringJSON);
		requestSpecification.contentType(ContentType.JSON);
		Response response = requestSpecification.post(uRI);
		return response;
		
	}
	
	public static Response Get(String uRI, String stringJSON) {
		
		requestSpecification = given();
		requestSpecification.contentType(ContentType.JSON);
		Response response = requestSpecification.get(uRI);
		return response;
	}
	
	

  }
