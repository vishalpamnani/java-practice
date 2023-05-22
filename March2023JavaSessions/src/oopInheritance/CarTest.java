package oopInheritance;

public class CarTest {

	public static void main(String[] args) {
		
		BMW b1 = new BMW();
		b1.start();//overriding
		b1.stop();//inheritance
		b1.refuel();//inheritance
		b1.autoParking();//individual method of BMW class
		
		BMW.billing();
		Car.billing();
		
		BMW.display();
		b1.running();
		
		b1.payment("vishal@okhdfcbank");
		b1.engine();
		
		System.out.println("************************************");
		
		Car c1 = new Car();
		c1.start();
		c1.stop();
		c1.refuel();
		c1.engine();
		
		System.out.println("************************************");
		
		//child class object can be referred by parent class ref variable
		Car c2 = new BMW();
		c2.start(); 
		c2.stop();
		c2.refuel();
		
		System.out.println("************************************");
		
		//down casting
		//parent class object can be referred by child class ref variable
//		BMW b2 = (BMW) new Car();//ClassCastException at runtime
//		b2.start();
//		b2.stop();
//		b2.refuel();
//		b2.autoParking();
		
		//child class object can be referred by grand parent class ref variable
		Vehicle v = new BMW();
		v.petroEngine();
		v.engine();
		


	}

}
