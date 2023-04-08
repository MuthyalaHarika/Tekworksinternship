import java.util.*;
class InvalidPinException extends Exception
  {
    public InvalidPinException(String message)
    {
      super(message);
    }
  }
class CustomAtm
{
    String correctpin="0000";
    public void validpin(String pin) throws InvalidPinException
  {
  if(!pin.equals(correctpin))
    {
     throw new InvalidPinException("Invalid pin Entered: ");
    }
  
  }
  }
public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your pin: ");
    String pin=sc.nextLine();
    CustomAtm c=new CustomAtm();
  try
    {
      c.validpin(pin);
      System.out.println("pin validate Successful");
    }
  catch(InvalidPinException e)
    {
      System.out.println("pin is not valid");
    }
  }
}