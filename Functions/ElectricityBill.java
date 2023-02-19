import java.util.*;
class ElecticityBill
  {
    public static void unit(int bill)
    {
    
        if(unit<50)
          {
           bill=unit*0.5;
          System.out.println( "bill");
          }
      else if(unit>50 && unit<150)
           {
              bill=unit*0.75;
               System.out.println("bill");
           }
       else if(unit>150 && unit<=250)
              {
               bill=unit*1.20;
                 System.out.println("bill");
              }
             if(unit>250)
             {
                bill=unit*1.5;
              total bill=bill+bill*20/100;
               System.out.println("total bill");
             }
    }
    public static void main(String arg[])
      {
      Scanner s=new Scanner(System.in);
      bill=s.nextInt();
      ElectricityBill y=new ElectricityBill();
      y.unit(bill);
    }
    
      }
}


