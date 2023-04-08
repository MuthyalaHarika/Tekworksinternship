import java.util.Scanner;
public class Anagram
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter string1 :");
      String a1 = sc.nextLine();
      System.out.println("enter string2 :");
      String a2 = sc.nextLine();
      char ch1[] = a1.toCharArray();
      char ch2[] = a2.toCharArray();
      if(anagram(ch1,ch2))
      {
        System.out.println("this is anagram");
      }
      else
      {
        System.out.println("this is not anagram");
      }
      
    }
    public static boolean anagram(char ch1[],char ch2[]){
      int n1 = ch1.length;
      int n2 = ch2.length;
      for(int i = 0 ;i<n1;i++)
        if(ch1[i]!=ch2[i])
          return false;
      return true;
    }
  }