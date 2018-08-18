
public class StaticVariable 
{
static int count = 0;
//whenever the static keyword is removed from the int, the compiler will only print 0 throughout for all the new Static Variable
StaticVariable()
{
count++;
System.out.println(count);
//count++;
}
	public static void main(String[] args) {
		new StaticVariable();
		new StaticVariable();
		new StaticVariable();
		new StaticVariable();
		new StaticVariable();
		new StaticVariable();
		new StaticVariable();
	}

}
