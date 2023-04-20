package PracticeCodes;

// Creating an abstract class BankAccount
abstract class BankAccount
{
    int account_number; // instance variable to store the account number
    double balance; // instance variable to store the account balance
    
    // Abstract methods to be implemented by non-abstract subclasses
    abstract double deposit(); 
    abstract double withdraw();    
}

// Non-abstract subclass CheckingAccount extending abstract superclass BankAccount
class CheckingAccount extends BankAccount 
{
    double balance; //  variable to store the balance
    double deposit; //  variable to store the deposit amount
    double withdraw; //  variable to store the withdraw amount
    
    // Constructor to initialize the instance variables
    public CheckingAccount(double balance, double deposit, double withdraw)
    {
        this.balance = balance;
        this.deposit = deposit;
        this.withdraw = withdraw;       
    }

    // Implementation of deposit method from BankAccount superclass
    @Override
    double deposit() 
    { 
        deposit = balance + deposit; // add the deposit amount to the balance
        return deposit; // return the new balance after deposit
    }

    // Implementation of withdraw method from BankAccount superclass
    @Override
    double withdraw() 
    {
        withdraw = balance - withdraw; // subtract the withdraw amount from the balance
        return withdraw; // return the new balance after withdraw
    }   
}
public class abstractBankAccount 
{
    public static void main(String[] args)
    {
        CheckingAccount acc1 = new CheckingAccount(1000, 500, 300); // Create a new CheckingAccount object with initial balance 1000, deposit 500, and withdraw 300
        System.out.println("Deposit : " + acc1.deposit()); // Print the new balance after deposit
        System.out.println("Withdraw : " + acc1.withdraw()); // Print the new balance after withdraw
    }
}
