import java.util.*;
class Sumdigit
  {
    public static void getSum(int n)
    {
      int sum=0;
      while (n!=0)
        {
          sum=sum+n%10;
          n=n/10;
        }
      
    }
    public static void main(String arg[])
    {
      int n=7325;
      System.out.println(getSum(n));
      
    }
  }