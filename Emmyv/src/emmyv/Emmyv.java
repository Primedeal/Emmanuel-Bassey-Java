/*
 * (User Input in Java)
 * This is how to enter or input a user information into a calculator
 */

package emmyv;

import java.util.Scanner;

public class Emmyv { // start of our program

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int valueone;
		int valuetwo;
		int sum;
		System.out.println("Welcome! please enter your fisrt amount");
		
		valueone = scan.nextInt();
		
		System.out.println("Thanks! now enter the second amount");
		
		valuetwo = scan.nextInt();
		sum = valueone+valuetwo;
		
		System.out.println("The new available balance is " + sum);
		
	}

}// End of our program
