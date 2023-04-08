import java.util.*;
class Indexpattern
  {
    public static void main(String arg[])
    {
      
      Scanner s=new Scanner(System.in);
       System.out.println("enter the string");
      String string=s.nextLine();
     index (string);
    }
       public static void index(String string)
        {
          System.out.println(string.indexOf('h'));
        }
  }