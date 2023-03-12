import java.util.*;
class Sumwithoutoperator
  {
    public static void main(String arg[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the first number");
      int a=sc.nextInt();
      System.out.println("enter the second number");
      int b=sc.nextInt();
      add(a,b);
      
    }
    public static int add(int a,int b)
    {
      if(b==0)
        return a;
      int sum=a^b;
      int carry = (a & b)<<1;
      return add(sum,carry);
    }
}
  