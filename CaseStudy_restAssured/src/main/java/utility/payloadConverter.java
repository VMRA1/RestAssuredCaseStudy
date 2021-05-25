package utility;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class payloadConverter {
	public static String generatepayload(String filename) throws IOException
	{
//		String path ="C:\\Users\\AnushaAM\\Documents\\Selenium\\apiframework\\resource\\"+filename;
		String filepath=System.getProperty("user.dir")+"\\resource\\"+filename;
		return new String(Files.readAllBytes(Paths.get(filepath)));
	}

}
