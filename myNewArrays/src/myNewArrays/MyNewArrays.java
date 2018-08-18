package myNewArrays;

public class MyNewArrays {

	public static void main(String[] args) {
		//arrays declaration
		int studentMarks [];
		//arrays initialization
		
		studentMarks = new int[5];
		
		//arrays of 5 int cells storing 
		//value into an array cell 
		studentMarks[0] = 80;
		studentMarks[1] = 81;
		studentMarks[2] = 82;
		studentMarks[3] = 83;
		studentMarks[4] = 84;
		
		int [] x = new int[6];
		System.out.println(studentMarks[0]);
		System.out.println(studentMarks[1]);
		System.out.println(studentMarks[2]);
		System.out.println(studentMarks[3]);
		System.out.println(studentMarks[4]);
		System.out.println(x);
		// reading value from an array cell
		
		System.out.println(studentMarks[4]);
		int tempVariable = studentMarks[4];
		
		//2nd way of creating an array
		
		int x1 = 10;
		int studentMarks1[] = {x1,20,30,40,50};
		
		//3rd way of creating an array
		
		int studentMarks2[] = new int[] {x1,20,30,40,50};
		
		// print the length of an array
		
		System.out.println(studentMarks.length);
		

	}

}