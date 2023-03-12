import java.util.*;
class ClassExample2
  {
    static int x=10;
     int y=20;
  
 static void increment()
  {
  x=x+1;

    System.out.println(x);
  }
void decrement()
    {
  
y=y-1;
x=x-1;      
      System.out.println(y );
      System.out.println(x);
      
    }
  }   
    class Mainclass
      {
        public static void main(String arg[])
        {
        ClassExample2 h=new ClassExample2();
        h.increment();
          h.decrement();
          System.out.println(h.x+" "+h.y);
        
      }
      }
    