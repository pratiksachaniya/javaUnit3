/*Write a program that accepts 5 even numbers from command line , if any of the
numbers is odd then throw custom exception OddException and count such
invalid numbers.*/

class EvenEx
{
	public static void main(String[] args)
	{
		int[] ar = new int[5];
		boolean err = false;
		int no =0;
		try
		{
			for(int i =0; i<5; i++)
			{
				ar[i] = Integer.parseInt(args[i]);
				if(ar[i]%2!=0)
				no++;
			}
			if(no > 0)
			{
				throw new Exception("OddException");
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("Number Of Odd: " + no);
			err = true;
		}
			
		if(!err)
		{
			System.out.println("All Number Are Even :)");
		}
	}	
}