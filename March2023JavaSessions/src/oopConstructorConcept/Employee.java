package oopConstructorConcept;

public class Employee {

	public Employee() {
		System.out.println("Default Constructor!");
	}
	
	//1 param
	public Employee(int a) {
		System.out.println("1 param Constructor!"+a);
	}
	
	public Employee(int a, int b) {
		System.out.println("2 params...addition.: "+(a+b));
	}
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		Employee e2 = new Employee(10);
		Employee e3 = new Employee(20, 30);


	}

}
