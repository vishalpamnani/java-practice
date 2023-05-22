package DynamicArray;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		//dynamic aray:
		//ArrayList - default class
		//order based collection: it means the order/index
		
		ArrayList ar = new ArrayList();
		System.out.println(ar.size());
		
		ar.add(100);
		ar.add(200);
		ar.add(300);
		
		
		System.out.println(ar.size());
		
		ar.add(400);
		ar.add(500);
		
		System.out.println(ar.size());
		
		ar.add("testing");
		ar.add(22.3);
		ar.add(true);
		ar.add('g');
		ar.add(1000);
		
		System.out.println(ar.size());
		
		System.out.println(ar.get(0));
		//System.out.println(ar.get(10));
		
		ar.remove(8);
		System.out.println(ar.get(8)); 
		
		System.out.println(ar.size());
		System.out.println(ar.get(7));
		
		System.out.println(ar);
		
		System.out.println("*****************");
		
		ArrayList empData = new ArrayList();
		empData.add("Vishal");
		empData.add("Pune");
		empData.add(9000000);
		empData.add(true);
		
		System.out.println(empData.size());
		
		System.out.println(empData.get(1));
		
		System.out.println(empData);
		
		//for loop:
		for(int i = 0; i<empData.size(); i++) {
			System.out.println(empData.get(i));
		}
		
		//for each loop
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
