 import java.util.Scanner;
class Grade
  {
    public static void main(String arg[])
    {
      int py,ch,math,sc;
      Scanner d=new Scanner(System.in);
      py=d.nextInt();
      ch=d.nextInt();
      math=d.nextInt();
      sc=d.nextInt();
      float per=((py+ch+math+sc)/400*100);
      System.out.println("percentage is");
    }
    public static void grade(floatper)
    {
      if(per>=90)
      {
        System.out.println("Grade A");
      }
      else if(per>=80 && per<=90)
        System.out.println("Grade B");
      else if(per>=70 && per<=80)
        System.out.println("Grade C");
      else if(per>=50 && per<=70)
        System.out.println("Grade D");
      else
        System.out.println("Grade F");
    }
  }
     
