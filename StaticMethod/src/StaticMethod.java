
public class StaticMethod 
{
	static int i;
static String name = "Emmanuel";
static void update() 
{
name = "Emmanuel_Bassey";
System.out.println(i);
}
void display() 
{
System.out.println(name);
}		
	public static void main(String[] args)
	{
		update();
		StaticMethod sm = new StaticMethod();
		sm.display();
	}

}
