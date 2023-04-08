import java.util.*;
class InvalidStringException extends Exception
  {
    InvalidStringException(String message)
    {
      super(message);
    }
  }
class StringValid
  {
    String msg;
    void add()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string:");
      msg=sc.nextLine();
    }
  }