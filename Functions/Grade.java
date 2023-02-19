import java.util.*;
class Grade
  {
    public static void num(int marks)
    {
      System.out.println("enter the marks");
      {
      if(marks>=90)
              System.out.println("grade A");
            else if(marks>=80)
              System.out.println("grade B");
            else if(marks>=70)
                System.out.println("grade C");
            else if(marks>=60)
                System.out.println("grade D");
            else if(marks>=40)
                System.out.println("grade E");
            else
                System.out.println("grade F");
      }
    }
    public static void main(String args[])
    {
      int java,python,chem,math;
      Scanner s=new Scanner(System.in);
       java=s.nextInt();
       python=s.nextInt();
       chem=s.nextInt();
      math=s.nextInt();
      float percentage=((java+python+chem+math)/400*100);
      Grade y=new Grade();
      y.number(marks);
    }
  }
