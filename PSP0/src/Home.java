import java.util.Scanner;


public class Main {
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		while(in.hasNext())
		{
			String line = in.nextLine();
			if(line.length()>0){
			if(line.charAt(0)=='#')
			{
				break;
			}
			int yeses =0, nos=0;
			// Y N A P\
			int votes = line.length();
			int absences=0;
			for(int i=0; i<votes;i++)
			{
				if(line.charAt(i)=='Y'||line.charAt(i)=='y')
				{
					yeses++;
				} 
				else if(line.charAt(i)=='N'||line.charAt(i)=='n')
				{
					nos++;
				}
				else if(line.charAt(i)=='A'||line.charAt(i)=='a')
				{
					absences++;
				}
			}
				if(absences>=votes/2.0)
				{
					System.out.println("need quorum");
				}
				else if(yeses>nos)
				{
					System.out.println("yes");
				}
				else if(nos==yeses)
				{
					System.out.println("tie");
				}
				else if(yeses<nos)
				{
					System.out.println("no");
				}
			}
			}
		}
		
		
}
