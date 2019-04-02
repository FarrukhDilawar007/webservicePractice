package automation.webServices.testScripts;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import automation.webServices.testMethods.webServiceJava;
import automation.webServices.utils.BaseURL;
import automation.webServices.utils.EndPointURLs;
import io.restassured.response.Response;
import pojoModels.Itemattributes;
import pojoModels.itemsPojoClass;

public class TC_001 {
	
	Response response;
	
	
	@BeforeClass
	public void setUp() {
	
		
	}
	
	@Test
	public void getHomeItems() {
		itemsPojoClass itemsPojoClass;
		Itemattributes itemattributes = null;
		Gson gson = new GsonBuilder().create();
		JSONObject stringJSON = new JSONObject()
				.put("lng","-95.3698028")
				.put("lat","29.7604267")
				.put("start", "0")
				.put("city", "New York")
				.put("limit", "20");
		
		String url = BaseURL.fixURL+EndPointURLs.Filters.getResourcePath();
		response = webServiceJava.Post(url, stringJSON.toString());
		System.out.println(response.getBody().asString());
		if(response.getStatusCode() == 200) {
			itemsPojoClass = gson.fromJson(response.body().asString(), itemsPojoClass.class);
			System.out.println(itemattributes.getCity().toString());
			
		}
		
	}
	
	
	@AfterClass
	public void closeUp() {
		
	}
	
	 

}
