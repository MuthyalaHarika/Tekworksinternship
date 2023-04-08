import java.util.*;
class InvalidUpperCaseException extends Exception
  {
    public InvalidUpperCaseException(String message)
    {
     super(message);
    }
  }
    class UpperCase
      {
        public static void main(String arg[])
        throws InvalidUpperCaseException
        {
          Scanner sc=new Scanner(System.in);
          String string=sc.nextLine();
          try
            {
              if(string.charAt(0)>='A'&&string.charAt(0)<='Z')
                System.out.println("The given name is starts with an upper case letter");
              else
               throw new InvalidUpperCaseException("The given name not starts with an upper case letter"); 
            }
          catch(Eception e)
            {
              throw new InvalidUpperCaseException("The given name not starts with an upper case letter");
            }
        }
      }
    
  
    
  

