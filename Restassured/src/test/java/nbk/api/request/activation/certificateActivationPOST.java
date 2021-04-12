package nbk.api.request.activation;

import static io.restassured.RestAssured.*;

import static org.junit.Assert.assertEquals;
import java.io.IOException;


import org.testng.annotations.Test;

import io.restassured.response.ValidatableResponse;
import nbk.api.datamodel.*;
import nbk.api.headers.*;
import nbk.api.utilobjects.*;

public class certificateActivationPOST extends PropertiesReader {
	public String activationid;
	public String actid;

	public String getActid() {
		return actid;
	}

	@Test

	public void CertificateActivationPOSTRequest() throws IOException {

		ValidatableResponse putres;
		String certificate,issuercertificate;		

		certificateactivationdata data = new certificateactivationdata();
		PropertiesReader Global = new PropertiesReader();
		Headers head = new Headers();	

		putres = given().spec(requestSpecification())
				.headers(head.LanguageHeaders())
				.headers(head.DeviceHeaders())
				.headers(head.PlatformHeaders())
				.headers(head.firmwareHeaders())
				.body(data.certificateactiv("certificateauuth"))
				.when().log().all(true)
				.post(Global.getGlobalvalue("certificateactivation"))
				.then().statusCode(200).and().assertThat().headers(head.contentLength())
				.log().all(true);

		certificate = putres.extract().response().path("certificateB64");
		issuercertificate = putres.extract().response().path("issuerCertificateB64");

		activationid = putres.extract().response().getHeader("Activation-Id");

		this.actid = activationid;

	}







}
