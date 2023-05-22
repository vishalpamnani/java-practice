
public class StringManipulation {

	public static void main(String[] args) {

		String str = "Hi, this is my java code and I am so happy";

		System.out.println(str.length());
		int len = str.length();
		int li = 0;
		int hi = len - 1;
		System.out.println(hi);

		System.out.println(str.charAt(0));
		// System.out.println(str.charAt(42));//String index out of range
		// System.out.println(str.charAt(-1));//String index out of range
		System.out.println(str.charAt(3));

		System.out.println(str.indexOf("code"));

		String m1 = "Welcome Admin";
		if (m1.indexOf("Admin") == 8) {
			System.out.println("Admin is present");
		} else {
			System.out.println("Fail");
		}
		
		System.out.println(str.indexOf('i'));//1st occurrence of i
		System.out.println(str.indexOf('i', str.indexOf('i')+1));//2nd occurrence of i
		

	}

}
