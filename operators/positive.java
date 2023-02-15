import java.util.Scanner;
class positive
  {
    public static void main(String arg[])
    {
      int i;
      Scanner k=new Scanner(System.in);
      i=k.nextInt();
      if(i>0)
        System.out.println("i is a positive digit");
      else if(i<0)
        System.out.println(" i is a negitive");
      else
          System.out.println("i is a zero");
      }
    }