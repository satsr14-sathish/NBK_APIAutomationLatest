package nbk.api.request.activation;

import static io.restassured.RestAssured.*;


import java.io.IOException;

import org.testng.annotations.Test;


import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import nbk.api.datamodel.*;
import nbk.api.headers.*;
import nbk.api.utilobjects.*;

public class LoginChallengePOST extends PropertiesReader {

	@Test

	public void LoginChallengePOSTRequest() throws IOException {
		ValidatableResponse putres;

		passwordsetupdata data = new passwordsetupdata();

		PropertiesReader Global = new PropertiesReader();
		Headers head = new Headers();

		putres = given().spec(requestSpecification2())
				.headers(head.LanguageHeaders())
				//.headers(head.sessiontokenheader())
				.headers(head.DeviceHeaders())
				.headers(head.PlatformHeaders())
				.headers(head.firmwareHeaders())
				.headers(head.appidheaders())
				.when().log().all(true)
				.post(Global.getGlobalvalue("loginchallenge"))
				.then().statusCode(200)
				.log().all(true);
		String extractedchallenge = putres.extract().response().path("challenge");
		System.out.println("Challenge is :"+extractedchallenge);

	}
}
