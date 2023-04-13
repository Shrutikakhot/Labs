package practiceCode;

interface LibraryUser
{
	void registerAccount();//method 1
	void registerBook();//method 2
}
//creating class KidsUser implements using LibraryUser
class KidUsers implements LibraryUser
{
	int age;
	String BookType="Kids";
	//constructor to set values
	public KidUsers(int age, String bookType) {
		super();
		this.age = age;
		this.BookType = bookType;
	}
	@Override
	public void registerAccount() //method for registerAccount
	{
		if(age>0 && age<=12)
			System.out.println("You have Successfully registered under Kids account!");
		else 
			System.out.println("Sorry, Age must be less than 12 to register as a kid!");
	}

	@Override
	public void registerBook()//method for register book
	{
		if(BookType.equalsIgnoreCase("Kids"))
			System.out.println("“Book Issued successfully, please return the book within 10 days");
		else
			System.out.println("Oops, you are allowed to take only kids books !");
	}	
}

//creating class AdultUser implements using LibraryUser
class AdultUser implements LibraryUser
{
	int age;
	String BookType;
	
	
	//constructor to set values
	public AdultUser(int age, String bookType) {
		super();
		this.age = age;
		this.BookType = bookType;
	}
	@Override
	public void registerAccount() //method for registerAccount
	{
		if(age>12 && age<100) 
			System.out.println("You have successfully registered under an Adult Account");
		
		else
			System.out.println("Sorry, Age must be greater than 12 to register as an adult");
		
	}

	@Override
	public void registerBook()//method for Register book
	{
		if(BookType.equalsIgnoreCase("Fiction") && age>12) 
			System.out.println("Book Issued successfully, please return the book within 7 days ");
		else
			System.out.println("Oops, you are allowed to take only adult Fiction books");
	}
}
public class LibraryInterfaceDemo
{
	public static void main(String[] args) 
	{
		//Test case 1:
		//
		KidUsers KD=new KidUsers(10,"Kids");
		System.out.println("Kids Age:" +KD.age);//display age
		System.out.println("Book Type:" +KD.BookType);//displays book type
		KD.registerAccount();//calling registerAccount method
		KD.registerBook();//calling registerBook method
		System.out.println();
		
		
		KidUsers KD1=new KidUsers(18,"Fiction");//display age
		System.out.println("Kids Age:" +KD1.age);//displays book type
		System.out.println("Book Type:" +KD1.BookType);
		KD1.registerAccount();//calling registerAccount method
		KD1.registerBook();
		System.out.println();
		
		System.out.println("----------------------------------------------------------");
		
		//Test case 2:
		AdultUser AU=new AdultUser(5,"Kids");
		System.out.println("Adults Age:" +AU.age);
		System.out.println("Book Type:" +AU.BookType);
		AU.registerAccount();
		AU.registerBook();
		System.out.println();
		
		AdultUser AU1=new AdultUser(23,"Fiction");
		System.out.println("Adults Age:" +AU1.age);
		System.out.println("Book Type:" +AU1.BookType);
		AU1.registerAccount();
		AU1.registerBook();
		System.out.println();
		
	}

}
