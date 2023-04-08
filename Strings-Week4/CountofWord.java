import java.util.*;
class CountofWord
  {
    public static void main(String arg[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a string");
      String s=sc.nextLine();
      NumberofWords(s);
    }
    public static void NumberofWords(String s)
    {

int count=1;
for(int i=0;i<s.length()-1;i++)
  {
    if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' '))
    {
      count++;
    }
  }
System.out.println("total count in a string: "+count);
}
}