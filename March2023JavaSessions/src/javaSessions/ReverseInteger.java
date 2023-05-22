package javaSessions;

public class ReverseInteger {

	public int reverseNumber(int number) {
		
		int rev = 0;
		
		while(number!= 0) {
			rev = (rev*10)+(number%10);
			number = number/10;
			
			
		}
		
		
		
		return rev;
		
	}
	
	
	public static void main(String[] args) {
		
		
		
		ReverseInteger ri = new ReverseInteger();
		
		System.out.println(ri.reverseNumber(9087));
		
		System.out.println(ri.reverseNumber(345));
		
		System.out.println(ri.reverseNumber(907));
		
		System.out.println(ri.reverseNumber(8765));

		System.out.println(ri.reverseNumber(3465));
		
		System.out.println(ri.reverseNumber(97765));
		
		System.out.println(ri.reverseNumber(959));




	}

}
