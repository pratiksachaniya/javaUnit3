import P1.*;
import P2.*;
import P3.*;

class DemoClass
{
	public static void main(String ar[])
	{
		Min min = new Min();
		Max max = new Max();
		AVG avg = new AVG();
		
		System.out.println("Min Is: " + min.min(10,20,30));
		System.out.println("Max Is:" + max.max(10,20,30));
		System.out.println("Avg Is:" + avg.avg(10,20,30));
	}
}