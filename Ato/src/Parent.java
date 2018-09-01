class Parent 
{
	Parent()
	{
	System.out.println("From Parent class");
	}
}
	class Child extends Parent
	{
		Child()
	{
	super();
	}
		}
	
	class MainDemo
	{
	public static void main(String[] args) 
	{
		Child c1 = new Child();

	}
	}
	
