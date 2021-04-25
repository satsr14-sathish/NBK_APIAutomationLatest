package nbk.api.request.email;

import static io.restassured.RestAssured.*;

import static org.junit.Assert.assertEquals;
import java.io.IOException;

import org.testng.annotations.Test;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import nbk.api.datamodel.*;
import nbk.api.headers.*;
import nbk.api.request.phone.GETMocksmsOTP;
import nbk.api.utilobjects.*;

public class emailconfirmationPOST extends PropertiesReader {
	
	@Test
	
	public void EmailConfirmationPOSTRequest(String actid) throws IOException {
		
		ValidatableResponse putres;
		
		emailconfirmationdata data = new emailconfirmationdata();
		PropertiesReader Global = new PropertiesReader();
		Headers head = new Headers();
		String ActivationID = actid;
		
		emailconfirmationdata emailcondat = new emailconfirmationdata();
		GETmockemailOTP getmocksemail = new GETmockemailOTP();
	    getmocksemail.GETMockemailOTPRequest(ActivationID);
		String updatedOTP = getmocksemail.getOTP();
		emailcondat.emailconfirm(updatedOTP);
		
		
		putres = given().spec(requestSpecification())
				.headers(head.LanguageHeaders())
				.headers("Activation-id",ActivationID)
				.headers(head.DeviceHeaders())
				.headers(head.PlatformHeaders())
				.headers(head.firmwareHeaders())
				
				.body(data.emailconfirm("updatedOTP"))
				 .when().log().all(true)
				.post(Global.getGlobalvalue("emailconfirmation"))
				.then().statusCode(200)
				.log().all(true);
		
	}
}
