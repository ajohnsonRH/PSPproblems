	import java.util.Scanner;
	
	public class Main {
	
		public static void Tyler()
		{
			Scanner in = new Scanner(System.in);
			int max = in.nextInt();
			for(int i = 0; i < max; i++)
			{
				int i1 = in.nextInt();
				int i2 = in.nextInt();
				int i3 = in.nextInt();
				if(i1 < i2 == i2 < i3)
				{
					System.out.println("Ordered");
				}
				else
				{
					System.out.println("Unordered");
				}
			}
			
		}	
		
		
		/**
		 * Contains the functionality for determining whether Gnomes are ordered according to beard size.
		 * Max number of Gnome sequences =30
		 * @param args
		 */
		public static void main(String[] args) {
			
			Scanner in = new Scanner(System.in);
			int num = in.nextInt();
			
			for(int i=0;i<num;i++)
			{
				int num1 = in.nextInt(), num2= in.nextInt(), num3 = in.nextInt();
				if(num1 > num2 == num2 > num3)
				{	
					System.out.println("Ordered");
				}
				else
				{
					System.out.println("Unordered");
				}
			}
			
		}
		/**
		 * Determines whether the int array is ordered
		 * @param myIntArray
		 * @return
		 */
		private static String IsOrdered(int[] myIntArray) 
		{
			if(isSortedForwards(myIntArray)==true||isSortedBackwards(myIntArray)==true)
			{
				return "Ordered";
			}
			else
				return "Unordered";
			
		}
		/**
		 * Returns true if the array is sorted forwards
		 * @param array1
		 * @return
		 */
		private static boolean isSortedForwards(int[] array1)
		{
			for(int i =0; i<array1.length-1;i++)
			{
				if(array1[i]>array1[i+1])
				{
					return false;
				}
			}
			return true;
		}
		/**
		 * Returns true if the array is sorted backwards
		 * @param array1
		 * @return
		 */
		private static boolean isSortedBackwards(int[] array1)
		{
			for(int i =0; i<array1.length-1;i++)
			{
				if(array1[i]<array1[i+1])
				{
					return false;
				}
			}
			return true;
		}
	}
