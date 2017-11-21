import java.util.stream.*;
import java.util.*;

public class Number10LargestandSmallest 
{
	public static void main(String [] args)
	{
		Scanner userInput = new Scanner(System.in);
		double input;
		System.out.print("Enter a series of numbers, -99 quits:");
		input = userInput.nextDouble();
		double highest = input;
		double lowest = input;
		while(input != -99)
		{
			if(input > highest)
				highest = input;
			if(input < lowest)
				lowest = input;
			input = userInput.nextDouble();
		}
		System.out.println("The hiest number is "+highest);
		System.out.println("The lowest number is "+lowest);
		getArray();
	}
	public static void getArray()
	{
		int [] a = new int [] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		// filter out all indices that evenly divide 3
		int [] sliceArr = IntStream.range(0, a.length).filter(i -> i % 1 == 0)
		    .map(i -> a[i]).toArray();

		System.out.println(Arrays.toString(sliceArr));
	}
}
