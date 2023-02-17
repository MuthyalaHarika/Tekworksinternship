import java.util.*;
class Temperature
  {
    public static void main(String arg[])
    {
      double f,c;
      Scanner sc=new Scanner(System.in);
      System.out.println("choose the type of conversion 1.fahrenheit to celsius ,2.celsius to fahrenheit");
         int ch=sc.nextInt();
      switch(ch)
        {
          case 1:
            System.out.println("enter fahrenheit temperature");
               f=sc.nextDouble();
            c=(f-32)*5/9;
            System.out.println("celsius temperature is ="+c);
           break;
          case 2:
            System.out.println("enter celsius chemperature");
                 c=sc.nextDouble();
            f=((9*c)/5)+32;
            System.out.println("fahreheit temperature is="+f);
           break;
          default:
            System.out.println("please choose valid choice");
            
        }
    }
  }