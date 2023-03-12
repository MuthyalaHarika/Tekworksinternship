import java.util.*;
class Swap
  {
    public static void main(String arg[])
    {
      System.out.println("enter the value of x and y");
      Scanner sc=new Scanner(System.in);
      int x=sc.nextInt();
      int y=sc.nextInt();
      System.out.println("before swapping: "+x+""+y);
      x=x+y;
      y=x-y;
      x=x-y;
      System.out.println("after swaping:"+x+""+y);
    }
  }