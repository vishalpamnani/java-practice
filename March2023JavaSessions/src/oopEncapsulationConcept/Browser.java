package oopEncapsulationConcept;

public class Browser {
	
	public void launchBrowser() {
		System.out.println("launch browser");
		checkRam();
		checkVersion();
		checkOS();
		checkBrowserServices();
		System.out.println("Chrome is launched!");
	}
	
	private void checkRam() {
		System.out.println("check ram");
	}
	
	private void checkVersion() {
		System.out.println("check version");
	}
	
	private void checkOS() {
		System.out.println("check os");
	}
	
	private void checkBrowserServices() {
		System.out.println("check browser services");
	}

}
