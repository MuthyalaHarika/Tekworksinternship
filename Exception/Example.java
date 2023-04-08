import java.util.*;
class Example
  {
    public static void main(String arg[])
    {
      Scanner sc=new Scanner(System.in);
      int x=sc.nextInt();
      int y=sc.nextInt();
      try
        {
          System.out.println(x/y);
        }
      catch(Exeception e)
        {
          System.out.println("program is executed successfully");
        }
      
    }
  }