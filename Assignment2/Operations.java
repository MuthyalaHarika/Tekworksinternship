import java.util.*;
class Operations
  {
    public static void main(String arg[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the first number");
     int x=sc.nextInt();
      System.out.println("enter the second number");
      int y=sc.nextInt();
      Difference(x,y);
      Product(a,b);
      Division(s,h);
      IncrementDecrement(a);
     Remainder(p,q);
    }
    public static void Difference(int x,int y)
     {
       Scanner sc=new Scanner(System.in);
      System.out.println("enter the first number");
     int x=sc.nextInt();
      System.out.println("enter the second number");
      int y=sc.nextInt();
      int z= x-y;
      System.out.println(z);
     }
    public static void Product(int a,int b)
      {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the third number");
     int a=sc.nextInt();
      System.out.println("enter the fourth number");
      int b=s.nextInt();
      int c=a*b;
      System.out.println(c);
      }
    public static void Division(int x,int y)
    {
      Scanner a=new Scanner(System.in);
      System.out.println("enter the fifth number");
     int s=a.nextInt();
      System.out.println("enter the sixth number");
      int h=a.nextInt();
      int w=x/y;
      System.out.println(w);
    }
    public static void IncrementDecrement(int a)
    {
      Scanner b=new Scanner(System.in);
      int p=b.nextInt;
      a=a+1;
      a=a-1;
      System.out.println(a);
    }
    public static void Remainder(int p,int q)
    {
      Scanner t=new Scanner(System.in);
      System.out.println("enter the seventh number");
     int p=t.nextInt();
      System.out.println("enter the eighth number");
      int q=t.nextInt();
      int s=p%q;
      System.out.println(s);
    }

  
    }
    
  