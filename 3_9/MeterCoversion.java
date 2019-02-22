/*Write an application that converts between meters and feet. Its first commandline
argument is a number and second command line argument is either
"centimeter" or "meter". If the argument equals "centimeter" displays a string
reporting the equivalent number of meters. If this argument equals "meters",
display a string reporting the equivalent number of centimeter. If unit is not
given properly then generate custom exception Unitformatexception. If first
argument is not proper format then generate numberformatexception.
Generate other exception as per requirements. (1 meter=100 centimeter)*/

class MeterCoversion
{
	public static void main(String[] ar)
	{
		int val = 0;
		boolean type = true;
		boolean err = false;
		
		try
		{
			val = Integer.parseInt(ar[0]);
		}
		catch(Exception e)
		{
			System.out.println("Numberformatexception");
			err = true;
		}
	
		if(!err)
		{
			try
			{
				if(ar[1].equals("centimeter"))
				{
					type = true;
				}
				else if(ar[1].equals("meter"))
				{
					type = false;
				}
				else
				{
					throw new Exception("Unitformatexception");
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
			if(type)
			{
				System.out.println("Meter Is " + (val/100));
			}
			else
			{
				System.out.println("Centimeter Is " + (val * 100));
			}
		}
	}
}