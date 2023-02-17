import java.util.*;
class Electicity
  {
    public static void main(String arg[])
    {
      System.out.println("previous units");
      Scanner s=new Scanner(System.in);
      int a=s.nextIntln();
      System.out.println("current units");
      int b=s.nextInt();
      Elect(a,b);
        
    }
    public static void Elect(int a,int b)
    {
      double units=a+b;
      double total=0;
      System.out.println("total units::"+units);
      if(units<=50)
      {
        total=units*0.50;
      }
      else if(units>50 && units<=150)
      {
        total=units*0.75;
      }
      else if(units>150 && units<=250)
      {
        total=units*1.20;
        
      }
      else
      {
        total=units*1.50;
      }
      double gst=20*total/100;
      double Elect_bill=gst+total;
      System.out.print("total Elect bill"+Elect_bill);
    }
  }
  