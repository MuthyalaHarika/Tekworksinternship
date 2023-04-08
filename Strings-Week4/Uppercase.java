import java.util.*;
class Uppercase
  {
    public static void main(String arg[])
    {
      
      Scanner s=new Scanner(System.in);
       System.out.println("enter the string");
      String string=s.nextLine();
      uppercase(string);
    }
       public static void uppercase(String string)
        {
          System.out.println(string.toUpperCase());
        }
  }