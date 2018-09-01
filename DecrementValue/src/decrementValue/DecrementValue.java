package decrementValue;

public class DecrementValue {

	public static void main(String[] args) {
		/*
		 * In java decrement value can occur in two different ways:
		 * 1) pre-decrement (i.e the coding happened earlier) is represented as y = --x
		 */
		int x = 10;
		
		System.out.println(--x);

		/*
		 *  2) post-increment (i.e the coding happened after) is represented as y = x++
		 */
		
		int y = 20;
		
		System.out.println(y--);
		
		
		/*
		 * final  int x = 10;
		 * x++;
		 * 
		 * We cannot assign a value to final variable
		 * because it will give us a compiler exception message
		 */
		
	}
}
