package interviewQuestionsPractice;

import java.util.HashSet;

public class FirstRepeatedCharacter {
	
	
	public static char firstRepeating(String str) {
		
		//char arr[] = str.toCharArray();
		
		//Create an empty hashset
		HashSet<Character> h = new HashSet<>();
		
		//Traverse the input array from left to right
		for(int i=0; i<=str.length()-1; i++) {
			
			char c = str.charAt(i);
			
			//If element is present in hash set, update and return the element
			if(h.contains(c)) 
				return c;
			
			//Else keep adding the elements to the hash set
			else
				h.add(c);
			
		}
		
		return '\0';
		
		
	}
	

	public static void main(String[] args) {
		
	
		System.out.println(firstRepeating("this is not done"));
	
	}

}
