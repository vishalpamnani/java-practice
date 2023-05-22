package javaSessions;

public class User {
	
	String name;
	int age;
	String city;

	public static void main(String[] args) {
		
		User u1 = new User();
		u1.name = "John";
		u1.age = 23;
		u1.city = "Delhi";
		
		User u2 = new User();
		u2.name = "Rafa";
		u2.age = 31;
		u2.city = "Bangalore";
		
		User u3 = new User();
		u3.name = "Akriti";
		u3.age = 29;
		u3.city = "Pune";
		
		System.out.println(u1.name+" "+u1.age+" "+u1.city);
		System.out.println(u2.name+" "+u2.age+" "+u2.city);
		System.out.println(u3.name+" "+u3.age+" "+u3.city);
		
		u1 = u2;
		
		System.out.println(u1.name+" "+u1.age+" "+u1.city);
		System.out.println(u2.name+" "+u2.age+" "+u2.city);
		System.out.println(u3.name+" "+u3.age+" "+u3.city);
		
		u2 = u3;
		
		System.out.println(u1.name+" "+u1.age+" "+u1.city);
		System.out.println(u2.name+" "+u2.age+" "+u2.city);
		System.out.println(u3.name+" "+u3.age+" "+u3.city);
		
		u3 = u1;
		
		System.out.println(u1.name+" "+u1.age+" "+u1.city);
		System.out.println(u2.name+" "+u2.age+" "+u2.city);
		System.out.println(u3.name+" "+u3.age+" "+u3.city); 
		
		
	}

}
