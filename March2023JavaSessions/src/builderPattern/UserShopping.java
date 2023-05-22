package builderPattern;

public class UserShopping {

	public static void main(String[] args) {
		
		EcommApplication ecom = new EcommApplication();
		ecom.login("vishal@gmail.com", "Vishal@123")
			.doSearch("iPhone")
				.addToCart("iPhone")
					.doPayment("1212 1312 7865 3289", 344)
					 	.generateOrder()
					 		.logout();
			
		//
		ecom.login("vishal@gmail.com", "Vishal@123")
			.doSearch("t-shirt", 5000, "NIKE")
				.addToCart("t-shirt")
					.logout();
		
		//
		ecom.login("vishal@gmail.com", "Vishal@123")
			.addToCart("t-shirt")
				.doPayment("vishal@hdfcbank")
					.generateOrder()
						.logout();
		
		//
		ecom.login("R@gmail.com", "R@123")
			.logout();
		
		
		



	}

}
