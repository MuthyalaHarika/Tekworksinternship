import java.util.Scanner;
class Alphabet
  {
  public static void character(char c)
    {
    if(c>='a' && c<='z') 
      System.out.println("c is an alphabet");
    else
      System.out.println("c is not an alphabet");
    }
  public static void main(String args[])
    {
    char c;
    Scanner d=new Scanner(System.in);
    c=d.next().charAt(0);
    Alphabet y=new Alphabet();
     y.character(c); 
    }
  }
  