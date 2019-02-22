package P2;
public class Max
{
	public int max(int n1,int n2,int n3)
	{
		if(n1 > n2 && n1 > n3)
			return n1;
		else if(n2 > n3)
			return n2;
		else
			return n3;
	}
}