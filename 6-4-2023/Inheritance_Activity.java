package practiceCode;

class Employee//Parent class
{
	long emp_ID;
	String emp_Name;
	String emp_Address;
	long emp_phone;
	static double basic_salary;
	static double special_allowance=220.80;
	double Hra=1000.50;
	double salary;
	double transportAllowance;
	
	public Employee(long ID,String Name,String Address,long phone)//constructor of Employee class
	{
		this.emp_ID= ID;
		this.emp_Name=Name;
		this.emp_Address=Address;
		this.emp_phone=phone;
	}
	
	public void calculateSalary()//method for calculating salary
	{
		salary=basic_salary+(basic_salary*special_allowance/100)+(basic_salary*Hra/100);
		System.out.println(emp_Name);//to display name of that employee
		System.out.println("salary is:"+salary);//for displaying salary
	}
	
	public void calculateTransportAllowance()//method for calculating TransportAllowance
	{
		 transportAllowance =10 *basic_salary/10;//calculate transportAllowance
		System.out.println("Transport Allowance: "+transportAllowance);//displaying transportAllowance
	}
}

class Manager extends Employee//base class(manager) derived from employee
{
	 Manager(long Id, String Name,String Address,long phone,double salary)
	{
		super(Id,Name,Address,phone);//
		this.basic_salary=salary;
	}

	public void calculateTransportAllowance()// method  transport allowance
	{
		 transportAllowance =15 *basic_salary/100;//calculating transport_allowance
		System.out.println("Transport Allowance: "+transportAllowance);
	}
}

class Trainee extends Employee//base class(Trainee) derived from Parent class
{
	 Trainee(long Id,String Name,String Address,long phone,double salary)
	{
		super(Id,Name,Address,phone);
		this.basic_salary=salary;
	}
}

public class Inheritance_Activity 
{
	public static void main(String[] args) 
	{
		System.out.println("--Employee Details--");
		Manager m1=new Manager(125434,"Peter","Chennai India",237844,65000);//creating object for manager class
		m1.calculateSalary();//calling the method calculate_salary
		m1.calculateTransportAllowance();//calling the method calculatetransport_allowance
		System.out.println();
		Trainee t1=new Trainee(29846,"Jack","Mumbai India",442085,45000);//creating object for Trainee class
		t1.calculateSalary();//calling the method salary calculateSalary
		t1.calculateTransportAllowance();//calling the method transport allowance
	}
}
