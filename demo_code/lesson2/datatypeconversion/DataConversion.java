package lesson2.datatypeconversion;

public class DataConversion {

	public static void main(String[] args) {
		//int -> long, int -> double automatic, no loss of info
		//Implicit Conversion
		int x = 123456789;
		long y = x;
		double w = x;
		System.out.printf("%d, %d, %f\n", x, y, w);
		
		
		//int -> float, long -> float, long -> double: automatic but may lose info
		// Explicit Conversion
		float b = 56.7785f;
		int a = (int)b; // Need Casting 
		
		double c = 444.56734;
		long  d=(long)c;
		System.out.printf("%f, %d\n", c,d);
		
		//char -> int - automatic
		char s = 'a';
		int t = s;
		System.out.printf("%c, %d", s, t);

	}

}
