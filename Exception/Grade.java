import java.util.*;    
class Grade
    {
      double average;
   char grade;
      void read()   
      {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the grade of a student");
        try
          {
   Studentgrade=s.next()charAt(0);
          }
        catch(InputMismatchException e)
          {
            System.out.println("Please enter char data");
            read();
          }
    System.out.println("Enter the average marks");
        try
          {
 Average=s.nextDouble();
          }
        catch(Exception e)
          {
            System.out.println("Please enter double data");
            read();
          }
    System.out.println(Studentgrade+"  "+Average);
      }
     public static void main(String a[])
    {
  Grade g=new Grade();
    g.read();
  }
    }

