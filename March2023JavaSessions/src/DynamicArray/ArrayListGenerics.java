package DynamicArray;

import java.util.ArrayList;

public class ArrayListGenerics {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> numList = new ArrayList<Integer>();
		
		numList.add(100);
		numList.add(200);
		numList.add(300);
		numList.add(400);
		
		System.out.println(numList.size());
		
		//for each loop:
		for(Integer e : numList) {
			System.out.println(e);
		}
		
		ArrayList<String> empNameList = new ArrayList<String>();
		empNameList.add("KD");
		empNameList.add("Aadil");
		empNameList.add("Vishal");
		
		for(String s : empNameList) {
			System.out.println(s);
		}
		
		System.out.println(empNameList);
		
		
		
		//
		ArrayList<Object> empDataList = new ArrayList<Object>();
		empDataList.add("Vishal");
		empDataList.add(33);
		empDataList.add(true);
		empDataList.add(90.09);
		empDataList.add('m');
		
		for(Object o : empDataList) {
			System.out.println(o);
			if(o.equals(33)) {
				System.out.println("Experienced");
			}
			
		}
		
		System.out.println(empDataList);
		
		
		
		
	}

}
