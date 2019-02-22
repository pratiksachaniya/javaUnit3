/*Write a program that takes a string from the user and validate it. The string
should be at least 5 characters and should contain at least one digit. Display an
appropriate valid message.*/
import java.util.Scanner;

class StringChecker
{
	public static void main(String[] ar)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int c,d;
		c = d = 0;
		
		for(int i = 0; i < str.length(); i++)
		{
			if(Character.isLetter(str.charAt(i)))
			c++;
			else if(Character.isDigit(str.charAt(i)))
			d++;
		}
		
		if(c>=5 && d>=2)			
		System.out.println("Valid String");
		else
		System.out.println("Not Valid String");
		
	}	
}