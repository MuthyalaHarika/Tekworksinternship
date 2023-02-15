import java.util.Scanner;
class alphabet or not
  {
  public static void main(String arg[])
    {
    char c;
    Scanner d=new Scanner(System.in);
    c=d.next().charAt(0);
    if(c>='a' && c<='z') 
      System.out.println("c is an alphabet");
    else
      System.out.println("c is not an alphabet");
    }
  }