package nbk.api.request.phone;

import static io.restassured.RestAssured.*;
import java.io.IOException;
import org.testng.annotations.Test;
import io.restassured.response.ValidatableResponse;
import nbk.api.datamodel.*;
import nbk.api.headers.*;
import nbk.api.utilobjects.*;

public class phoneConfirmationPOST extends PropertiesReader {

	@Test
	public void phoneConfirmationPOSTRequest(String actid) throws IOException {
		
		ValidatableResponse putres;
		phoneconfirmationdata data = new phoneconfirmationdata();
		PropertiesReader Global = new PropertiesReader();
		Headers head = new Headers();
phoneconfirmationdata phonecondat = new phoneconfirmationdata();
GETMocksmsOTP getmocks = new GETMocksmsOTP();
getmocks.GETMocksmsOTPRequest(actid);
String updatedOTP = getmocks.getOTP();
phonecondat.phoneconfirm(updatedOTP);

//System.out.println("phoneconfpostreq otp:"+updatedOTP);
/*
 * String confdatotp = phonecondat.getGenconfotp();
 * System.out.println("xxxxxxxxxxxxxx"+confdatotp);
 */

		putres = given().spec(requestSpecification())
				.headers(head.LanguageHeaders())
				.headers("Activation-id",actid)
				.headers(head.DeviceHeaders())
				.headers(head.PlatformHeaders())
				.headers(head.firmwareHeaders())
				.body(data.phoneconfirm(updatedOTP))
				.when().log().all(true)
				.post(Global.getGlobalvalue("phoneconfirmation"))
				.then().statusCode(200)
				.log().all(true);


	}
}
