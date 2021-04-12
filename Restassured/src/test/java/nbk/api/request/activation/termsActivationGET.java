package nbk.api.request.activation;

import static io.restassured.RestAssured.given;
import java.io.IOException;
import org.testng.annotations.Test;
import io.restassured.response.ValidatableResponse;
import nbk.api.headers.Headers;
import nbk.api.utilobjects.PropertiesReader;

public class termsActivationGET extends PropertiesReader {

	ValidatableResponse  putres;
	PropertiesReader Global = new PropertiesReader();
	Headers head = new Headers();

	@Test
	public void TermsActivationGETRequest(String actid) throws IOException  {

		putres = given().spec(requestSpecification())
				.headers(head.LanguageHeaders())
				.headers("Activation-id",actid)
				.headers(head.DeviceHeaders())
				.headers(head.PlatformHeaders())
				.headers(head.firmwareHeaders())
				.when().log().all(true)
				.get(Global.getGlobalvalue("termsactivation"))
				.then()
				.statusCode(200)
				.assertThat()
				.headers(head.contentLengthGetTerms())
				.log().all(true);
	}

}
