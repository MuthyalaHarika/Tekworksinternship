import java.util.Scanner;
class Maximum
  {
    public static void main(String arg[])
    {
      int i,j,k;
      Scanner d=new Scanner(System.in);
      i=d.nextInt();
      j=d.nextInt();
      k=d.nextInt();
      if(i>=j && i>=k)
        System.out.println("i  is maximum");
      else if(j>=i && j>=k)
        System.out.println("j is maximum");
      else
        System.out.println)("k is a maximum");
    }
  }