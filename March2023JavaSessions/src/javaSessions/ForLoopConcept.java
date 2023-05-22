package javaSessions;

public class ForLoopConcept {

	public static void main(String[] args) {
	
		// 1 to 10
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
//		for(;;) {
//			System.out.println("Adios!");
//		}
		
		//5 to 50
		for(int k=5; k<=50; k++) {
			System.out.println(k);
			if(k % 5 == 0) {
				System.out.println("This number is divisble by 5");
				break;
			}
		}
		
		System.out.println("------------");
		//a to z
		for (char c='a'; c<='z'; c++) {
			System.out.println("Ascii value of " + c + ": " +(int)c);
		}
		
		for(byte b=1; b<=5; b++) {
			System.out.println(b);
		}
		
		for (double d=1.1; d<=10.0; d++) {
			System.out.println(d);
		}
		
		for (String s = "Vishal"; s.equals("vishal");) {
			System.out.println("Hello " + s);
			break;
		}
		
		//while loop use cases:
		//1. when number of iterations are not fixed
		//2. infinite loading
		//3. waiting for an element on a page
		//4. waiting for the page to load
		//5. calendar handling
		//6. pagination
		
		//while loop use cases:
		//1. when number of iterations are fixed
		//2. month drop down: Jan to Dec
		//3. category iterations on ecomm webistes
		//4. country drop down
		//5. 
		//6. pagination
		
		
		
	}

}
