package javaSessions;

public class SwitchCaseConcept {

	public static void main(String[] args) {
		
		
		String browser = "ie";
		
		switch (browser) {
		case "chrome":
			System.out.println("chrome is launched");
			break;
			
		case "firefox":
			System.out.println("firefox is launched");
			break;
			
		case "safari":
			System.out.println("safari is launched");
			break;
			
		case "edge":
			System.out.println("edge is launched");
			break;	

		default:
			System.out.println("invalid browser passed, please pass the correct browser name.");
			break;
		
		case "vishal":
			System.out.println("vishal is launched");
			break;
			
		}
			
		
		//
		int marks = 100;
		switch (marks) {
		
		case 100:
			System.out.println("A++");
			break;
			
		case 90:
			System.out.println("Grade A");
			break;
		
		case 80:
			System.out.println("Grade B");
			break;
			
		case 70:
			System.out.println("Grade B");
			break;

		default:
			System.out.println("F");
			break;
		}
		
		//
//		float weight = 75.8;
//		switch (weight) {
//		case value:
//			
//			break;
//
//		default:
//			break;
//		}
		
		//
		char ch = 'z';
		switch (ch) {
		case 'a':
			System.out.println("vowel");
			break;
		case 'e':	
			System.out.println("vowel");
			break;
		case 'i':
			System.out.println("vowel");
			break;
		case 'o':	
			System.out.println("vowel");
			break;
		case 'u':	
			System.out.println("vowel");
			break;

		default:
			System.out.println("not a vowel");
			break;
		}
		
		//real time use of switch case
		

	}

}
