package nbk.api.datamodel;

import org.testng.annotations.Test;

import nbk.api.pojoclasses.emailconfirmation;

public class emailconfirmationdata {

	@Test
	public emailconfirmation emailconfirm(String OTP) {
	
	
		emailconfirmation emailconf = new emailconfirmation();
		emailconf.setOtp("314575");
		
		return emailconf;
	}

}



