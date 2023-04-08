import java.util.*;
class Palindrome
  {
    public static void main(String args[])
    {
    String reverse="";
      String string=new String();
      Scanner s=new Scanner(System.in);
      System.out.println("enter a string");
      string=s.nextLine();
      int n=string.length();
      for(int i=n-1;i>=0;i--)
      reverse=reverse+string.charAt(i);
      if(string.equals(reverse))
        System.out.println(" string is a palindrome");
        else
         System.out.println(" string is not a palindrome");
    }
  }