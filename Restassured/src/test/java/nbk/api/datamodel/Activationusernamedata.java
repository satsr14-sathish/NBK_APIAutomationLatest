package nbk.api.datamodel;

import org.testng.annotations.Test;

import nbk.api.pojoclasses.Activationusername;

public class Activationusernamedata {

	@Test
	public Activationusername userdata(String username) {

		Activationusername usernam = new Activationusername();
		usernam.setUsername("Test");

		return usernam;
	}

}



