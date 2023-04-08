import java.util.*;
class Product
  {
    public static void main(String arg[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
      int num=sc.nextInt();
      int n=num;
      int Product=1;
      while(n>0)
        {
          int digit=n%10;
          Product *=digit;
          n=num/10;
        }
      System.out.println("product of digits of a number "+num+" is "product+ ".");
    }
  }