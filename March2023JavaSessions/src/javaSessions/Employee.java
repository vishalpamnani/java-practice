package javaSessions;

public class Employee {
	
	//class is a category of objects or a blueprint of objects
	//object is the physical entity 
	
	//class variables 
	String name;
	int age;
	String city;
	double salary;
	

	public static void main(String[] args) {
		
		//create object of the Employee class using new keyword
		//
		Employee e1 = new Employee();
		
		e1.name = "Eden";
		e1.age = 28;
		e1.city = "London";
		e1.salary = 98.32;
		
		System.out.println(e1.name+" "+e1.age+" "+e1.city+" "+e1.salary);
		
		//
		Employee e2 = new Employee();
		
		e2.name = "Frank";
		e2.age = 32;
		e2.city = "London";
		e2.salary = 85.20;
		
		System.out.println(e2.name+" "+e2.age+" "+e2.city+" "+e2.salary);
	
		//
//		Employee e3 = new Employee();
//		e3 = null; //null reference object
//		e3.name = "Vishal";
		
		//object without references
		new Employee().name = "Nate";
		new Employee().age = 20;
		
		
		

	}

}
