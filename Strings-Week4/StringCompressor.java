import java.util.*;
class StringCompressor
  {
    public static void main(String arg[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string");
      String string=sc.nextLine();
    }
    public static void pattern(String string)
    { 
      int[] frequency=new int[string1.length()];
      char string1=string.tocharArray();
      for(int i=0;i<string1.length();i++)
        {
          frequency[i]=1;
          for(int j=i+1;j<string1.length();j++)
            {
              if(string1[i]==string1[j])
              {
                frequency[i]++;
                string[j]='0';
              }
            }
        }
      System.out.println("frequency of the characters in the given string:");
      System.out.println("characters frequencies");
      for(int i=0;i<frequency.length;i++)
        {
          if(string1[i]!=' ' && string1[i]!='0')
            
        }
            
        }
    }
  }