//Bank Account: Create a class called BankAccount that simulates a bank account. The class should have methods to deposit, withdraw, and check the balance. You can also create a custom exception called InsufficientFundsException to throw when a withdrawal is attempted with insufficient funds.//
import java.util.*;
class Bank
  {
    int balance=20000;
    void deposit() throws ArithmeticException
    {
   Scanner sc=new Scanner(System.in);
  System.out.println("enter the amount to deposite:");
  int amount=sc.nextInt();
      if(amount<500)
        throw new ArithmeticException("minimum balance should be 1000");
       else 
  System.out.println("total ammount is:"+amount+balance);
}
    
    void withdrawl() throws Exception
    {
       Scanner sc=new Scanner(system.in);
       System.out.println("enter the amount to withdrawl");
       int withdrawlamount=sc.nextInt();
         if(withdrawlamount<20000)
        throw new Exception("Insufficient Exception");
           else if(withdrawlamount>20000)
             throw new Exception("Your limit is exceeded");
      else 
           System.out.println("total amount is:"balance-withradrawlamount);
     }
     void checkbalance()
    {
      
      Scanner s=new Scanner(System.in);
      long balance=sc.nextLong();
      System.out.println("account balance is:"+balance);
      System.out.println((balance);
    }
  }
class Bankapplication
  {
public static void main(String arg[])
    {
      Bankapplication b=new Bankapplication();
      b.deposit();
      b.withdrawl();
      b.checkbalance();
      
    }
  }
  
    
    
    
  