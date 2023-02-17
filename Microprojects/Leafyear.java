import java.util.*;
class Leafyear
  {
    public static void main(String arg[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter any year");
      int year=s.nextInt();
         {
           if(year %400==0)
      {
        System.out.println("it is a leapyear"); 
      }
   else if(year % 4==0)
   {
        System.out.println("it is a leaf year");
   }
    else 
   {
      System.out.println("it is not a leaf year");
   }
    }
    }
  }
    

    
  