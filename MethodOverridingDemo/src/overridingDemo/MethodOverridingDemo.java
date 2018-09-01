package overridingDemo;

class A {
	
 void show() {
	
	System.out.println("take it in A");
		
	}
}
class B extends A {
	
 void show() {
	super.show(); 
	System.out.println("take it in B");
 		}	
}

public class MethodOverridingDemo {

	public static void main(String[] args) {
		
		B B1 = new B();
		
		B1.show();

}
}