
public final class Atf
{
	void method()
	{
	
		System.out.println("value of Atf");
	}
	
	public class Btf extends Atf
	{
			void method()
			{
		System.out.println("value of Btf");
			}
	}
	
	public static void main(String[]args) 
	{
 Atf a1 = new Atf();	
 a1.method();
	}
}
