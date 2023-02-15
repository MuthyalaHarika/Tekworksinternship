import java.util.Scanner;
class leafyear
  {
    public static void main(String arg[])
    {
      int n;
      Scanner d=new Scanner(System.in);
      n=d.nextInt();
      if(n%400==0)
        System.out.println("it is a leafyear");
      else if(n%100==0)
        System.out.println("it is  a leafyear");
      else
        System.out.println("it is not a leafyear");
    }
  }