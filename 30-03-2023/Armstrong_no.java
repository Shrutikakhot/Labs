package practiceCode;
public class Armstrong_no
{
	public static void main(String[] args)
	{
		for(int j=0;j<=1000;j++)
		{
			arms(j);
		}
	}
	static void arms(int n)
	{
		int arm_no=0, rem, a;
		a = n;
        		while(n>0)
        		{
           		   rem = n%10;
           		   arm_no = (rem*rem*rem)+arm_no;
           		   n=n/10;
       			}
        		if(arm_no==a)
        		{
         		   System.out.println(a);
       			}
	}
}
