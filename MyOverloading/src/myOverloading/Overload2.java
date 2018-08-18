package myOverloading;

public class Overload2 {
 
	void sum_m1(int i) {
		System.out.println(i);
	}
	void sum_m1(int i, int j) {
		System.out.println(i + j);
	}
		
	void sum_m1(int i, int j, int k) {
		System.out.println(i+j+k);
	}
			
	public static void main(String[] args) {
		
Overload2 Overload2object = new Overload2();
Overload2object.sum_m1(10, 20);

	}

}
