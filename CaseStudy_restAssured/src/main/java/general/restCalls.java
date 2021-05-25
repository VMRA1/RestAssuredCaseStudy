package general;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class restCalls {
	public static Response GetRequest(String URI) {
		RequestSpecification requestspecification=RestAssured.given();
		requestspecification.contentType(ContentType.JSON);
		Response response=requestspecification.get(URI);
		return response;
	}
	public static Response GetRequestwithheader(String URI,String accessToken) {
		RequestSpecification requestspecification=RestAssured.given().header("Authorization","bearer "+accessToken);
		requestspecification.contentType(ContentType.JSON);
		Response response=requestspecification.get(URI);
		return response;
	}
	
	public static Response PostRequest(String URI,String strJSON,String accessToken) {
		RequestSpecification requestspecification=RestAssured.given().body(strJSON);
		requestspecification.contentType(ContentType.JSON).header("Authorization","bearer "+accessToken);
		Response response=requestspecification.post(URI);
		return response;
	}
	public static Response PostRequestwithoudData(String URI) {
		RequestSpecification requestspecification=RestAssured.given().header("Authorization","Basic dXBza2lsbHNfcmVzdF9hZG1pbl9vYXV0aF9jbGllbnQ6dXBza2lsbHNfcmVzdF9hZG1pbl9vYXV0aF9zZWNyZXQ=");;
		requestspecification.contentType(ContentType.JSON);
		Response response=requestspecification.post(URI);
		return response;
	}

}
