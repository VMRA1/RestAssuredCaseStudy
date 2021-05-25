package tests;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import general.Assertion;
import general.BaseTest;
import general.restCalls;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import utility.payloadConverter;
import utility.url;

public class testAPI {
	private String  accessToken;
	private Response response;
	@BeforeTest
	public void setup() throws IOException
	{
		 accessToken = BaseTest.Adminlogin();
	}
	
	
	@Test
	public  void login() throws IOException
	{
		String signuppayload=payloadConverter.generatepayload("signup.json");
		
		String endpointURL=url.getEndpoint("/api/rest_admin/login");
		Response response=restCalls.PostRequest(endpointURL, signuppayload,accessToken);
		String strres=response.getBody().asString();
		Assertion.verifyStatusCode(response, 200);
	    
		
		
	}
	
}
