package interviewQuestionsPractice;

public class VowelCount {

	public static int vowelCountInAString(String str) {

		// char c[] = str.toCharArray();
		str = str.toUpperCase();	
		int vowelCount = 0;
		// int length = c.length;

		for (int i = 0; i < str.length(); i++) {
			
			
			if (str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
				vowelCount++;
			}

		}
		return vowelCount;
	}

	public static void main(String[] args) {
		
		
		int count = vowelCountInAString("publicissapient");
		
		System.out.println(count);
	}

}
