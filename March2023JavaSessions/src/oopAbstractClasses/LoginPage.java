package oopAbstractClasses;

public class LoginPage extends Page {
	
	
	public LoginPage() {
		System.out.println("Login Page Constructor");
	}

	@Override
	public void title() {
		System.out.println("LP -- Title");
	}

	@Override
	public void url() {
		System.out.println("LP -- URL");
	}
	
	public void resetPassword() {
		System.out.println("LP -- reset pwd");
	}
	
	
	@Override
	public void pageLoadingTime() {
		System.out.println("Login page loading time is 5 seconds");
	}
	
	public static void pageCycle() {
		System.out.println("Login Page Cycle");
	}


}
