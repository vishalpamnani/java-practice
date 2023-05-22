
public class StringReverse {

	// WAF
	// reverseString()
	// input param: String str
	// return: reverse of str

	public static String reverseString(String name) {

		// String name = "Selenium";//muineleS

		// null check
		if (name == null) {
			System.out.println("null string is not allowed, please pass a correct string.");
			return null;
		}

		int len = name.length();

		// length check
		if (len == 1) {
			return name;
		}

		String rev = "";
		for (int i = len - 1; i >= 0; i--) {

			rev = rev + name.charAt(i);// m
		}
		
		if(rev.equals(name)) {
			System.out.println(name + " is a plaindrome");
		}

		return rev;
	}

	public static void main(String[] args) {

		String r1 = reverseString("Trion");
		System.out.println(r1);
		
		r1 = reverseString("Giro");
		System.out.println(r1);
		
		r1 = reverseString("A");
		System.out.println(r1);
		
		r1 = reverseString(null);
		System.out.println(r1);
		
		r1 = reverseString("lol");
		System.out.println(r1);

	}

}
