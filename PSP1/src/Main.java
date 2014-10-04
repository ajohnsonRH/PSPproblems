import java.util.Scanner;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			String player1 = in.nextLine();
			String player2 = in.nextLine();
			if(player1.charAt(0)=='E')
			{
				break;//end
			}
			else
			{
				compareWins(player1,player2);
			}
		}
		
	}
	/**
	 * Compares the two strings and totals the respective scores
	 * @param player1
	 * @param player2
	 * @return 
	 */
	public static void compareWins(String player1, String player2)
	{
		int p1C=0;
		int p2C=0;
		for(int i =0; i< player1.length();i++)
		{
			if(player1.charAt(i)=='R')
			{
				if(player2.charAt(i)=='P')
				{
					p2C++;
				}else if(player2.charAt(i)=='S')
				{
					p1C++;
				}
			}
			else if(player1.charAt(i)=='S')
			{
				if(player2.charAt(i)=='P')
				{
					p1C++;
				}else if(player2.charAt(i)=='R')
				{
					p2C++;
				}
			}
			else if(player1.charAt(i)=='P')
			{
				if(player2.charAt(i)=='R')
				{
					p1C++;
				}else if(player2.charAt(i)=='S')
				{
					p2C++;
				}
			}
		}
		System.out.println("P1: "+p1C);
		System.out.println("P2: "+p2C);
		
	}
}
