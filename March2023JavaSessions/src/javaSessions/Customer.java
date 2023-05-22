package javaSessions;

import java.util.Arrays;

public class Customer {
	
	//WAF:
	//getEmployeeDevices(empName(String))
	//return device list
	public String[] getEmployeeDevices(String empName) {
		System.out.println("Device list of "+empName);
		if(empName.equals("KD")) {
			String devices[] = {"Macbook Pro", "iPhone 14", "iPad"};
			return devices;
		}
		else if(empName.equals("Aadil")) {
			String devices[] = {"Thinkpad", "Redmi Note 10", "Samsung F2"};
			return devices;
		}
		else if(empName.equals("Priyesh")) {
			String devices[] = {"Lenovo", "One Plus 7T", "Jio Sim", "Headphones"};
			return devices;
		}
		else {
			System.out.println("***Employee does not exist***");
			return null;
			
		}
		
		
	}

	public static void main(String[] args) {
		
		Customer cust = new Customer();
		String d[] = cust.getEmployeeDevices("Priyesh");
		System.out.println(Arrays.toString(d));
		System.out.println("Number of devices: " +d.length);		

	}

}
