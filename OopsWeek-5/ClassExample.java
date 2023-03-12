import java.util.*;
class ClassExample
  {
  int var1=60;//non static variable
  static int var2=30;// static variable
   
  void display()//nonstatic method
    {
    
    
    
    System.out.println(var1+ " " +var2);
      }
    void increment()
    {
      var1=var1+1;
        var2=var2+1;
    }
}
  class Mainclass
    {
      public static void main(String arg[])
      {
        ClassExample ce=new ClassExample();
        ClassExample c=new ClassExample();
        //System.out.println(ce.var1+ "  " +ClassExample.var2);
        ce.increment();
        c.increment();
        ce.display();
        c.display();
  }
    }