import java.util.Scanner;

public class Number12BarChart 
{
	public static void main (String [] args)
	{
		final int NUMSTORES = 5;
		double sales;
		String output = " ";
		Scanner sc = new Scanner(System.in);
		for(int stores = 1; stores <= NUMSTORES; stores++)
		{
			System.out.print("Enter today's sales for store "+stores +":");
			sales = sc.nextDouble();
			sales = sales / 100;
			output += "\nStore " +stores +":";
			for(int asterisk = 1; asterisk <= sales; asterisk++)
			{
				output += "*";
			}
		}
		System.out.print("SALES BAR CHART");
		System.out.println(output);
		sc.close();
	}
}
