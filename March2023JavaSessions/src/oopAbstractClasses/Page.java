package oopAbstractClasses;

public abstract class Page {
	
	
	
	public Page() {
		System.out.println("Page Class Constructor");
	}
	
	
	public abstract void title();
	
	public abstract void url();
	
	public final void displayLogo() {
		System.out.println("My Page Logo");
	}
	
	public void pageLoadingTime() {
		System.out.println("The page loading time is 10 seconds");
	}
	
	public static void pageCycle() {
		System.out.println("Page Cycle");
	}

}
