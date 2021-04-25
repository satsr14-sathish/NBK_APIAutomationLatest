package nbk.api.request.email;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import nbk.api.headers.Headers;
import nbk.api.request.activation.certificateActivationPOST;
import nbk.api.request.phone.phoneActivationPOST;
import nbk.api.request.phone.phoneConfirmationPOST;
import nbk.api.utilobjects.PropertiesReader;

public class GETmockemailOTP extends PropertiesReader{

	
certificateActivationPOST cert = new certificateActivationPOST();
	
	emailActivationPOST phoneact = new emailActivationPOST();
	emailconfirmationPOST phoneconf = new emailconfirmationPOST();
	String Otp;
	String extractedOTP;
	
	public String getOTP() {
		//System.out.println("otp value under getter: "+this.OTP);
		return this.Otp;
	}
	

	
	@Test

	public void GETMockemailOTPRequest(String activid) throws IOException {

		ValidatableResponse putres;
		//phoneactivationdata data = new phoneactivationdata();
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
				.get(Global.getGlobalvalue("mockgetemail"))
				.then().statusCode(200)
				.log().all();
		
		//have to check URL - 
		//check headers files - check with the headers package.
		//Body same as phone confirmation .. 
		//go to email confirmation request - have to call from diff classess.. 
		//All post reeqest 
		//email comfirmation ..
		//String phonenumber = "92009901";
		//String exactedphnum= putres.extract().jsonPath().getString("email");
		//System.out.println(exactedphnum);
		String extractedMessage = putres.extract().jsonPath().getString("message");
		//System.out.println(extractedMessage);
		 extractedOTP= extractedMessage.substring(31,37);
		//System.out.println("extracted OTP is:"+extractedOTP);
		this.Otp = extractedOTP;
		//System.out.println("otp value in this.otp "+OTP);

		
}
}
