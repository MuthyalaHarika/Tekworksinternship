import java.util.*;
class Assignment
  {
    public static void main(String arg[])
    {
      int m,int n,int stop_num;
      Scanner s=new Scanner(System.in);
      int m=s.NextInt();
      int n=s.NextInt();
      int stop_num=s.NextInt();
       for (int x=m;x<=n;x++)
    {
    if (x%2==0 && x%3==0)
    {
       if (x==stop_num)
         break;
      System.out.println(x);
     
    }
   
  }

    }
  }
  