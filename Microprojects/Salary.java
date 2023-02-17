import java.util.*;
class Salary
  {
      public static void main(String arg[])
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the annual salary");
      double s=sc.nextDouble();
      System.out.println("enter the net salary");
      double d=sc.nextDouble();
      double t=s-d;
      int r=0;
      if(t<=200000)
        r=0;
      else if(t<=500000)
        r=10;
      else if (t<=10000000)
        r=20;
       else 
        r=30;

    }
  