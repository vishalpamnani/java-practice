package oopInterface;

public interface USMedical extends WMC, USHealthBoard {
	
	int min_fee = 10;
	
	//jdk 1.7 - 100% abstraction
	//jdk 1.8 - default non static methods - around 100% abstraction
	//0% abstration also possible
	
	public void cardioServices();
	
	public void neuroServices();
	
	public void physioServices();
	
	public void emergencyServices();
	
	//After jdk 1.8
	//1. static method with the method body are allowed
	
	public static void taxCalculation() {
		System.out.println("US -- tax calculation");
	}
	
	//2. default methods: not static 
	default void getMedicalServices() {
		System.out.println("Default Method Medical Services in US");
	}

}
