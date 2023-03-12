import java.util.*;
class Shorthand
  {
    public static void main(String arg[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a value:");
      int x=sc.nextInt();
      System.out.println("enter the b value:");
      int y=sc.nextInt();
      shorthand (x,y);
    }
    public static void shorthand(int a,int b)
    {
      System.out.println(a=a*b);
      System.out.println(a=a-b);
      System.out.println(a=a/b);
      System.out.println(a=a%b);
       }
  }