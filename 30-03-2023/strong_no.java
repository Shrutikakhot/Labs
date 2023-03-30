package practiceCode;
public class strong_no 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<1000;i++) 
		{
			check_Num(i);
		}

	}
	
    static int fact(int no)   
    {   
        int f = 1;   
        while (no != 0) 
        {   
            f = f * no;   
            no--;   
        }   
        return f;   
    }   

    static void check_Num(int number)   
    {   
        int sum = 0;     
        int temp_No = number;      
        while (temp_No != 0) 
        {   
            sum = sum + fact(temp_No % 10);   
            temp_No = temp_No / 10;   
        }   

        if(sum == number)  
            System.out.println(number + " is a Strong number");   
    }  

}
