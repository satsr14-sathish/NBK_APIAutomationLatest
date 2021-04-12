package nbk.api.utilobjects;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class PropertiesReader {

	RequestSpecification req;

	public RequestSpecification requestSpecification() throws IOException {

		RestAssured.baseURI = "https://dvp-qa-manual:8080/";
		req = new RequestSpecBuilder().setBaseUri(getGlobalvalue("BaseURL1")).setBasePath(getGlobalvalue("BasePATH1"))
				.setContentType(ContentType.JSON).build();
		return req;
	}

	public String getGlobalvalue(String key) throws IOException
	{
		Properties prop = new Properties();
		//FileInputStream fis = new FileInputStream("C:\\Users\\THI2011588\\Downloads\\NBK-RestAssured-main (1)\\NBK-RestAssured-main\\Restassured\\src\\test\\java\\Utili\\Global.properties");
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/test/java/nbk/api/utilobjects/Global.properties");
		prop.load(fis);
		return prop.getProperty(key);
		
						
	}
	
	
}
