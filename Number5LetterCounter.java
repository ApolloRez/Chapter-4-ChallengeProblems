import java.util.Scanner;

public class Number5LetterCounter
{
	public static void main (String [ ] args)
	{
		Scanner userInput = new Scanner(System.in);
		String userString;
		String str;
		char userChar;
		
		System.out.println("Enter a string.");
		userString = userInput.nextLine();
		System.out.println("Enter a charater in the string to count.");
		str = userInput.nextLine();
		userChar = str.charAt(0);
		int counter = 0;
		for (int i = 0; i < userString.length(); i++)
		{
			if(userString.charAt(i) == userChar)
			{
				counter = counter + 1;
			}			
		}
		System.out.println(counter);
		userInput.close();
	}
}