import java.util.*;
class TestCases
  {
    public static void main (String arg[])
    {
      Scanner sc=new Scanner(System.in)
        System.out.println("enter the test cases");
         int a=sc.nextInt();
    int x,y;
    while(a>0)
      {
        System.out.println("enter the height of alice" );
         x=sc.nextInt();
        System.out.println("enter the height of bob");
        y=sc.nextInt();
      if(x>y)
      {
        System.out.println("A");
      }
      else
      {
        System.out.println("B");
      }
    
    }
  }