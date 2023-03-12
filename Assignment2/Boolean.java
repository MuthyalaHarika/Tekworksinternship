import java.util.*;
class Boolean
  {
    public static void main(String arg[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter x value:");
      boolean x=sc.nextBoolean();
      System.out.println("enter the y value:");
      boolean y=sc.nextBoolean();
      Operation (x,y);
    }
    public static void Operation(boolean x,boolean y)
    {
      if(x&&y)
      {
        System.out.println(false);
      }
      else if(x||y)
      {
        System.out.println(true);
        
      }
      else if(!x)
      {
        System.out.println(false);
      }
      else
        System.out.println(true);
    }
  }