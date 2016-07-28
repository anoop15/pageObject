package loginpage;



public class LoginPageKeywords {
	Loginpageelements loginelement = new Loginpageelements();
	
	/**
	 * this method will login user 
	 * @param loginData
	 */
	
	public void gmailLogin(LoginPageData loginData){
		// provide value to username text field 
		loginelement.usenameTextField().sendKeys(loginData.getUserName());
		// click on next button
		loginelement.nextButton().click();
		//  provide value to password field 
		loginelement.passwordTextField().sendKeys(loginData.getpassword());
		// click on sign in button 
		loginelement.signInButton().click();
		loginelement.closebrowser();
		
	}
	
	
	public void gmailLogout(){
		loginelement.profilesetting().click();
		loginelement.signout().click();
		loginelement.closebrowser();
	}
	
	
	

}
