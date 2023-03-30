package practiceCode;

public class Half_pyramid 
{
	public static void main(String[] args)
	{
		System.out.println("Half Pyramid");//printing message
		for(int i=1; i<=4; i++)//outer loop
		{
			for(int j=1;j<=i;j++)//inner loop
			{
				System.out.print("* ");
			}
			System.out.println();
		}	
	}
}
