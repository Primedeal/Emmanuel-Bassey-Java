package arithmeticOperator;

public class ArithmeticOperator {

	public static void main(String[] args) {
	/*
	 * 
	 * byte + byte = int
	 * byte + short = int
	 * short + short = int
	 * byte + long = long
	 * long + double = double
	 * float + long = float
	 * char + char = int
	 * char + double = double
	 */
		
		System.out.println('a' + 'b');
// Run and get 195 since 'a' = 97 and 'b' = 98
		
		System.out.println('a' + 0.89);
		
		// Run it and get 97.89
		
		int x = 10;
		long l = x;
		System.out.println(l);
		
		int i = 10;
		byte b = (byte)i;
		System.out.println(x);
	}

}
