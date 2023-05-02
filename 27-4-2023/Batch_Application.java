// 1. Custom exception - CourseNotFoundException
// 2. Bean classes - JAVA & AWS (int stdId, String stdName, long phone, String email,
//    getter and setter method, constructors)
// 3. Batch Main method
// 	Main Menu - 1) Options like Press 1) JAVA 2) AWS 3) Others 4) Exit
// 		    --> JAVA -> 1) Register new student 2) Show all student details
// 				3) Update student details using id
// 		    --> AWS -> 1) Register new student 2) Show all student details
// 			       3) Update student details using id
// 		    --> Others ->
// 				try{ 
// 				sop("Enter the course name you want to search:")
// 				String course = sc.next();
// 				batchService.checkCourse(course)
// 				}
// 				catch(CourseNotFoundException)
// 				{SOP(e.getMessage();)}
				
// 4 . Batch Service(business logic)
// 	1) Create, Read and Update for both AWS and JAVA should be present in this file.
// 	AWS aws[] = new AWS(50);
// 	Java java[] = new Java(50);
// 	int jindex = 0;
// 	int aindex = 0;
// 	2) checkCourse(String course) 
// 		->if(course.equals("JAVA") || course.equals("AWS"))
// 		sop("The course you're looking for is available with us!")
// 		else
// 		throw the custom exception.

//AWS class
package Batch_Application;

public class AWS1 {
	// Private instance variables for AWS1 class
	private int id;
	private String name;
	private double phone;
	private String Email;
	
	// Getters and setters for private instance variables
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPhone() {
		return phone;
	}
	public void setPhone(double phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	// Parameterized constructor for AWS1 class
	public AWS1(int id, String name, double phone, String email) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		Email = email;
	}
	
	// Default constructor for AWS1 class
	public AWS1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// toString method to print the details of AWS1 object
	@Override
	public String toString() {
		return "AWS1 [id=" + id + ", name=" + name + ", phone=" + phone + ", Email=" + Email + "]";
	}
}
//Java class
package Batch_Application;

public class Java1 {
	// Private instance variables for Java1 class
	private int Id;
	private String name;
	private double phone;
	private String Email;
	
	// Getters and setters for private instance variables
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPhone() {
		return phone;
	}
	public void setPhone(double phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	// toString method to print the details of Java1 object
	@Override
	public String toString() {
		return "Java1 [Id=" + Id + ", name=" + name + ", phone=" + phone + ", Email=" + Email + "]";
	}
	
	// Default constructor for Java1 class
	public Java1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// Parameterized constructor for Java1 class
	public Java1(int id, String name, double phone, String email) {
		super();
		Id = id;
		this.name = name;
		this.phone = phone;
		Email = email;
	}
}
//Exception class
package Batch_Application;

// Define a custom exception class that extends the base Exception class
public class customException extends Exception {
	
	// Constructor for customException that takes a message parameter
	public customException(String message) {
		super(message); // Call the constructor of the base class with the message parameter
	}
}
//Batch_Service class 
package Batch_Application;

import java.util.Scanner;

import Batch_Application.AWS1;
import Batch_Application.Java1;

public class Batch_Service
{
	//Create arrays to store Java and AWS course registrations
	static Java1[] java = new Java1[50];
		 static AWS1[] aws = new AWS1[50];
		 static Scanner sc=new Scanner(System.in);
		  
	    static int jindex = 0;
	    static int aindex = 0;
	
	 // Method to create a Java course registration
	    public static void createBatchJava()
	    {
	    	 //Scanner sc=new Scanner(System.in);
	    	//int i=sc.nextInt();
	    	 System.out.println("Welcome to Java Batch");
	    	System.out.println("Enter student Id:");
	    	int id=sc.nextInt();
	    	sc.nextLine();
	    	System.out.println("Enter student Name:");
	    	String nm=sc.nextLine();
	    	System.out.println("Enter student Phone:");
	    	double phone =sc.nextDouble();
	    	sc.nextLine();
	    	System.out.println("Enter student Email:");
	    	String Email=sc.nextLine();
	    	java[jindex]=new Java1(id,nm,phone,Email);
	    	jindex++;
	    	System.out.println("Java batch created successfully!!");
	    	System.out.println();
	    }
	    
	 // Method to display details for a Java course registration
	    public static void showAllDetailsForJava()
	    {
	    	
	    	System.out.println("Enter student id to search:");
	    	boolean flag=false;
	    	int id=sc.nextInt();
	    	for(int i=0;i<jindex;i++)
	    	{
	    		if(java[i].getId()==id)
	    		{
	    		System.out.println("student ID:"+java[i].getId());
	    		System.out.println("student Name:"+java[i].getName());
	    		System.out.println("student Phone:"+java[i].getPhone());
	    		System.out.println("student Email:"+java[i].getEmail());
	    		System.out.println();
	    		flag=true;
	    		break;
	    	}
	    	}
	    
	    	if(flag==false)
	    		System.out.println("student not registered!!");
	    }

	 // Method to update a Java course registration
	    public static void updateJavaStudentInfo()
	    {
	    	boolean flag=false;
	    	System.out.println("Enter the student id you want to update for java ");
	    	int id=sc.nextInt();
	    	
	    	for(int i=0;i<jindex;i++)
	    	{
	    		if(java[i].getId()==id)
	    		{
	    			sc.nextLine();
	    			System.out.println("Enter new student name:");
	    			String nm=sc.nextLine();
	    			System.out.println("Enter new student phone:");
	    			double phone=sc.nextDouble();
	    			sc.nextLine();
	    			System.out.println("Enter new student Email:");
	    			String Email=sc.nextLine();
	    			
	    			java[i]=new Java1(id,nm,phone,Email);
	    			flag=true;
	    		}
	    		if(flag==true)
	    		{
	    			System.out.println("Student updated successfully!!");
	    		}
	    		else
	    		{
	    			System.out.println("Student id not found!!");
	    		}
	    	}
	    }
	
	 // Method to create an AWS course registration
	    public static void CreateBatchAWS() //create Aws course Registration
		 {
		 System.out.println("Welcome to AWS Course!! Please Register Yourself");
		System.out.println("Enter Student Id : ");
	    int id = sc.nextInt();
	    sc.nextLine();
	    System.out.println("Enter Student Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Student Mobile Number : ");
		double phone = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter Student Email Address: ");
		String email = sc.nextLine();	            	
		aws[aindex] = new AWS1(id,name,phone,email);
		aindex++;
		System.out.println("Student details for AWS course enrolled Successfully!!!");
		}
		 
		 public static void showAllDetailsForAWS()//To get Student details using Student Id
	     {
	     	System.out.println("Enter Student id to search : ");
	     	boolean flag = false;
	     	int sid = sc.nextInt();
	     	for(int i=0;i<aindex;i++)
	     	{
	     		if(aws[i].getId()==sid)//check Student id with User entered Id
	     		{
	             		System.out.println("Student Id : "+aws[i].getId());
	             		System.out.println("Student Name : "+aws[i].getName());
	             		System.out.println("Student Contact No. : "+aws[i].getPhone());
	             		System.out.println("Student Email Address : "+aws[i].getEmail());
	             		System.out.println("===========================");
	             		flag=true;
	             	    break;	
	             }
	     			            			
	     		}
	     	if(flag==false)
					System.out.println("Student id not registered");

	     	}
	     
	     public static void updateAWSStudentInfo()//To Update Student details using Student Id
	     {
	     	boolean flag=false;
				System.out.println("Enter the Student id you want to Update your details for Aws Course : ");	
				int id= sc.nextInt();
				
				for(int i=0 ; i<aindex ; i++) {
					
					if(aws[i].getId()==id)//check Student id with User entered Id
					{
						
						sc.nextLine();
						System.out.println("Enter new Student Name : ");
						String name = sc.nextLine();
						
						System.out.println("Enter new Student Mobile No. : ");
						long phone = sc.nextLong();
						
						sc.nextLine();
						System.out.println("Enter new Student Email Address : ");
						String email = sc.nextLine();
						
						aws[i] = new AWS1(id ,name , phone , email);
						flag=true;
						
					}
					
					if(flag==true) {
						System.out.println("Student Updated Successfully!");
					}
					else {
						System.out.println("Student id not found!!");
					}						
				}
	     }
		 
	   //----------------------------------------------------------------------------------//
		 //Other Course
		static void checkcourse(String name) throws customException{
			
			//To check If the Entered Name of Course is equal to Java or Aws
			if(name.equalsIgnoreCase("Java") || name.equalsIgnoreCase("Aws"))
			{	
				System.out.println("Please Select Option 1 or 2 for your preferred course");
				System.out.println("Thank You!!");
			
			}
			else
			{
				//If Name of Course is not Java or Aws Then it will Throw an Exception(CourseNotFoundException)
				throw new customException("Exception--Sorry!!The Course Name you have entered is not available"
						+ "\nThank You!!");
			}
		}
		public void OtherCourseinfo()//othercourseinfo method
		{  
		  try (Scanner sc = new Scanner(System.in)){
		  System.out.println("Enter Course name you want to Learn");
		  String name = sc.nextLine();
		  checkcourse(name);//Call checkcourse mehtod
		   }
		  catch(customException e) //catch block to catch Exception
		  {
		   System.out.println(e.getMessage());
		   }
		}	        	
		}

//Batch_Main class
package Batch_Application;

import java.util.Scanner;

public class BatchMain {
    // Constructor to initialize class variables
    public BatchMain(int id, String name, double phone, String Email) {
        super();
    }

    public static void main(String[] args) {
        // Create an object of Batch_Service class
        Batch_Service bService = new Batch_Service();

        // Create an object of Scanner class to take user input from the console
        Scanner sc = new Scanner(System.in);

        // Run the program in an infinite loop until the user chooses to exit
        do {
            // Display the main menu options
            System.out.println("Welcome To Batch Application");
            System.out.println("Main Menu");
            System.out.println("Press 1 for JAVA");
            System.out.println("Press 2 for AWS");
            System.out.println("Press 3 for Others");
            System.out.println("Press 4 to Exit");
            System.out.println();
            System.out.println("Enter your choice:");
            int choice = sc.nextInt();

            // Use a switch statement to execute the user's choice
            switch (choice) {
                case 1:
                    // Display the Java course menu options
                    do {
                        Scanner sc1 = new Scanner(System.in);
                        System.out.println("1. Register new student");
                        System.out.println("2. Show all student details");
                        System.out.println("3. Update student details using id");
                        System.out.println("4. Exit ");
                        System.out.println("Enter choice:");
                        int javaChoice = sc1.nextInt();
                        System.out.println("-------------------------------");
                        
                        // Use a switch statement to execute the Java course menu choice
                        switch (javaChoice) {
                            case 1:
                                bService.createBatchJava();
                                System.out.println();
                                break;
                            case 2:
                                bService.showAllDetailsForJava();
                                System.out.println();
                                break;
                            case 3:
                                bService.updateJavaStudentInfo();
                                break;
                            case 4:
                                System.out.println("Thank you!!");
                                System.exit(0);
                                break;
                        }
                        System.out.println();
                    } while (true);

                case 2:
                    // Display the AWS course menu options
                    do {
                        Scanner sc2 = new Scanner(System.in);
                        System.out.println("1. Register new student");
                        System.out.println("2. Show all student details");
                        System.out.println("3. Update student details using id");
                        System.out.println("4. Exit ");
                        System.out.println("Enter choice:");
                        int awsChoice = sc2.nextInt();
                        System.out.println("---------------------------------");
                        
                        // Use a switch statement to execute the AWS course menu choice
                        switch (awsChoice) {
                            case 1:
                                bService.CreateBatchAWS();
                                System.out.println();
                                break;
                            case 2:
                                bService.showAllDetailsForAWS();
                                System.out.println();
                                break;
                            case 3:
                                bService.updateAWSStudentInfo();
                                break;
                            case 4:
                                System.out.println("Thank you!!");
                                System.exit(0);
                                break;
                        }
                        System.out.println();
                    } while (true);

                case 3:
                    // Display the Other course menu options and exit the program
                    bService.OtherCourseinfo();
                    System.exit(0);
                    break;

                case 4:
                    // Exit the program
                    System.out.println("Thank You!!");
                    System.exit(0);
                    break;
            }
        } while (true);
    }
}
