# Labs
package Basic_programs;

import java.util.Scanner;

class Operator
{
	public int add(int a,int b)
	{
		return a+b;
	}
	
	public int sub(int a,int b)
	{
		return a-b;
	}
	
	public int mul(int a,int b)
	{
		return a*b;
	}
	
	public double div(double a,double b)
	{
		return a/b;
	}
}

public class calculator_switch 
{
	public static void main(String []args)
	{
	Operator op=new Operator();
	System.out.println("Welcome to our calculator!!!");
	Scanner sc=new Scanner(System.in);
	int x,y;
	do
	{
		System.out.println("Which operation you would to perform :");
		System.out.println("1)Add\n2)Sub\n3)Mul\n4)Div");
		int choice=sc.nextInt();
		
	switch(choice)
	{
	case 1:
		System.out.println("Enter 1st digit:");
		x=sc.nextInt();
		System.out.println("Enter 2nd digit:");
		 y=sc.nextInt();
		System.out.println("Addition is:"+op.add(x, y));
		System.out.println();
		break;
		
	case 2:
		System.out.println("Enter 1st digit:");
		x=sc.nextInt();
		System.out.println("Enter 2nd digit:");
		 y=sc.nextInt();
		System.out.println("Subtraction is:"+op.sub(x, y));
		System.out.println();
		break;
		
	case 3:
		System.out.println("Enter 1st digit:");
		x=sc.nextInt();
		System.out.println("Enter 2nd digit:");
		 y=sc.nextInt();
		System.out.println("Multiplication is:"+op.mul(x, y));
		System.out.println();
		break;
		
	case 4:
		System.out.println("Enter 1st digit:");
		x=sc.nextInt();
		System.out.println("Enter 2nd digit:");
		 y=sc.nextInt();
		System.out.println("Division is:"+op.div(x, y));
		System.out.println();
		break;
		
//	case 5:
//		System.exit(0);
//		break;
		
	default:
			System.out.println("Invalid choice!!");
			System.out.println();
	}
	}
	while(true);
}
}
