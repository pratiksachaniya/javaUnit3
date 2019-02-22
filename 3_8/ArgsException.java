/*Write a program which takes the age of 5 persons from command line and find
the average age of all persons. The program should handle exception if the
argument is not correctly formatted and custom exception if the age is not
between 1 to 100.*/
class ArgsException
{
	public static void main(String[] ar)
	{
		int[] p = new int[5];
		int tmp;
		boolean err = false;
		for(int i =0; i < 5; i++)
		{
			try
			{
				tmp = Integer.parseInt(ar[i]);
				if(tmp > -1 && tmp<101)
				{
					p[i] = tmp;
				}
				else
				{
					throw new Exception("Age not between 1 to 100");
				}
			}
			catch(Exception e)
			{
				System.out.println(e);
				err = true;
			}
		}
		
		if(!err)
		{
			System.out.println("Average Is:" + (p[0]+p[1]+p[2]+p[3]+p[4])/5f);
		}
	}
}

