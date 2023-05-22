package oopConstructorConcept;

public class CarTest {

	public static void main(String[] args) {
		
		//added the car data
		Car c1 = new Car("Merc", 250000);
		
		//fetching the car data
		System.out.println(c1.name+" "+c1.price);
		
		Car c2 = new Car("BMW", "Black");
		System.out.println(c2.name+" "+c2.color);
		
		Car c3 = new Car("Civic", 50000, false);
		System.out.println(c3.name+" "+c3.price+" "+c3.isAutomatic);
		
		Car c4 = new Car("Porsche", "Metallic Gray", 900000, true);
		System.out.println(c4.name+" "+c4.color+" "+c4.isAutomatic);

	}

}
