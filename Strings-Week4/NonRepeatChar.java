import java.util.*;
class NonRepeatChar
  {
    public static void main(String arg[])
    {
      Scanner s=new Scanner(System.in);
      
      System.out.println("enter the string");
      String string=s.nextLine();
      nonrepeatChar(string);
    }
    public static void nonrepeatChar(String string)
    {
      for(int i=0;i<string.length();i++)
        {
          if(string.indexOf(string.charAt(i))==string.lastIndexOf(string.charAt(i)))
          {
            System.out.println(string.charAt(i));
          }
        }
    }
  }