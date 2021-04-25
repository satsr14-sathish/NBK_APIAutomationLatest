package nbk.api.datamodel;

import org.testng.annotations.Test;

import nbk.api.pojoclasses.phoneconfirmation;
import nbk.api.request.phone.GETMocksmsOTP;

public class phoneconfirmationdata {
	String genconfotp;
	public String getGenconfotp() {
		return genconfotp;
	}
	@Test
	public phoneconfirmation phoneconfirm(String genotp) {
	
	//GETMocksmsOTP getmock = new GETMocksmsOTP();
		this.genconfotp = genotp;
	
	//System.out.println("OTP value in data model"+genconfotp);
		phoneconfirmation phoneconf = new phoneconfirmation();
		phoneconf.setOtp(genconfotp);
		
		
		return phoneconf;
	}

}



