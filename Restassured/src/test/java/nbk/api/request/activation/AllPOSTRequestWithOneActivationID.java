package nbk.api.request.activation;

import java.io.IOException;
import org.testng.annotations.Test;

import nbk.api.datamodel.phoneconfirmationdata;
import nbk.api.request.email.emailActivationPOST;
import nbk.api.request.email.emailconfirmationPOST;
import nbk.api.request.phone.GETMocksmsOTP;
import nbk.api.request.phone.phoneActivationPOST;
import nbk.api.request.phone.phoneConfirmationPOST;

public class AllPOSTRequestWithOneActivationID {
	certificateActivationPOST cert = new certificateActivationPOST();
	emailActivationPOST emailact = new emailActivationPOST();
	emailconfirmationPOST emailconf = new emailconfirmationPOST();
	phoneActivationPOST phoneact = new phoneActivationPOST();
	phoneConfirmationPOST phoneconf = new phoneConfirmationPOST();
	passwordsetupPOST passset = new passwordsetupPOST();
	termsConfirmationPOST termsconf = new termsConfirmationPOST();
	UsernameActivationPOST usernameact = new UsernameActivationPOST();
	termsActivationGET termsactget = new termsActivationGET();
	GETMocksmsOTP getmocks = new GETMocksmsOTP();
	phoneconfirmationdata phoneconfdata = new phoneconfirmationdata();

	
	  @Test public void AllRequestswithActivationID() throws IOException,
	  InterruptedException {
	  
	  cert.CertificateActivationPOSTRequest(); String activid = cert.getActid();
	  
	  termsactget.TermsActivationGETRequest(activid);
	  termsconf.TermsConfirmationPOST(activid);
	  usernameact.UsernameActivationPOSTRequest(activid);
	  phoneact.phoneActivationPOSTRequest(activid);
	  phoneconf.phoneConfirmationPOSTRequest(activid);
	  emailact.EmailActivationPOSTRequest(activid);
	  emailconf.EmailConfirmationPOSTRequest(activid);
	  //passset.PasswordActivationPOSTRequest(activid);
	  
	  
	  }
	  
	  
	  @Test public void EmailActivationPOSTwithActivationID() throws IOException {
	  
	  cert.CertificateActivationPOSTRequest(); 
	  String activid = cert.getActid();
	  emailact.EmailActivationPOSTRequest(activid);
	  
	  
	  }
	  
	  @Test(dependsOnMethods = { "EmailActivationPOSTwithActivationID" })
	  
	  
	  public void EmailConfirmationPOSTwithActivationID() throws IOException {
	  
	  cert.CertificateActivationPOSTRequest();
	  String activid = cert.getActid();
	  
	  emailact.EmailActivationPOSTRequest(activid);
	  
	  emailconf.EmailConfirmationPOSTRequest(activid);
	  
	  
	  
	  }
	  
	  //@Test(dependsOnMethods = { "PhoneActivationPOSTwithActivationID" }) 
	  @Test
	  public void PhoneConfirmationPOSTwithActivationID() throws IOException {
	  
			
			  cert.CertificateActivationPOSTRequest(); 
			  String activid = cert.getActid();
			 
			  phoneact.phoneActivationPOSTRequest(activid);
		
		  //getmocks.GETMocksmsOTPRequest(activid);
		  //String updatedOTP = getmocks.getOTP();
		  //System.out.println("updatedotpfromallpostrequests:"+updatedOTP);
		  //phoneconfdata.phoneconfirm(updatedOTP);
		  //System.out.println("all post requesthhhjhjhjhj");
		  phoneconf.phoneConfirmationPOSTRequest(activid);
		  
		  //System.out.println("valu of OTP in Phoenconf is:"+phoneconf.);
		  
	  
	  //phoneconf.phoneConfirmationPOSTRequest(activid);
	  
	  }
	  
	  @Test public void PhoneActivationPOSTwithActivationID() throws IOException {
	  
	  cert.CertificateActivationPOSTRequest(); 
	  String activid = cert.getActid();
	  phoneact.phoneActivationPOSTRequest(activid);
	  
	  }
	  
	  @Test public void PasswordSetupPOSTwithActivationID() throws IOException {
	  
	  cert.CertificateActivationPOSTRequest();
	  String activid = cert.getActid();
	  passset.PasswordActivationPOSTRequest(activid);
	  
	  }
	  
	  @Test
	  
	  public void TermsConfirmationPOSTwithActivationID() throws IOException {
	  
	  cert.CertificateActivationPOSTRequest(); 
	  
	  String activid = cert.getActid();
	  termsconf.TermsConfirmationPOST(activid);
	  
	  }
	  
	  @Test public void TermsActivationGETwithActivationID() throws IOException {
	  cert.CertificateActivationPOSTRequest();
String activid = cert.getActid();
	  termsactget.TermsActivationGETRequest(activid);
	  
	  }
	 

	@Test
	public void UsernameActivationPOSTwithActivationID() throws IOException {
		cert.CertificateActivationPOSTRequest();
		String activid = cert.getActid();
		usernameact.UsernameActivationPOSTRequest(activid);

	}

}