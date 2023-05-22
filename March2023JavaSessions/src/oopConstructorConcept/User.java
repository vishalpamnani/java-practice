package oopConstructorConcept;

public class User {

	// class variables
	String name;
	int age;
	String email;
	String password;
	String phoneNumber;
	
	
	public boolean forgotPassword() {
		//business logic
		return true;
	}
	
	
	
	

	// hidden constructor - default const will be added by JVM

	public User(String name, int age) {
		this.name = name;
		this.age = age;

	}

	public User(String name, int age, String email) {
		this.name = name;
		this.age = age;
		this.email = email;

	}
	
	public User(String name, int age, String email, String password) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.password = password;
	}

	public User(String name, int age, String email, String password, String phoneNumber) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.password = password;
		this.phoneNumber = phoneNumber;
	}

	public static void main(String[] args) {

		User u1 = new User("Vishal", 33);
		System.out.println(u1.name);
		System.out.println(u1.age);

		User u2 = new User("Michelle", 25, "michelle@gmail.com");
		System.out.println(u2.name);
		System.out.println(u2.age);
		System.out.println(u2.email);
		
		User u3 = new User("Nisha", 25, "nisha@gmail.com", "qwertyuiop", "9087094512");
		System.out.println(u3.name+" "+u3.age+" "+u3.email+" "+u3.password+" "+u3.phoneNumber);
		

	}

}
