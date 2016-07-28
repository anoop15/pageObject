package loginpage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTestCase {
	LoginPageKeywords loginKeyword = new LoginPageKeywords();
	Loginpageelements elements = new Loginpageelements();
	
	@BeforeTest
  public void login(){
		System.out.println("open browser");
		elements.browserSetup();
	  
  } 
	/**
	 * This test case for login test 
	 */
	@Test
	public void Verify_User_Can_Login(){
		
		// step Test Data 
		LoginPageData data = new LoginPageData();
		data.setUserName("anooprthe@gmail.com");
		data.setPassword("anoop123#");
		// step Test execution
		loginKeyword.gmailLogin(data);
		
		// step Login Validation 
		
	//	check next page title here to validate if we are proper login or not 
		
	}
	
	@Test
	public void Verify_User_can_logout(){
		login();
		LoginPageData data = new LoginPageData();
		data.setUserName("anooprthe@gmail.com");
		data.setPassword("anoop123#");
		// step Test execution
			loginKeyword.gmailLogin(data);
			loginKeyword.gmailLogout();
	}
	
	
	
	
}
