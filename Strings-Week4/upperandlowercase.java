import java.util.*;
class upperandlowercase
  {
    public static void display(String string)
    {
      int lowercase=0,uppercase=0;
      for(int i=0;i<=string.length()-1;i++)
        {
          if(string.charAt(i)>='a' && string.charAt(i)<='z')
          {
            lowercase++;
          }
          if(string.charAt(i)>='A' && string.charAt(i)<='Z')
          {
            uppercase++;
          }
        }
      System.out.println("lowercase letters are:"+lowercase);
      System.out.println("uppercase letters are:"+uppercase);
    }

 public static void main(String[] ar)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the string:");
      String s1=s.nextLine();
      display(s1);
    }
  }