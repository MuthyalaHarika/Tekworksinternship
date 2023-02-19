import java.util.*;
class Check
  {
    public static void number(int a)
    {
      if(a>0)
        System.out.println("it is a positive number");
      else if(a<0)
        System.out.println("it is a negitive number");
      else
        System.out.println("it is a zero");
    }
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int a=s.nextInt();
      Check y=new Check();
      y.number();
    }
      
  }  
        

    
    
  