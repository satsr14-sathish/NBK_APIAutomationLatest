package nbk.api.datamodel;

import org.testng.annotations.Test;

import nbk.api.pojoclasses.password;


public class passwordsetupdata {

	@Test
	public password passwordset(String certificateauuth,String password) {
	
		password pass = new password();
		pass.setValue("76616c69645f5031");
		pass.setCertificateSigningRequestB64("MIG5MGUCAQAwADBcMA0GCSqGSIb3DQEBAQUAA0sAMEgCQQCW7vBpct/S3A4PAodTHTxKe0cm+uH7C5KJ8qIh+SN7+tDBOQGCzlMQmOJu7HHPscaHcADNdlaNiLqIgIlqctJLAg"
				+ "MBAAGgADANBgkqhkiG9w0BAQUFAANBAGLvzWC+B+0689486MIsvnSymrFuzp8iEFHCy8g7Y5pKnWbPdhMYDrHMnPa8XFssNSt/eV3SDBL61UaTyNM4Nss=");
		return pass;
	}
	
	

}



