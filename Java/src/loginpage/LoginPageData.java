package loginpage;

public class LoginPageData {

	private String userName;
	private String password;
	
	
	/**
	 * this represents method will get value for user field 
	 * @return
	 */
	public String getUserName(){
		return userName;
	}
	
	/**
	 * this represents method will set value for user field
	 * @param userName
	 */
	public void setUserName(String userName){
		this.userName = userName;
		
	}
	
	/**
	 * this repsents method will get  value for password
	 * @return
	 */
	public String getpassword(){
		return password;
	}
	
	/**
	 * this method represent it will set value for password
	 * @param password
	 */
	public void setPassword(String password){
		this.password = password;
	}
}
