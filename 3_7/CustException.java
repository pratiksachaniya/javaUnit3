/*Write an application that accepts marks of three different subject from user.
Marks should be between 0 to 100, if marks of any of the subject is not belong
to this range, generate custom exception out of RangeException. If marks of
each subjects are greater than or equal to 40 then display message “PASS” along
with percentage, otherwise display message “FAIL”. Also write exception
handling code to catch all the possible runtime exceptions likely to be generated
in the program.*/
//Pratik Sachaniya
import java.util.Scanner;
class CustException
{
	public static void main(String[] ar)
	{
		int m;
		Scanner sc = new Scanner(System.in);
		int i = 3;
		while(i > 0)
		{
			try
			{
				m = sc.nextInt();
				if(m > -1 && m<101)
				{
					if(m >= 40)
					{
						System.out.println("PASS");
					}
					else
					{
						System.out.println("FAIL");
					}
				}
				else
				{
					throw new Exception("Out Of Range::RangeException");
				}				
			}
			catch(Exception e)
			{
				System.out.println(e);
				i++;
			}
			
			i--;
		}
		
		
	}
}
