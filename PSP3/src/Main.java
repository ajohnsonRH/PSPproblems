import java.util.Scanner;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext())
		{
			String newIntString = "";
			int line = scanner.nextInt();
			if(line==0)
			{
				break;
			}
			else 
			{
				int number = 0;
				int hold = scanner.nextInt();

				newIntString+=hold+ " ";
				for(int i =0; i<line-1;i++)
				{
					number= scanner.nextInt();
					if(hold != number)
					{
						newIntString+=number+" ";
						hold = number;
					}
				}
				
				System.out.println(newIntString+" $");
			}
		}
	}


}
