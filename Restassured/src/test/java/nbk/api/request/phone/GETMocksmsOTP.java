package nbk.api.request.phone;

import static io.restassured.RestAssured.*;


import java.io.IOException;
import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;
import io.restassured.response.ResponseBodyExtractionOptions;
import io.restassured.response.ValidatableResponse;

import nbk.api.datamodel.*;
import nbk.api.headers.*;
import nbk.api.request.activation.certificateActivationPOST;
import nbk.api.request.email.emailActivationPOST;
import nbk.api.request.email.emailconfirmationPOST;
import nbk.api.utilobjects.*;

public class GETMocksmsOTP extends PropertiesReader {
	
	certificateActivationPOST cert = new certificateActivationPOST();
	
	phoneActivationPOST phoneact = new  phoneActivationPOST();
	phoneConfirmationPOST phoneconf = new phoneConfirmationPOST();
	String OTP;
	String extractedOTP;
	
	public String getOTP() {
		System.out.println("otp value under getter: "+this.OTP);
		return this.OTP;
	}
	

	
	@Test

	public void GETMocksmsOTPRequest(String activid) throws IOException {

		ValidatableResponse putres;
		phoneactivationdata data = new phoneactivationdata();
		PropertiesReader Global = new PropertiesReader();
		Headers head = new Headers();
		
		Response response;
		//cert.CertificateActivationPOSTRequest();
		//String activid = cert.getActid();
			//phoneact.phoneActivationPOSTRequest(activid);

		putres = (ValidatableResponse) given().spec(requestSpecification1())
				.headers(head.LanguageHeaders())
				.headers("Activation-id",activid)
				.headers(head.DeviceHeaders())
				.headers(head.PlatformHeaders())
				.headers(head.firmwareHeaders())
				
				.when().log().all(true)
				.get(Global.getGlobalvalue("mockgetsms"))
				.then().statusCode(200)
				.log().all();
		
		
		//String phonenumber = "92009901";
		//String exactedphnum= putres.extract().jsonPath().getString("phoneNumber");
		//System.out.println(exactedphnum);
		String extractedMessage = putres.extract().jsonPath().getString("message");
		System.out.println(extractedMessage);
		 extractedOTP= extractedMessage.substring(31,37);
		System.out.println("extracted OTP is:"+extractedOTP);
		this.OTP = extractedOTP;
		System.out.println("otp value in this.otp "+OTP);

		
		
		
		
		
	}
	
	
}
