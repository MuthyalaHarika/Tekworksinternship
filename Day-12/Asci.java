import java.util.*;
class Asci
  {
    public static void Ascii(char character)
    {
if((character>='a' && character<='z')||(character>='A'&& character<='Z'))
{
System.out.println("Ascii value of a given character is:"+(int)character);
}
      else{
System.out.println("given character is a special character");
      }
   
    }
  
    public static void main(String[] r)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the character:");
      char character=s.next().charAt(0);
      asci p=new asci();
      p.ascii(character);
    }
  }
