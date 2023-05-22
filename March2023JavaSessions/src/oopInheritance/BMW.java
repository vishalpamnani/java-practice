 package oopInheritance;

public class BMW extends Car{
	
	
	@Override
	public void start() {
		System.out.println("BMW start method");
	}
	
	public void autoParking() {
		System.out.println("BMW auto parking");
	}
	
	//Method Hiding
	public static void billing() {
		System.out.println("BMW billing");
	}
	
	@Override
	public void payment(String cc, int cvv) {
		System.out.println("BMW payment using: "+cc+" : "+cvv);
	}
	
	//@Override
	public void payment(String upi) { 
		System.out.println("BMW payment using: "+upi);
	}
	
//	@Override
//	public void engine() {
//		System.out.println("BMW -- V8 engine");
//	}

}
