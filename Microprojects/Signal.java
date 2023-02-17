import java.util.*;
class Signal
  {
    public static void main(String arg[])
    {
      System.out.println("enter the time ");
      Scanner sc=new Scanner(System.in);
      int time=sc.nextInt();
      if (time>=1 && time<=20){
        System.out.println("Red");
      else if(time>=20 && time<=40)
              System.out.println("Green");
      else if(time>=40 && time<=60)
              System.out.println("Orange"); 
      else
        system.out.println("invalid");
    }      
} 
        
