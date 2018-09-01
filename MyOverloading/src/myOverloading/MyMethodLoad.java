package myOverloading;

public class MyMethodLoad {
	
	static int Add(int a, int b) {
		return (a+b);
	}
	static String Add(String a, String b) {
		return (a+b);
		
	}
	static double Add(double a, double b) {
		return (a+b);
	}
	static long Add(long a, long b) {
		return (a+b);
		
	}

	static int Add(int a, short b) {
		return (a+b);
	}

	static float Add(char a, char b) {
		return (a + b);
	}

	public static void main(String[] args) {
		
	System.out.println(Add(10,25));

	System.out.println(Add("Method", " Overloadings"));
	
	System.out.println (Add(10.54, 20.96));
	
	System.out.println(Add(10l, 34l));
	
	System.out.println(Add(5,25));
	
	System.out.println(Add('a','o'));
	
	}
}
