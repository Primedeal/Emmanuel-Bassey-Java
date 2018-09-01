package runtimePolyDemo;

public class PolyDemo {

	public static void main(String[] args) {
	
		PolyA obj1 = new PolyA();
		PolyB obj2 = new PolyB();
		
		System.out.println(obj1.i);
		obj2.m1();
		System.out.println(obj2.i);
	}

}
