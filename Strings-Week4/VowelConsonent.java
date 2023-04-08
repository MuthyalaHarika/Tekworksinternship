import java.util.*;
class VowelConsonent
  {
    public static void main(String arg[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the string");
     String string1=s.nextLine();
  vowelConsonants(string1);
      
    }
    public static void vowelConsonants(String string1)
      {
      char ch;
    int vowel=0,consonants=0,space=0,digit=0,symbol=0;
      for(int i=0;i<string1.length();i++)
        {
       ch=string1.charAt(i); 
        if(ch>='a'||ch>'A' && ch<='z'||ch<'Z')
        {
          if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
          {
            vowel++;
          }
          else
          {
            consonants++;
          }
        }
        else if(ch>='0' && ch<='9')
           {
            digit++;
          }
        else if(ch==' ')
          {
            space++;
          }
        else
          {
            symbol++;
          }
      }
    
    System.out.println("Total no.of vowel"+vowel);
    System.out.println("Total no.of consonents"+consonants);
    System.out.println("Total no.of Numbers"+digit);
    System.out.println("Total no.of spaces"+space);
    System.out.println("Total no.of special characters: "+symbol);
} 
  
}