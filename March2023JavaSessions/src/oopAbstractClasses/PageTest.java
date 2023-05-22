package oopAbstractClasses;

public class PageTest {

	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage();
		lp.title();
		lp.url();
		lp.displayLogo();
		lp.pageLoadingTime();
		lp.resetPassword();
		
		Page.pageCycle();
		LoginPage.pageCycle();
		
		//topcasting
		//child class object can be referred by the abstract parent class reference variable
		Page pg = new LoginPage();
		pg.title();
		pg.url();
		pg.displayLogo();
		pg.pageLoadingTime();
		

	}

}
