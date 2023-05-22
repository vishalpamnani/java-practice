package javaSessions;

public class Application {
	
	//Method Overloading

	// 0 parameter function
	public void test() {
		System.out.println("test method with 0 params");

	}

	// 1 parameter
	public void test(int i) {
		System.out.println("One integer param: "+i);
	}

	// 1 parameter
	public void test(String i) {

	}

	// 2 params
	public void test(int i, int j) {

	}

	// 2 params
	public void test(int i, String j) {

	}
	
	//2 params
	public void test(String j, int i) {
		
	}
	
	
	
	public static void main(String[] args) {
		
		Application obj = new Application();
		obj.test();
		obj.test(23);

	}

}
