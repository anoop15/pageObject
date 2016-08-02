package loginpage;


import java.util.concurrent.TimeUnit;

import org.apache.xalan.templates.ElemElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * This represents elements for login page
 * @author Umesh
 *
 */


public class Loginpageelements {
	public static String url = "https://www.gmail.com";
	public static WebDriver driver;
	public static WebDriverWait wait; 
	
	/**
	 * this method should be call in before class it does not belong to webelement class 
	 */

	public void browserSetup(String browser){
	if(browser.equalsIgnoreCase("firefox")){
		driver = new FirefoxDriver();
		 wait = (new WebDriverWait(driver, 30));
	}else if (browser.equalsIgnoreCase("chrome")){
		System.setProperty("webdriver.chrome.driver","/Users/anandmahajan/Desktop/chromedriver");
		driver=new ChromeDriver();
		 wait = (new WebDriverWait(driver, 30));
	}
	
	    driver.navigate().to(url);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
	/**
	 *This represet quit driver
	 * 
	 */
	public void closebrowser(){
		try{
		if(driver!=null)
			driver.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		}
	
	
	/**
	 * 
	 * This represents username text field 
	 * @return
	 */
	public WebElement usenameTextField (){
		
		WebElement element = driver.findElement(By.name("Email"));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		return element;
	}
	

	/**
	 * This represents next button   
	 * @return
	 */
	public WebElement nextButton (){
		
		WebElement element = driver.findElement(By.id("next"));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		return element;
	}

	
	/**
	 * This represents for password text field 
	 * @return
	 */
	public WebElement passwordTextField (){
		
		WebElement element = driver.findElement(By.name("Passwd"));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		return element;
	}
	
	
	/**
	 * This represents for sign in button 
	 * @return
	 */
	public WebElement signInButton (){
		
		WebElement element = driver.findElement(By.id("signIn"));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		return element;
	}
	
	/**
	 * This represent for profile setting button
	 * @return
	 */
	
	public WebElement profilesetting(){
		WebElement element =driver.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span"));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		return element;
	}
	
	/**
	 * This represent for signout button
	 * @return
	 */
	
	public WebElement signout(){
		WebElement element =driver.findElement(By.id("gb_71"));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		return element;
	}

	
	
	
	/**
	 *  This represent for compose button 
	 *  @return
	 */
	
//	public WebElement composemail(){
//		WebElement element=driver.findElement(by.id(""));
//		wait.until(ExpectedConditions.elementToBeClickable(element));
//		return element;
//	}
	
}
