import java.util.*;
class Expression
  {
     public static void expression(int a,int b)
    {
      int s=a-- - --a;
      System.out.println(s);
      int c=a--;
      System.out.println(c);
      int d=a>>2;
      System.out.println(d);
      int e=a&b;
      System.out.println(e);
      
    }
    public static void main(String arg[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a value:");
      int x=sc.nextInt();
      System.out.println("enter the b value:");
      int y=sc.nextInt();
      expression(x,y);
    }
    
    }
  