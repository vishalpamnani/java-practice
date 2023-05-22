package javaSessions;

public class LoopsConcept {

	public static void main(String[] args) {
		
		//1 to 100
		//1. while loop
		
		int i = 1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		
		//infinite loop
		while(true) {
			System.out.println("Welcome to the Taj Hotel!");
			break;
		}
		
		//
		int p = 1;
		while(p<=100) {
			System.out.println(p);
			p=p+2;
		}
		
		
		int num = 1;
		while(num<=100) {
			System.out.println(num);
				if(num % 5 == 0) {
					System.out.println("Hi");
					break;
				}
		num++;
		}
			
		//
		int n = 1;
		while(n<=5) {
			System.out.println("Vishal");
			n++;
		}
		
		//
		int counter = 100;
		while(counter>=100) {
			System.out.println(counter);
			
			if(counter == 200) {
				System.out.println("bye!");
				break;
			}
			counter++;
		}

	}

}
