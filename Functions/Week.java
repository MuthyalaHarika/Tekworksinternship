import java.util.*;
class Week
  {
    public static void number(int n)
    {
      if(n>=1 && n<=7)
            {
             if(n==1)
               System.out.println("M0nday");
             else if(n==2)
               System.out.println("TUESDAY");
             else if(n==3)
               System.out.println("Wednesday");
             else if(n==4)
               System.out.println("Thursday");
             else if(n==5)
               System.out.println("Friday");
             else if(n==6)
                 System.out.println("Saturday");
             else if(n==7)
                System.out.println("Sunday");

        else
             System.out.println("week num is invalid");
       }
    }
        public static void main(String arg[])
        {
        Scanner s=new Scanner(System.in);
         int n=s.nextInt();
        Week y=new Week();
        y.number(n);
        }
    }