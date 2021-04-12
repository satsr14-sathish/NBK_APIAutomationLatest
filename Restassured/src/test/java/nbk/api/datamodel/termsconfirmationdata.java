package nbk.api.datamodel;

import org.testng.annotations.Test;

import nbk.api.pojoclasses.termsconfirmation;

public class termsconfirmationdata {

	@Test
	public termsconfirmation termsconfirm(String version) {
	
	
		termsconfirmation termsconf = new termsconfirmation();
		termsconf.setVersion("1.0.0");
		return termsconf;
	}

}


