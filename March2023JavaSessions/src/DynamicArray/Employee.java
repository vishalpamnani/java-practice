package DynamicArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Employee {

	
	
	public static void main(String[] args) {
		
		List<String> namesList = new ArrayList<String>();
		
		namesList.add("Jenny");
		namesList.add("Nate");
		namesList.add("Dane");
		namesList.add("Chloe");
		
		System.out.println(namesList);
		System.out.println(namesList.size());
		
		for(String e : namesList) {
			System.out.println(e);
			if(e.equals("Nate")) {
				System.out.println("He is the team lead.");
				break;
			}
			
		}
		
		List<String> browserList = Arrays.asList("chrome", "firefox", "safari", "edge");
		System.out.println(browserList.size());
		System.out.println(browserList);
		
		List<Integer> numList = Arrays.asList(100, 200, 300, 400, 500);
		System.out.println(numList.size());
		System.out.println(numList);
		
		
		//static array to dynamic array
		
		String country[] = {"India", "USA", "Brazil", "Spain", "Nepal"};
		List<String> countryList = Arrays.asList(country);
		
		System.out.println(countryList);

		countryList.add("Netherlands");
		System.out.println(country);
		System.out.println(countryList);

	}

}
