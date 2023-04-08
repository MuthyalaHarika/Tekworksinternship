import java.util.*;
class square
  {
    void Number(double n)
    {
      double Number;
      Number=n*n;
    System.out.println(Number);
    }
  
   void Number(int n)
    {
      int Number;
      Number=n*n;
     System.out.println(Number);
     }
  }
class overriding extends square
  {
    void Number(int a)
    {
      int Number;
      Number=a*a;
      System.out.println(Number);
    }
    
  }
class SquaresofNumber
  {
    public static void main(String arg[])
    {
      square S=new square();
      S.Number(10.00);
      S.Number(5);
      S.Number(9.0);
      
      
    }
  }
