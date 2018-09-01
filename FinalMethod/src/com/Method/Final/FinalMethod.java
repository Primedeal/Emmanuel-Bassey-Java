// Final Method
package com.Method.Final;

final class FinalMethod 
{
void m1()
{
System.out.println("value of final method in A");	
}


public void main(String[] args) 
{
	FinalMethod fm = new FinalMethod();
}
}
// Final Method cannot be overriden

 /*
  * class Demo extends FinalMethod
  * {
Demo()
{
System.out.println("Demo class in B");	
}	
}

	public static void main(String[] args) 
	{
		FinalMethod fm = new FinalMethod();
		fm.m1();
	}

}
  */
