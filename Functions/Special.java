import java.util.*;
class Special
  {
    public static void word(char c)
    {
if(c>='A' && c<='Z' || c>='a' && c<='z')
  System.out.println("it is a alphabet");
    else if(c>=0 & c<=9)
    System.out.println("it is a digit");
    else
     System.out.println("it is a special character");
    }
    public static void main(String args[])
    {
      char c;
      Scanner s=new Scanner(System.in);
      c=s.next().charAt(0);
      Special y=new Special();
      y.word(c);
    }
  }

