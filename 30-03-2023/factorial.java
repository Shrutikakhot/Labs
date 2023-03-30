package practiceCode;

public class factorial 
{
	public static void main(String[] args) 
	{
		int i,fact=1;
		System.out.println("Factorial from 1 to 10 : ");
		for(i=1;i<=10;i++)
		{
			fact=i*fact;
			
		System.out.println(fact);
		}	
	}
}
