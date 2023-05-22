package methodCalling;

public class User {
	
	String username;
	int age;
	String city;
	
	

	public User(String username, int age, String city) {
		this.username = username;
		this.age = age;
		this.city = city;
	}
	
	public User(String username, int age) {
		this(username, age, "Pune");
		this.username = username;
		this.age = age;
	}
	
	public void login() {
		this.logout();
	}
	
	public void logout() {
		
	}
	
	

	public static void main(String[] args) {
		
		User u1 = new User("Vishal", 33);
		
		System.out.println(u1.username+" "+u1.age+" "+u1.city);
		

	}
}
