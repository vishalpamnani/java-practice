package javaSessions;

public class MethodsInJava {
	
	//function: independent; one function cannot contain another function
	
	//1. no input and no return
	public void play() {
		System.out.println("Entering play method!");
		int a = 10;
		int h = 15;
		System.out.println("Addition of a & h is: "+(a+h));
	}
	
	//2. no input and some return
	public int getBillAmount() {
		
		
		System.out.println("Entering Billing Method!");
		int foodBills = 100;
		int drinks = 50;
		int totalAmount = foodBills+drinks;
		
		return totalAmount;
		
	}
	
	public String getEmployeeName() {
		System.out.println("Entering employee name function!");
		
		String name = "Rohan";
		return name;
	}
	
	public boolean isElementThere() {
		System.out.println("Checking element's existence...");
		boolean flag = true;
		return flag;
	}
	
	public int getMarks() {
		int a = 100;
		int bonus = 5;
		int negative = -10;
		int finalMarks = a+bonus-negative;
		return finalMarks;
	}
	
	//3. some input and some return
	//WAF which takes 2 variables a and b and returns the sum of them
	public int getSum(int a, int b) {
		System.out.println("Sum of the two numbers...");
		int sum = a+b;
		return sum;
	}
	
	//WAF
	//input params; int, double
	//return multiplication of the params
	public double getMultiplication(int x, double y) {
		System.out.println("Multiplication of the two numbers...");
		double mul = x*y;
		return mul;
	}
	
	public String getEmpSalaryInfo(String empName, int bonusAmount) {
		System.out.println("emp salary");
		return empName + ":"+bonusAmount;
	}
	
	

	public static void main(String[] args) {
		
		//call the play method/function
		MethodsInJava mj = new MethodsInJava();
		mj.play();
		
		int m1 = mj.getBillAmount();
		System.out.println("Total Bill: "+m1);
		
		System.out.println(mj.getEmployeeName());
		
		if(mj.isElementThere()) {
			System.out.println("Click on this element!");
		}
		
		int s1 = mj.getSum(10, 20);
		System.out.println(s1);
		
		double mul1 = mj.getMultiplication(20, 3.5);
		System.out.println(mul1);
		
		String empInfo = mj.getEmpSalaryInfo("Vishal", 200000);
		System.out.println(empInfo);

	}

}
