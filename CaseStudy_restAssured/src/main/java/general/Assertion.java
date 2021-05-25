package general;

import org.testng.Assert;

import io.restassured.response.Response;
import utility.testUtility;

public class Assertion {
	public static void verifyStatusCode(Response response,int Status)
	{
		Assert.assertEquals(testUtility.getStatusCode(response), Status);
	}

}
