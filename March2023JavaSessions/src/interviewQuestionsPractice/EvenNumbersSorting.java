package interviewQuestionsPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EvenNumbersSorting {

	public static List<Integer> sortEvenNumbers(ArrayList<Integer> numList) {
		
		List<Integer> sortedEven = new ArrayList<Integer>();
		
		
		for(int i=0; i<numList.size(); i++) {
			if(numList.get(i)%2==0) {
				sortedEven.add(numList.get(i));
				Collections.sort(sortedEven);
			}
		}
		return sortedEven;
	}
	
	
	public static void main(String[] args) {
		
		ArrayList<Integer> inputNumList = new ArrayList<Integer>();
		inputNumList.add(20);
		inputNumList.add(43);
		inputNumList.add(56);
		inputNumList.add(12);
		inputNumList.add(34);
		inputNumList.add(21);
		inputNumList.add(90);
		inputNumList.add(93);
		inputNumList.add(29);
		
		System.out.println("Unsorted Number List: "+inputNumList);
		
		System.out.println("Sorted Even Numbers List: "+sortEvenNumbers(inputNumList));
		
		

	}

}
