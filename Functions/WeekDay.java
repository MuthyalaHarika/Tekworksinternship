import java.util.*;
class WeekNumber
  {
    public static void day(char c )
    {
      switch(day)
      {
            case 1:
                    System.out.println("monday");
                  break;

            case 2:
                    System.out.println("tuesday");
                  break;
            case 3:
                    System.out.println("wednesday");
                  break;
            case 4:
                    System.out.println("thursday");
                  break;
            case 5:
                    System.out.println("friday");
                  break;
            case 6:
                     System.out.println("saturday");
                  break;
    }
    public static void main(String args[])
        {
        char c;
        Scanner d=new Scanner(System.in);
        char c=d.next().charAt(0);
        WeekDay y=new WeekDay();
        y.day(c);
        
        }
  }