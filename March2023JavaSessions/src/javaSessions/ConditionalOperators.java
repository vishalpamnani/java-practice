package javaSessions;

public class ConditionalOperators {

	public static void main(String[] args) {
		
		int i = 10;
		int j = 20;
		
		if (i==j) {
			System.out.println("both are equal");
			
		}
		else {
			System.out.println("both are not equal");
		}
		
		if(j>=i) {
			System.out.println("j is greater than i");
		}
		else {
			System.out.println("i is greater than j");
		}
		
		// > >= < <= ==
		
		int total = 100;
		if(total != 100) {
			System.out.println("BYE");
		}
		else {
			System.out.println("Hi");
		}
		
		//nested if
		int marks = 100;
		if(marks<=100) {
			System.out.println("valid marks");
			
			
			
			if(marks>=90) {
				System.out.println("A grade");
				if(marks>=95) {
					System.out.println("eligible for a scholarship");
						if(marks==100) {
							System.out.println("Congratulations, you have received a 100% scholarship!");
						}
				}
			}
			else {
				if(marks<=80) {
					System.out.println("B grade");
				}
				
			}
		}
		else {
			System.out.println("invalid marks");
		}
		
		//if if if if if
//		String browser = "chrome";
//		if(browser.equals("chrome")) {
//			
//			System.out.println("chrome is launched");
//		}
//		if(browser.equals("firefox")) {
//				
//			System.out.println("chrome is launched");
//		}	
//		if(browser.equals("safari")) {
//				
//			System.out.println("chrome is launched");
//		}
//			
//		if(browser.equals("edge")) {
//					
//			System.out.println("chrome is launched");
//			
//		}
		
		//if-elseif
		String browser = "chrome";
		if(browser.equals("chrome")) {
			System.out.println("chrome is launched");
		}
		else if(browser.equals("firefox")) {
			System.out.println("firefox is launched");
		}
		else if (browser.equals("safari")) {
			System.out.println("safari is launched");
		}
		else if (browser.equals("edge")) {
			System.out.println("edge is launched");
		}
		else {
			System.out.println("invalid browser");
		}
		
		
		
	}

}
