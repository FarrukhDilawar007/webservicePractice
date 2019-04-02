package automation.webServices.utils;

public enum EndPointURLs {
	
	Filters("/items/filter");
	
	
	
	String resourcePath;
	
	EndPointURLs(String resourcePath){
		this.resourcePath = resourcePath;
	}
	
	public String getResourcePath(){
		return this.resourcePath;
	}
	
	public String getResourcePath(String data) {
		return this.resourcePath+data;
	}
	

}
