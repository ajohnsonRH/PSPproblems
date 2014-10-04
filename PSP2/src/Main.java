import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(in.hasNext())
		{
			String line = in.nextLine();
			boolean valid=true;
			if(line.charAt(0)=='#')
			{
				break;
			}
			else
			{
				String mirroredString="";
				for(int i =line.length()-1;i>=0;i--)
				{
					if(line.charAt(i)=='d')
					{
						mirroredString+='b';
					}
					else if(line.charAt(i)=='b')
					{
						mirroredString+='d';
					} 
					else if(line.charAt(i)=='x'||line.charAt(i)=='w'||line.charAt(i)=='i'||line.charAt(i)=='v'|| line.charAt(i)=='o')
					{
						mirroredString+=line.charAt(i);
					}
					else if(line.charAt(i)=='p')
					{
						mirroredString+='q';
					}
					else if(line.charAt(i)=='q')
					{
						mirroredString+='p';
					}
					else 
					{
						System.out.println("INVALID");
						valid=false;
						i=-1;
					}
				}	
				if(valid==true){
				System.out.println(mirroredString);}
			}
			
		}

	}

}
