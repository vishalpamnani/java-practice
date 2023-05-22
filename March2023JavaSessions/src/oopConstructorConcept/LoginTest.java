package oopConstructorConcept;

public class LoginTest {

	public static void main(String[] args) {
		
		LoginPage lp1 = new LoginPage("vishalpamnani", "Vishal@123");
		
		if(lp1.doLogin()) {
			System.out.println("Display the menu");
		}
		
		LoginPage lp2 = new LoginPage("ra@gmail.com", "R@123");
		System.out.println(lp2.userName);
		System.out.println(lp2.password);

	}

}
