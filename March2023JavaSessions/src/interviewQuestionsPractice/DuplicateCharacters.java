package interviewQuestionsPractice;

import java.util.HashSet;

public class DuplicateCharacters {

	public static void findDuplicate(String string) {

		char str[] = string.toCharArray();
		int length = str.length;

		HashSet<Character> h = new HashSet<>();

		for (int i = 0; i < length; i++) {

			// char c = str[i];

			if (h.contains(str[i])) {
				System.out.println(str[i]);
			}

			else {
				h.add(str[i]);
			}

		}

	}

	public static void main(String[] args) {
		findDuplicate("rajeshree");

	}

}
