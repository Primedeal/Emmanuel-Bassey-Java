package thisDemo;
class ABC 
{
int id;
//int st;
ABC (int id)
{
this.id = id;
//this.st = st;
}

void display() 
{
System.out.println(id);	
//System.out.println(st);
}
}

public class ThisDemo {

	public static void main(String[] args) {
	
ABC abc1 = new ABC(10);
abc1.display();

	//ABC abc2 = new ABC(5);
	//abc2.display();
}
}
