
public class SwichRating 
{
	public static void main(String[] args) 
	{	
				char penaltyKick = 'X';

				switch (penaltyKick) 
		    {
					case 'G': System.out.println("Messi shoots to the left and scores!");
										break; 
					case 'L': System.out.println("Messi shoots to the right and misses the goal!");
										break;
					case 'T': System.out.println("Messi shoots down the center, but the keeper blocks it!");
										break;
					default:
						System.out.println("Messi is in position...");

				}

			}
}
