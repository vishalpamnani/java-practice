package interviewQuestionsPractice;

import java.util.ArrayList;
import java.util.List;

public class ReverseArrayList {

	public static List<Object> reverseArrayList(ArrayList<Object> list) {

		List<Object> revList = new ArrayList<Object>();

		for (int i = list.size() - 1; i >= 0; i--) {
			revList.add(list.get(i));
		}

		return revList;

	}

	public static void main(String[] args) {

		
		ArrayList<Object> input = new ArrayList<Object>();
		input.add(12);
		input.add(15);
		input.add(67);
		input.add(34);
		input.add(99);
		input.add(100);

		System.out.println("Input array list is: " + input);

		List<Object> rev = reverseArrayList(input);

		System.out.println("Reverse array list is: " + rev);

	}

}
