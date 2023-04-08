import java.util.*;
class IgnoreCase
  {
    public static void main(String arg[])
    {
      
      Scanner s=new Scanner(System.in);
       System.out.println("enter the string1");
      String string1=s.nextLine();
      System.out.println("enter the string2");
     String string2=s.nextLine();
      concatenate(string1,string2);
    }
       public static void concatenate(String string1,String string2)
        {
          System.out.println(string1.compareToIgnoreCase(string2));
        }
  }