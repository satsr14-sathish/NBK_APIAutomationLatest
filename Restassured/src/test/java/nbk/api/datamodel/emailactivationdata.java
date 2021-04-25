package nbk.api.datamodel;

import org.testng.annotations.Test;

import nbk.api.pojoclasses.emailactivation;

public class emailactivationdata {

	@Test
	public emailactivation emailactiv(String email) {
	
	
		emailactivation emailact = new emailactivation();
		emailact.setEmail("test01@testdomain.com");
	
		return emailact;
	}

}