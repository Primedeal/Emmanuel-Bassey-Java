package truncationAndTypeCast;

public class TruncationAndTypeCast {

	public static void main(String[] args) {
		/*
		 * Truncation is the cutting off of decimal number from a value. 
		 * Example is when we cut off 2.9 to become 2
		 * While, TypeCast is used when we are converting from one variable type to another. 
		 * Example is when converting from double to integer.
		 */

		int a, b , c;
		// integer a, b, c ==> whole number (-1, 0, 1, 2,....)
		
		double d, e;
		// double d, e ==> decimal number (-1, 0, 1, 2.3, 3.9, ...)
		
		a = 10;
		b = -15;
		d = 2.8;
	System.out.println("a is:"  + a);
	
	System.out.println("b is:"  + b);
	
	// I did TypeCast the value by introducing (int) before d; 

	c = a + (int)d; // I Truncated 2.8 which is double to become 2.
	
	e = a +d;
	
	System.out.println(c);
	
	System.out.println(e);
	}

}
