package javaSessions;

public class NestedLoopsConcept {

	public static void main(String[] args) {
		
		
		//00 01 02 03 04 05
		//10 11 12 13 14 15
		//20 21 22 23 24 25
		//30
		//40
		//50
		
		
		for(int i=0; i<=5; i++) {
			for(int j=0; j<=5; j++) {
				
				System.out.print(i+""+j+" ");
				break;
			}
			System.out.println();
		}
	
		
		//000 001 002 003 004 005
		for(int v=0; v<=5; v++) {
			for(int u=0; u<=5; u++) {
				for(int l=0; l<=5; l++) {
					System.out.print(v+""+u+l+" ");
				}
				System.out.println();
			}
			
		}
		
		

	}

}
