import java.util.*;
class MaximumCount
  {
    public static void main(String arg[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter string");
      String string=s.nextLine();
      maxminlength(string);
    }
    public static void maxminlength(String string)
    {
     
      String array[]=string.split(" ");
       String maximum=array[0];
      String minimum=array[0];
      for(int i=0;i<array.length;i++)
        {
          if(minimum.length()>array[i].length())
          {
            minimum=array[i];
          }
          else
          {
            maximum=array[i];
          }
        }
      System.out.println(minimum);
      System.out.println(maximum);
    }
      
    }