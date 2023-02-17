import java.util.Scanner;
import java.time.LocalDate;
import java.time.period;
class AgeCalculator
  {
    public static void main(String arg[])
    {
      System.out.println("enter date of birth in Y-M-D format:"); 
    Scanner s=new Scanner(System.in);
      String input=s.nextLine();
      LocalDate dob=LocalDate.parse(input);
      System.out.println("you are"+calculate(dob)+"year old");
      
    }
    int calculateAge(LocalDate dob)
    {
      LocalDate curDate=LocalDate.now();
      if((dob !=null) && (curDate !=null))
      {
        return Period.between(dob, curDate).get.years();
      }
      else
      {
        return 0;
      }
    }
  }