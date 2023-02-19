import java.util.*;
class EvenorOdd
{
public static void number(int a)
{
 if(a%2==0)
   System.out.println("a is a even number");
  else
   System.out.println("a is a odd number");
}
public static void main(String args[])
{
 Scanner s=new Scanner(System.in);
  int a =s.nextInt();
  EvenorOdd y= new EvenorOdd();
  y.number(a);
}
  
   


}