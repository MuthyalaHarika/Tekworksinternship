import java.util.*;
class Mobilenumber
  {
    public static void main(String arg[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string");
      String string=new String(sc.nextLine());
      number(s1);
    }
    public static void number(String s1)
    {
      int count=0;
      for(int i=0;i<=s1.length-1;i++)
        {
          if(s1.charAt(i)>='0' && s1.charAt(i)<='9')
          {
            count++;
          }
        }
      if(count==10)
      {
        System.out.println("it is a valid mobile number");
      }
      else
      {
        System.out.println("it is not a valid mobile number");
      }
    }
  }
    