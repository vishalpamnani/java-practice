package ExceptionHandling;

public class Employee {

	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		try {

			int i = 9 / 0;
			System.out.println("Hello");
		} catch (ArithmeticException e) {

			e.printStackTrace();

		}

		System.out.println("Bye");

	}

}
