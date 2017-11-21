import java.util.Scanner;
public class Number1SumofNumbers 
{
	public static void main(String [] args)
	{
		int s = 0;
		int sum = 0;
		int number;
		Scanner user = new Scanner(System.in);
		System.out.print("Enter a positive nonzero integer value: ");
		number = user.nextInt();
		
		for (int i = 0; i < number; i++)
		{
			sum = 1 + i;
			s += sum;
		}
		System.out.println(s);
		user.close();
	}
}
