import java.util.*;
class Vowel
  {
    public static void character(char c)
    {
if (c=='a' || c=='e' || c=='i' || c=='o' ||c=='u'|| c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
  System.out.println("it is a vowel");
else
  System.out.println("it is a consonent");
    }
    public static void main(String args[])
    {
      char c;
      Scanner s=new Scanner(System.in);
      c=s.next().charAt(0);
      Vowel y=new Vowel();
      y.character(c);
      
    }
  }
