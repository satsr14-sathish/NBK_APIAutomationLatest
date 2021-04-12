package nbk.api.datamodel;

import org.testng.annotations.Test;

import nbk.api.pojoclasses.phoneactivation;

public class phoneactivationdata {

	@Test
	public phoneactivation phoneactiv(String phoneNumber) {
	
	
		phoneactivation phoneact = new phoneactivation();
		phoneact.setPhoneNumber("12345678");
		
		return phoneact;
	}

}



