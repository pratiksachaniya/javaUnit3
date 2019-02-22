/*Write a program that accepts a string from command line and perform following
operations:
1. Display each character on separate line in reverse order.
2. Count total number of chracters and display each character's position too.
3. Identify that whether the string is palindrom or not.
4. Count total number of uppercase and lowercase characters in it.*/
class CharCounter
{
	public static void main(String[] ar)
	{
		String str = ar[0];
		int len = str.length();
		
		System.out.println("Revers String");
		for(int i = len -1; i >=0; i--)
		{
			System.out.println(str.charAt(i));
		}
		
		System.out.println("Char With Position");
		for(int i = 0; i < len; i++)
		{
			System.out.print(str.charAt(i) + "[" + i + "]  " );
		}
		String pali  = Character.toString(str.charAt(len-1));
		for(int i = len -2; i >=0; i--)
		{
			pali += str.charAt(i);
		}
		
		System.out.println();
		if(pali.equalsIgnoreCase(str))
		{
			System.out.println("String Is Palindrom");
		}
		else
		{
			System.out.println("String Is Not Palindrom");
		}
		int l,u;
		l = 0;
		u = 0;
		for(int i =0; i < len; i++)
		{
			if(Character.isLowerCase(str.charAt(i)))
			l++;
			else if(Character.isUpperCase(str.charAt(i)))
			u++;
		}
		
		System.out.println("Total UpperCase Character Is " + u);
		System.out.println("Total LowerCase Character Is " + l);		
		
	}
}