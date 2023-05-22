package javaSessions;

public class SwapNumbers {
	
	public void swapTwoNumbers(int a, int b) {
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("Reverse numbers are "+ a +" and "+ b);
				
	}

	public static void main(String[] args) {
		
		SwapNumbers sn = new SwapNumbers();
		sn.swapTwoNumbers(90, 78);

	}

}
