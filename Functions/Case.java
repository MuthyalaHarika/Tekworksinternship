 import java.util.*;
 class Case
   {
     public static void letter(char n )
     {
    if(n>='A' &&  n<='Z')
       System.out.println("it is a uppercase");
     else
        System.out.println ("it is a lowercase");
     }
     public static void main(String args[])
     {
       char n;
       Scanner d=new Scanner(System.in);
       n=d.next().charAt(0);
       Case y=new Case();
       y.letter(n);
     }
   }
