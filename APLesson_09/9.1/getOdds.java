import java.util.Scanner;

public class getOdds
{
	
	static int [] numbers = new int [10];
	public static void main (String[]args)
	{
		fillArray();
		System.out.println("For the following numbers... ");
		printArray();
		System.out.println();
		System.out.println("The numbers " + Odds() + " are odd numbers.");
	}
	public static void fillArray()
	{
		for (int i = 0; i<numbers.length;i++)
		{
			numbers [i] = (int)(Math.random()*100)+1;
		}
	}
	public static void printArray()
	{
		for (int num: numbers)
		{
			System.out.print(num + " ");
		}
		System.out.println();
		
	}
	public static String Odds()
	{
		String odds = "";
		for ( int num : numbers)
		{
			if (num%2!=0)
			{
				odds += num + " ";
			}
		}
		return odds;
	}
}