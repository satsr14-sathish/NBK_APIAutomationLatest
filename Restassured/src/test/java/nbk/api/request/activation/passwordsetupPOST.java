package nbk.api.request.activation;

import static io.restassured.RestAssured.*;


import java.io.IOException;

import org.testng.annotations.Test;


import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import nbk.api.datamodel.*;
import nbk.api.headers.*;
import nbk.api.utilobjects.*;

public class passwordsetupPOST extends PropertiesReader {

	@Test

	public void PasswordActivationPOSTRequest(String actid) throws IOException {
		ValidatableResponse putres;

		passwordsetupdata data = new passwordsetupdata();

		PropertiesReader Global = new PropertiesReader();
		Headers head = new Headers();

		putres = given().spec(requestSpecification())
				.headers(head.LanguageHeaders())
				.headers("Activation-id",actid)
				.headers(head.DeviceHeaders())
				.headers(head.PlatformHeaders())
				.headers(head.firmwareHeaders())
				.body(data.passwordset("certificateauuth", "value"))
				.when().log().all(true)
				.post(Global.getGlobalvalue("passwordsetup"))
				.then().statusCode(200)
				.log().all(true);


	}
}
