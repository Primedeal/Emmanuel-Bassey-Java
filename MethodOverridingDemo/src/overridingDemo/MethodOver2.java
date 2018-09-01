package overridingDemo;

class CheckingAccount
{
	public void show () {
	
 System.out.println("Money is in checking account");

	}
}


class Savings extends CheckingAccount
{
	public void show() 
	
{

		//super.show();
	
		System.out.println("Money is in savings account");

	}
}

public class MethodOver2 {

	public static void main(String[] args) {
		
Savings S1 = new Savings();

S1.show();
	}

}
