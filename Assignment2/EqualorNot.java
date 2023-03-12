import java.util.*;
class EqualorNot
  {
    public static void main(String arg[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the first number");
      int a=sc.nextInt();
      System.out.println("enter the second number");
      int b=sc.nextInt();
      equal(a,b);
      
    }
    public static void equal(int a,int b)
    {
      if(a==b)
        System.out.println("they are equal");
      else
        System.out.println("not equal");
    }
  }
   
  