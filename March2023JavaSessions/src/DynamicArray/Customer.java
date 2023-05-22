package DynamicArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Customer {

	public static void main(String[] args) {
		
List<String> namesList = new ArrayList<String>();
		
		namesList.add("Jenny");
		namesList.add("Nate");
		namesList.add("Dane");
		namesList.add("Chloe");
	
		
//		for(int i=namesList.size()-1; i>=0; i--) {
//			System.out.println(namesList.get(i));
//		}
		
		System.out.println(namesList);
		//Collections.reverse(namesList);
		//Collections.sort(namesList);
		//Collections.swap(namesList, 2, 3);
		
		
		
		//namesList.add("Gina");
		//namesList.add(0, "Kate");
		namesList.add(7, "Amy");//IOB
		

		System.out.println(namesList);
		        
		
		
		
		

	}

}
