package loginpage;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTestCase {
	LoginPageKeywords loginKeyword = new LoginPageKeywords();
	Loginpageelements elements = new Loginpageelements();
	Logger log = Logger.getLogger(LoginTestCase.class);
	
	//Logger logger = Logger.getLogger(LoginTestCase.class);
		
	@Parameters("browserType")
	@BeforeMethod
	public void loginsetup(String browser){
//	if(browsertype.equalsIgnoreCase("firefox")){
//			driver1 = new FirefoxDriver();
//		}else if (browsertype.equalsIgnoreCase("chrome")){
//			System.setProperty("webdriver.chrome.driver","/Users/anandmahajan/Desktop/chromedriver");
//			driver1=new ChromeDriver();
//		}
		elements.browserSetup(browser);
		log.info("Browser setup successfull");
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
		log.info("Login new sucssesfully");
		//logger.info("THIS IS GMAIL");
		
		// step Login Validation 
		
	//	check next page title here to validate if we are proper login or not 
		
	}
	
	
	
	
	
}
