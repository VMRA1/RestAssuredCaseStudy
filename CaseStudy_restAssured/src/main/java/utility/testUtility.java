package utility;

import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

public class testUtility {
	public static String getresponseString(Response response)
	{
		
		String strres=response.getBody().asString();
		return strres;
		
	}
	
	public static int getStatusCode(Response response)
	{
		return response.getStatusCode();
	}
	
	

	public static String getStatusMessage(Response response)
	{
		return response.getStatusLine();
	}
	
	
	public static JsonPath jsonparser(String response)
	{
		return new JsonPath(response);
	}
	
	
	public static XmlPath xmlparser(String response)
	{
		return new XmlPath(response);
	}
	

}
