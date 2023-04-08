import java.util.*;
class InvalidWithdrawAmountException extends Exception
  {
    public InvalidWithdrawAmountException(String mesage)
    {
   super(mesage);
    }
  }
    class WithdrawAmount
      {
        public static void main(String arg[])
        throws InvalidWithdrawException
        {
          Scanner sc=new Scanner(System.in);
          try
            {
              double withdrawamount=Double.parseDouble(withdrawamount);
              System.out.println("valid ");
            }
          catch(Eception e)
            {
              throw new InvalidWithdrawException("not a digit");
            }
        }
      }
    
  
    
  