package utility;

public class url {
	public static final String URL="http://rest-api.upskills.in";
	public static String getEndpoint()
	{
		return URL;
		
	}
	
	public static String getEndpoint(String resource)
	{
		return URL+resource;
		
	}

}
