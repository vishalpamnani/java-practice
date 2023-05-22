package javaSessions;

import java.util.Arrays;

public class ArrayConcept {

	public static void main(String[] args) {

		// Array: static array
		// collection of elements having same type

		// limitations of array:
		// 1. size is fixed: to overcome this we should use dynamic array
		// 2. only similar type of data can be stored: to overcome this we should use
		// object array
		// 3.

		int i[] = new int[4];

		System.out.println(i.length);
		int len = i.length;
		int hi = len - 1;
		int li = 0;

		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;

		System.out.println(i[1]);

		// to print all the values of the array
		for (int k = 0; k <= hi; k++) {
			System.out.println(i[k]);
		}

		// to print all the values of the array without using a loop
		System.out.println(Arrays.toString(i));

		// for each loop
		for (int e : i) {
			System.out.println(e);
			if (e == 20) {
				System.out.println("20 found!");
				break;
			}
		}

		// 2. double array
		double d[] = new double[4];
		d[0] = 12.34;
		d[1] = 29.38;
		d[2] = 23.12;
		d[3] = 48.09;
		System.out.println(d[0] + d[1]);

		System.out.println(Arrays.toString(d));

		for (double e : d) {
			System.out.println(e);
		}

		// 3. char array
		char ch[] = new char[4];
		ch[0] = 'a';
		ch[1] = '1';
		ch[2] = '$';
		ch[3] = 'd';

		System.out.println(Arrays.toString(ch));

		for (char e : ch) {
			System.out.println(e);
		}

		// 4. String array
		String lang[] = new String[4];
		lang[0] = "Java";
		lang[1] = "C";
		lang[2] = ".Net";
		lang[3] = "Python";

		System.out.println(lang.length);

		for (String e : lang) {
			System.out.println(e);
			if (e.equals("Java")) {
				System.out.println("Fantastic! Java is here.");
			}
			if (e.equals(".Net")) {
				System.out.println("Not you again!");
			}
		}

		// Object Array:
		// Object is a class in Java -- it is a super class

		// Employee Information: Name, Age, Salary, Gender, isPermanent
		Object emp[] = new Object[5];
		emp[0] = "Vishal";
		emp[1] = 33;
		emp[2] = 78.9;
		emp[3] = 'M';
		emp[4] = true;

		System.out.println(emp.length);

		for (Object e : emp) {
			System.out.println(e);
			if (e.equals("Vishal")) {
				System.out.println("Employee is from Pune!");
			}
		}

		Object emp1[] = new Object[5];
		emp1[0] = "Rajeshree";
		emp1[1] = 28;
		emp1[2] = 90.4;
		emp1[3] = 'F';
		emp1[4] = true;

		for (int m = 0; m <= emp1.length - 1; m++) {
			System.out.println(emp1[m]);
			if (emp1[m].equals("Rajeshree")) {
				System.out.println("Employee is from Mumbai!");
			}
		}

		// How to create an array
		// 1. new keyword
		// 2. array literals

		int num[] = { 11, 13, 17, 98, 56 }; // you are already aware of the values
		System.out.println(num.length);

		String products[] = { "mobile", "pencil", "sharpner", "mouse" };
		System.out.println(products[3]);
		for (String e : products) {
			System.out.println(e);
		}
		for (int s = 0; s <= products.length - 1; s++) {
			System.out.println(products[s]);
		}
		System.out.println(Arrays.toString(products));

		Object data[] = { "Macbook", 1000, 16, 'W', true };
		for (Object e : data) {
			System.out.println(e);
		}
		System.out.println(Arrays.toString(data));

	}

}
