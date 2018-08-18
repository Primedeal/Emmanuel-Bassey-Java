package demo;

public class Demo 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.callMe();
		
		B b1 = new B();
		b1.callMe();
		
		B b2 = new B();
		b2.methodMe();
		
		C c1 = new C();
		c1.callMe();
		
		C c2 = new C();
		c2.myLatest();
	}

}
