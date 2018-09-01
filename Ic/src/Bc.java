
public class Bc extends Ac
{
Bc()
{
super(10);
System.out.println("The value of subclass in B");
}

public static void main(String[]args) 
{
System.out.println("Apps start");	
new Bc();
System.out.println("Apps end");
}
}
