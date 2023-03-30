package practiceCode;

public class reverse_pryamid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=4;
		System.out.println("Reversed Half Pyramid");
		for(int i=n; i>=1; i--)//outer loop
		{
			//inner loop
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
