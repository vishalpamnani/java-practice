package interviewQuestionsPractice;

public class StringReverse {

	public static String reverseAString(String inputString) {
		
		
		// null check
				if (inputString == null) {
					System.out.println("null string is not allowed, please pass a correct string.");
					return null;
				}

				int len = inputString.length();

				// length check
				if (len == 1) {
					return inputString;
				}
		

		String rev = "";

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + inputString.charAt(i);
		}

		return rev;

	}

	public static void main(String[] args) {

		String reverseString = reverseAString("This is a joke!");

		System.out.println(reverseString);

	}

}
