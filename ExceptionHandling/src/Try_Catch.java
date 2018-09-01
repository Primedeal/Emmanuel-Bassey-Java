
		public class Try_Catch 
		{
		public static void main(String[] args) 
		{ 
		int i = 10;
		try 
		{
		i = i/Integer.parseInt(args[0]);
		}
		catch(ArithmeticException e) 
		{
			//e.printStackTrace();
			System.out.println(e.toString());
			System.out.println(e.getMessage());
		}
		System.out.println("the value of i is" + i);
	}

}
