/*ATM Simulator: Create a class called "Account" that represents a bank account. The class should have properties such as account number, balance, and account holder name, and methods such as deposit, withdraw and check balance. Create another class called "ATMSimulator" that represents an ATM machine. The class should have a list of accounts, and methods such as addAccount, removeAccount, and transact.*/
import java.util.*;
class ATMConstructor
  {
    int numa;
    int numb;
    String harika;
    static int d=30;
    ATMConstructor(int h,int p,String c)
    
    {
      numa=h;
      numb=p;
      harika=c;
      System.out.println(h+" "+p+" "+c);
     
  }
}
class account
  {
    public static void main (String arg[])
    {
      ATMConstructor ce=new ATMConstructor(23,40,"harika");
    }
  }
      
  