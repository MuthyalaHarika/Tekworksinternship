import java.util.*;
class Leap
  {
    public static void number(int a)
    {
      if(a%4==0 && a%400==0)
        System.out.println("a is a leap year");
      else
        System.out.println("a is not a leap year");
    }
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int a=s.nextInt();
      Leap y=new Leap();
      y.number(a);
    }
  }