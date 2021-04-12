package nbk.api.request.phone;

import static io.restassured.RestAssured.*;


import java.io.IOException;

import org.testng.annotations.Test;


import io.restassured.response.ValidatableResponse;

import nbk.api.datamodel.*;
import nbk.api.headers.*;
import nbk.api.utilobjects.*;

public class phoneActivationPOST extends PropertiesReader {

	@Test

	public void phoneActivationPOSTRequest(String actid) throws IOException {

		ValidatableResponse putres;
		phoneactivationdata data = new phoneactivationdata();
		PropertiesReader Global = new PropertiesReader();
		Headers head = new Headers();

		putres = given().spec(requestSpecification())
				.headers(head.LanguageHeaders())
				.headers("Activation-id",actid)
				.headers(head.DeviceHeaders())
				.headers(head.PlatformHeaders())
				.headers(head.firmwareHeaders())
				.body(data.phoneactiv("phonenumber"))
				.when().log().all(true)
				.post(Global.getGlobalvalue("phoneactivation"))
				.then().statusCode(200)
				.log().all(true);

	}
}
