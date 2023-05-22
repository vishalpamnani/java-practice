package interviewQuestionsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
	
	
	public static List<Object> removeDuplicateFromArrayList(ArrayList<Integer> list) {
		
		
		List<Object> nonDuplicateList = new ArrayList<>();
		
		for(Object o : list) {
			if(!nonDuplicateList.contains(o)) {
				nonDuplicateList.add(o);
			}
			
		}
		
		return nonDuplicateList;
		
		
		
	}
	

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5));
		
		List<Object> newList = removeDuplicateFromArrayList(list);
		
		System.out.println(newList);

	}

}
