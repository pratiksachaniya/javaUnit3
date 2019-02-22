/*3_5. Write a Java program to input n integer numbers and display lowest and second
lowest number. Also handle the different exceptions possible to be thrown
during execution.*/
import java.util.Scanner;
class ExceptionDemo
{
	public static void main(String[] args)
	{
		int[] ar = new int[10];
		Scanner sc = new Scanner(System.in);
		boolean err = false;
		for(int i =0; i<5; i++)
		{
			try
			{
				ar[i] = sc.nextInt();
			}
			catch(Exception e)
			{
				System.out.println("Exception Occur Invalid Input");
				err = true;
			}
		}
		
		if(!err)
		{
			int min;
			int tmp;
			System.out.println("Two Lowest Value Is ");
			for(int i = 0; i < 2; i++)
			{
				min = ar[i];
				for(int j = i + 1; j < 5; j++)
				{
					if(min>ar[j])
					{
						min = ar[j];
						tmp = ar[i];
						ar[i] = ar[j];
						ar[j] = tmp;
					}
				}			
				System.out.print("," + min);
			}
		}
	}
	
	
}