package automation.webServices.testScripts;

import org.json.JSONObject;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import automation.webServices.testMethods.webServiceJava;
import automation.webServices.utils.BaseURL;
import automation.webServices.utils.EndPointURLs;
import io.restassured.response.Response;

public class TC_001 {
	
	Response response;
	
	@BeforeClass
	public void setUp() {
	
		
	}
	
	@Test
	public void getHomeItems() {
		
		JSONObject stringJSON = new JSONObject()
				.put("lng","-95.3698028")
				.put("lat","29.7604267")
				.put("start", "0")
				.put("limit", "20");
		
		String url = BaseURL.fixURL+EndPointURLs.Filters.getResourcePath();
		response = webServiceJava.Post(url, stringJSON.toString());
		System.out.println(response.getBody().asString());
	}
	
	
	@AfterClass
	public void closeUp() {
		
	}
	
	 

}
