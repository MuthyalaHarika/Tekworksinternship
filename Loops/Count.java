import java.util.*;
class Count
  {
    public static void main(String arg[])
    {
      int count=0 ,num=123456789;
      while(num!=0)
        {
          num=num/10;
          count++;
        }
      System.out.println("number of digits:" +count);
    }
  }