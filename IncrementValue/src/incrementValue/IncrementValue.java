package incrementValue;

public class IncrementValue {

	public static void main(String[] args) {
		
		/* 
		 * In java increment value can occur in two different ways:
		 * 1) pre-increment (i.e the coding happened earlier) is represented as y = ++x
		 */

			int x = 10;
			
			System.out.println(++x);
	
			/*
			 *  2) post-increment (i.e the coding happened after) is represented as y = x++
			 */
			
			int y = 20;
			
			System.out.println(y++);
			
			int e = 12;
			e++;
			
			// When we run this code, the value will be 12+1 = 13
			
			System.out.println(e);
			
			
			char ch = 'a';
			ch++;
			
			//For char, when we run ch = 'a', we will get a new value b since a is 
			//advancing forward by a step.
			
			System.out.println(ch++);
			
			byte b = 30;
			
			b++;
			
			System.out.println(b);
			
			double d = 10.5;
			d++;
			//For double, when we run d = 10.5, we will get a new value of 10.5 + 1 = 11.5
			System.out.println(d++);
			
			//byte a = 10;
			//byte c = 20;
			//byte f =(a+c);
			
			// for this code we will get a compiler error which says that it cannot convert from int to byte.
			//System.out.println(f);
    // but if we can re-write it thus:
			byte i = 10;
			byte h = 20;
			byte z = (byte)(i+h);
			
			System.out.println(z);
			
			b = (byte)(b+1);
			
	// In conclusion, we can apply an increment type to every primitive type except boolean.
	}
	   
}
