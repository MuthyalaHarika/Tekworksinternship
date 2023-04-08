import java .util.*;
class SumFirstLast
  {
    public static void main(String arg[])
    {
      int number=789329;
      int firstdigit=0;
      int lastdigit=0;
      lastdigit=number%10;
      System.out.println("last digit :"+lastdigit);
      while(number!=0)
        {
        firstdigit=number%10;
          number=number/10;
        }
          System.out.println("first digit :"+firstdigit);
      System.out.println(firstdigit+lastdigit);
        
    }
  }