import java.util.Scanner;
public class Rectangle
{
	static double l;
	static double w;
	static double perimeter;
	
	public static void main (String[]args)
	{
		Scanner kb = new Scanner (System.in);
		System.out.println("What is the length in feet?");
		l = kb.nextDouble();
		System.out.println("What is the width in feet?");
		w = kb.nextDouble();
		calcPerim();
		print();
		
	}
	public static void calcPerim()
	{
		perimeter = 2*l+2*w;
	}
	public static void print ()
	{
		System.out.printf("Your rectangle is %.5f ft around.", perimeter);
	}
	
}