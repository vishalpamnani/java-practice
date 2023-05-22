package DynamicArray;

import java.util.HashMap;

public class HashMapConcept {

	public static void main(String[] args) {

		// to store in a key value format we use a HashMap

		HashMap<String, String> employeeMap = new HashMap<String, String>();

		employeeMap.put("Vishal", "SDET");
		employeeMap.put("Nikhil", "SDET1");
		employeeMap.put("Akshay", "SDET2");
		employeeMap.put("John", "SDET3");
		employeeMap.put("Surbhi", "SDET Manager");
		employeeMap.put("Naveen", "VP");
		employeeMap.put("Naveen", "CTO");
		employeeMap.put("Akriti", null);
		employeeMap.put(null, "CTO");
		employeeMap.put(null, null);

		System.out.println(employeeMap.get("Surbhi"));
		System.out.println(employeeMap.get("Naveen"));
		System.out.println(employeeMap.get("Akriti"));
		System.out.println(employeeMap.get(null));

		System.out.println(employeeMap);

		HashMap<String, Integer> browserMap = new HashMap<String, Integer>();

		browserMap.put("chrome", 100);
		browserMap.put("firefox", 98);
		browserMap.put("safari", 87);
		browserMap.put("edge", 139);
		browserMap.put("brave", 29);

		System.out.println(browserMap);

		System.out.println(browserMap.get("firefox"));

	}

}
