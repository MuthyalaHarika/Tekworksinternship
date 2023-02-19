import java.util.*;
class Maximu
  {
    public static void Max(int a, int b)
    
    {
      if (a<b)
        System.out.println("a is a maximum number");
      else
        System.out.println("b is a maximum number");
} public static void main(String arg[])
    {
      Scanner s=new Scanner(System.in);
      int a=s.nextInt();
      int b=s.nextInt();
      Maximu y=new Maximu();
      y.Max(a,b);
      
}
  }