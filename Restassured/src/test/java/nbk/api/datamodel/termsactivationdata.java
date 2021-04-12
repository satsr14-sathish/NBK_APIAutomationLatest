package nbk.api.datamodel;

import org.testng.annotations.Test;

import nbk.api.pojoclasses.termsactivation;

public class termsactivationdata {

	@Test
	public termsactivation termsactiv(String version) {
	
	
		termsactivation termsactiv = new termsactivation();
		termsactiv.setVersion("1.0.0");
		
		return termsactiv;
	}

}



