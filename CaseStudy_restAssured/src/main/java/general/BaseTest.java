package general;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import utility.payloadConverter;
import utility.url;

public class BaseTest {	

	@Test
	public static String Adminlogin() throws IOException
	{
				
		String endpointURL=url.getEndpoint("/api/rest_admin/oauth2/token/client_credentials");
		Response response=restCalls.PostRequestwithoudData(endpointURL);
		String strres=response.getBody().asString();
		JsonPath jsonResult=new JsonPath(strres);
		String accessToken=jsonResult.get("data.access_token");	
		System.out.println(accessToken);
		return accessToken;
	    
		
		
		
	}

}
