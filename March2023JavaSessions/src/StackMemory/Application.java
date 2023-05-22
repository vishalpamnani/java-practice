package StackMemory;

public class Application {

	public void m1() {
		System.out.println("M1 method");
		m2();
	}

	public void m2() {
		System.out.println("M2 method");
		m3();
	}

	public void m3() {
		System.out.println("M3 method");
	}

	public static void main(String[] args) {

		Application app = new Application();
		app.m1();

	}

}
