package ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {
		
		System.out.println("Hi");
		
		try {
		int i = 9/0;
		}
		catch(ArithmeticException e) {
			System.out.println("AE is occurring!");
			e.printStackTrace();
		}
		finally {
			System.out.println("Finally Block");
		}
		
		System.out.println("Bye");

	}

}
