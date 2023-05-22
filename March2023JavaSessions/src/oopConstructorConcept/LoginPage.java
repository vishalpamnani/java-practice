package oopConstructorConcept;

public class LoginPage {
	
	String userName;
	String password;
	
	public LoginPage(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}
	
	public boolean doLogin() {
		System.out.println("Enter username: "+userName);
		System.out.println("Enter password: "+password);
		System.out.println("Click on Login Button");
		System.out.println("User is logged in");
		return true;    
	}
	
	public void resetPwd() {
		System.out.println("reset pwd:" +password);
	}

}
