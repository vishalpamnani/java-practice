package builderPattern;

public class EcommApplication {
	
	public EcommApplication login() {
		System.out.println("Login to app!");
		return this;
	}
	
	public EcommApplication login(String username, String password) {
		System.out.println("Login to app using: "+username+" : "+password);
		return this;
	}
	
	public EcommApplication doSearch(String productName) {
		System.out.println("Search product using: "+productName);
		return this;
	}
	
	public EcommApplication doSearch(String productName, int price, String brand) {
		System.out.println("Search product using: "+productName+" "+price+" "+brand);
		return this;
	}
	
	public EcommApplication addToCart(String productName) {
		System.out.println("Adding to cart: "+productName);
		return this;
	}
	
	public EcommApplication doPayment(String cc, int cvv) {
		System.out.println("Making payment: "+cc+" "+cvv);
		return this;
	}
	
	public EcommApplication doPayment(String upi) {
		System.out.println("Making payment: "+upi);
		return this;
		
	}
	
	public EcommApplication doPayment(String paypalId, String password) {
		System.out.println("Making payment: "+paypalId+" "+password);
		return this;
	}
	
	public EcommApplication generateOrder() {
		System.out.println("Your order id is: "+12345);
		return this;
	}
	
	public EcommApplication logout() {
		System.out.println("Logout!");
		return this;
	}
	

}
