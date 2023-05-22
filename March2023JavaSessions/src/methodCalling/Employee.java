package methodCalling;

public class Employee {
	
	String name;
	int age;
	
	public int add(int a, int b) {
		System.out.println("sum of two numbers: ");
		int sum = a+b;
		return sum;
	}
	
	public void getInfo(Employee emp) {
		
		emp.name = "Vishal";
		emp.age = 33;
		
	}
	

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		//e1.add(5, 6);//call by value
		
		
		System.out.println(e1.name+" "+e1.age);
		
		e1.getInfo(e1);//call by reference
		
		System.out.println(e1.name+" "+e1.age);
		
		

	}

}
