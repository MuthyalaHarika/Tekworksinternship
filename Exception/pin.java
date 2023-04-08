import java.util.*;
class InvalidpinException extends Exception
{
   String message;
    public InvalidpinException(String message) 
  {
       this.message=message;
    
    }
   String get()
   {
     return message;
   }
}
class person
  {
   private int pin;
  
public class person(int pin)
  {
  this.pin=pin;
  }

public void check()
  throws InvalidpinException
  {
  for(int i=1;i<=5;i++)
    {
      try
        {
          Scanner obj=new Scanner(System.in);
          pin=obj.nextInt();
          if(pin<=4&& pin>=5)
          {
            throw new InvalidpinException("invalid pin");
          
          }
            else
          {
            System.out.println("pin must be four digits");
            
          }
        }
          catch(InvalidpinExpection e)
        {
          obj.next();
          System.out.println("Error use numbers not alphabets or characters");
        }
        }
  public class pin
    {
  public static void main(String arg[])
    {
    person p=new person(1111);
    p.check();
    }
    }
    

  

 
