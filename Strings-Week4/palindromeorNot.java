import java.util.*;
class palindromeorNot
  {
  public static void main(String args[])
    {
      String string=new String();
      Scanner sc=new Scanner(System.in);
      string=sc.nextLine();
    
      System.out.println(string);
    boolean isPalindrome = true;
     int len = string.length();
      
  for (int i = 0; i < len / 2; i++) 
   {
   if (string.charAt(i) != string.charAt(len - i - 1))
       {
        isPalindrome = false;
         break;
       }
   }
        if (isPalindrome)
        {
            System.out.println(string + " is a palindrome.");
          StringBuffer sb=new StringBuffer(string);
          String replaceString=string.replace(string,"palindrome");
          System.out.println(replaceString);
        } 
        else
        {
            System.out.println(string + " is not a palindrome.");
        }
    }
  }
        
    
  