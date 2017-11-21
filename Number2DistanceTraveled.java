import java.util.Scanner;

public class Number2DistanceTraveled
{
	public static void main(String[]args)
	{
		int speed = 0;
		int hours = 0;
		int counter = 0;
		int distanceTraveled = 0;
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter a speed in miles-per-hour:");
		speed = userInput.nextInt();
		System.out.print("Enter the number of hours traveled:");
		hours = userInput.nextInt();
		System.out.println("\nHour\tDistance Traveled");
		System.out.println("-------------------------");
		
		for(int i = 1; i <= hours; i++)
		{
			counter = i;
			distanceTraveled = i * speed;
			System.out.print(counter);
			System.out.println("\t\t" +distanceTraveled);
		}
		userInput.close();
	}
}
