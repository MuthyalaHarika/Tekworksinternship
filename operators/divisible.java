import java.util.Scanner;
class divisible
  {
    public static void main(String args[])
    {
      int a;
      Scanner d=new Scanner(System.in);
      a=d.nextInt();
      if(a%5==0 && a%11==0)
        System.out.println("a is divisible by 5 and 11");
      else
        System.out.println("a is not divisible by 5 and 11");
    }
  }