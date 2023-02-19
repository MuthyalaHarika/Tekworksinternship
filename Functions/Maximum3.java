import java.util.*;
class Maximum3
  {
    public static void Max(int a,int b,int c)
    {
      if(a<=b && a<=c)
        System.out.println("a is maximum");
      else if(b<=c && b<=a)
        System.out.println("b is maximum")
      else
        System.out.println("c is a maximum")
    }
  public static void main(String arg[])
    {
      Scanner s=new Scanner(System.in);
      int a=s.nextInt();
      int b=s.nextInt();
      int c=s.nextInt();
      Maximum3 y=new Maximum3();
      y.Max(int a,int b,int c);
      
    }
  }