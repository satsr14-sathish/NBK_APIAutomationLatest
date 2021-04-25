package nbk.api.request.email;

import static io.restassured.RestAssured.*;


import java.io.IOException;

import org.testng.annotations.Test;


import io.restassured.response.ValidatableResponse;

import nbk.api.datamodel.*;
import nbk.api.headers.*;
import nbk.api.utilobjects.*;

public class emailActivationPOST extends PropertiesReader {

	@Test

	public void EmailActivationPOSTRequest(String actid) throws IOException {

		ValidatableResponse putres;
		String ActivationID =actid;
		emailactivationdata data = new emailactivationdata();
		PropertiesReader Global = new PropertiesReader();
		Headers head = new Headers();

		putres = given().spec(requestSpecification())
				.headers(head.LanguageHeaders())
				.headers("Activation-id",ActivationID)
				.headers(head.DeviceHeaders())
				.headers(head.PlatformHeaders())
				.headers(head.firmwareHeaders())
				.body(data.emailactiv("email"))
				.when().log().all(true)
				.post(Global.getGlobalvalue("emailactivation"))
				.then().statusCode(200)
				.log().all(true);

	}
}
