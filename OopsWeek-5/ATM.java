/*ATM Simulator: Create a class called "Account" that represents a bank account. The class should have properties such as account number, balance, and account holder name, and methods such as deposit, withdraw and check balance. Create another class called "ATMSimulator" that represents an ATM machine. The class should have a list of accounts, and methods such as addAccount, removeAccount, and transact.*/
import java.util.*;
class ATM
  {
    int accountnumber;
    int balance;
    string accountholdername;
    void getdata()
    {
  Scanner sc=new Scanner(System.in);
  System.out.println("eneter the account details");
  Scanner s=new Scanner(System.in);
  System.out.println("eneter the account number");
  number=s.nextInt();
  System.out.println("eneter account balance");
  balance=s.nextInt();
  System.out.println("eneter the account holdername");
  holdername=s.nextLine();
      }
     void deposit()
    {
      int deposit;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the amount to deposite:");
  deposit=sc.nextInt();
  System.out.println("total ammount is:"+amount+balance);
}
      void withdraw()
        {
        int withdraw;
          Scanner sc=new Scanner(System.in);
          System.out.println("enter the withdraw amount");
          amount=sc.nextInt();
          System.out.println("total amount is:"+amount-withdraw);
        }
    void checkbalance()
    {
      int checkbalance;
      Scanner s=new Scanner(System.in);
      System.out.println("account balance is:"+balance);
    }
}
class ATM
  {
    public static void main(String arg[])
    {
      accont c=new account();
      c.getdata();
      c.deposit();
      c.withdraw();
      c.checkbalance();
      
    }
  }
      

      
   
    





    
    
  
  