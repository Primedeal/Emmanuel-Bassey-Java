package xtend;

public class Child extends Parent
{
	int i = 20;
	void Childobject() 
	{
		System.out.println("value of i in child " + i);
		System.out.println("value of i in Parent " + super.i);
		
	}

}
