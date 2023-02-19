import java.util.*;
class Divisible
  {
    public static void number(int a)
  {
    if(a%5==0 && a%11==0)
      System.out.println("a is divisible by 5 and 11");
    else
      System.out.println("a is not divisible by 5 and 11");
  }
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int a=s.nextInt();
      Divisible y=new Divisible();
      y.number(a);
    }
  }
  