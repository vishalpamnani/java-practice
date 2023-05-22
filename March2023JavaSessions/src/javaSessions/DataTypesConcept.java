package javaSessions;

public class DataTypesConcept {

	public static void main(String[] args) {
		
		System.out.println("hello world");
		
		//data types in Java:
		
		//two types:
		//1. primitive:
			//Integer : byte, short, int, long
			//character : char
			//Floating-point : float, double
			//Boolean : boolean(true/false)
		
		//2. non primitive: need object : String, Array, Interface
		
		
		
		
		//1. byte:
		//1 byte = 8 bits
		//range: -128 to 127
		byte b = 10;
		b = 30;
		byte b1 = 20;
		byte b2 = 40;//
		
		System.out.println(b);
		System.out.println(b1);
		
		System.out.println(b1+b2);
		
		//2. short:
		//size: 2 bytes = 2x8 = 16 bits
		//range: -32768 to 32767
		short sh = 500;
		short sh1 = -300;
		
		System.out.println(sh+sh1);
		
		//3. int:
		//size: 4 bytes = 4x8 = 32 bits
		//range: -214783648 to 214783647
		int i = 1000000;
		int j = 1;
		int k = 3000;
		byte l = 20;
		System.out.println(k+l);
		
		//4. long:
		//size: 8 bytes = 8x8 = 64 bits
		//range:
		long num = 987909875;
		
		//5. float:
		//size: 4 bytes = 4x8 = 32 bits
		//range: upto 7 digits after decimal
		float floatNumber = 13.24f;
		System.out.println(floatNumber);
		float floatNumber2 = (float)32.89;
		System.out.println(floatNumber2);
		
		//6. double: 
		//size: 8 bytes = 8x8 = 64 bits
		//range: upto 16 digits after decimal
		double doubleNumber = 17.90876523;
		System.out.println(doubleNumber);
		double doubleNumber2 = 89.7891287;
		System.out.println(doubleNumber+doubleNumber2);
		
		//7. char:
		//size: 2 bytes = 16 bits
		//range:
		char c1 = 'a';//a-z
		char c11 = 'b';
		char c2 = '3';//0-9
		char c3 = 'A';//A-Z
		char c4 = '$';
		
		char gender = 'f';
		char status = 'Y';
		
		System.out.println(c1);
		System.out.println(c1+c11);
		//ASCII value -- table
		//a-z : 97 to 122
		//A-Z : 65 to 90
		//0-9 : 48 to 57
		char r1 = '0';
		char r2 = '9';
		System.out.println(r1+r2);
		
		
		char u1 = 'a';
		char u2 = 'b';
		
		System.out.println(u1+""+u2);//ab
		System.out.println((int)u1);
		System.out.println(u1+0);
		System.out.println(u1+'0');
		  
		//8. boolean:
		//size: ~ 1 bit
		boolean bool = true;
		boolean bool1 = false;
		
		
		
		
		

	}

}
