/*
 * Making of our first calculator input in java
 * This is how we can input or 
 * store values into our calculator in java (product of a number).
 */
package emmyUserInput;

import java.util.Scanner;
public class EmmyUserInput { // start
	public static void main(String[] args) {
		
		Scanner x = new Scanner(System.in);
		int valueone;
		int valuetwo;
		int valuethree;
		int product;
		
		System.out.println("welcome! please enter the first value ");
		
		valueone = x.nextInt();
		
		System.out.println(" thanks! please enter the next value ");
		
		valuetwo = x.nextInt();
		
		System.out.println("alright, please enter the last value ");
		
		valuethree = x.nextInt();
		product = valueone * valuetwo * valuethree;
		
		System.out.println("The available total value will be ");
		System.out.println(product);
		
	}
}//End
