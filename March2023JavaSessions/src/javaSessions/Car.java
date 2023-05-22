package javaSessions;

import java.util.jar.Attributes.Name;

public class Car {
	
	String name;
	int price;
	String color;
	static final int wheels = 4;
	
	
	public void start() {
		System.out.println("Car is starting!");
	}
	
	public static void speedTest() {
		System.out.println("Speed Test.......");
	}
	

	public static void main(String[] args) {
		
		
		Car c1 = new Car();
		c1.name = "Mercedes";
		c1.price = 200;
		c1.color = "Steel Black";
		c1.start();
		
		Car c2 = new Car();
		c2.name = "BMW";
		c2.price = 190;
		c2.color = "Red";
		c2.start();
		
		Car c3 = new Car();
		c3.name = "Porsche";
		c3.price = 450;
		c3.color = "Jet Blue";
		c3.start();
		
		//how to access/assign static variables:
		//1. no need to use object reference
		//2. direct calling:
		System.out.println(wheels);
		System.out.println(c1.name+" "+c1.price+" "+c1.color);
		
		//2. by using class name:
		System.out.println(c1.name+" "+c1.price+" "+c1.color+" "+Car.wheels);
		
		//how to access static methods
		//1. no need to use object reference
		//2. direct calling:
		speedTest();
		c1.start();
		
		//2. by using class name:
		Car.speedTest();
		
		c1.speedTest();
		System.out.println(c1.wheels);
		
		
		
		

	}

}
