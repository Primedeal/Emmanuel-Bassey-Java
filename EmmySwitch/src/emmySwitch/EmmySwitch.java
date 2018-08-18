package emmySwitch;

import java.util.Scanner;

public class EmmySwitch { //start
	
	public static void main(String[] args) {
	Scanner x = new Scanner (System.in);
	int kids = x.nextInt();
	
	switch(kids) { // start switch
	case 0:
		System.out.println("you need a wife");
		break;
		
	case 1:
		System.out.println("you only have a male child, what about having a female child as well");
		break;
	case 2:
		System.out.println("now you can stop having babies");
		break;
	case 3:
		System.out.println("start family planning");
		 break;
		 
		 default:
			 System.out.println("there's inflation in town, please be careful");
	}
	
	
	}
}
