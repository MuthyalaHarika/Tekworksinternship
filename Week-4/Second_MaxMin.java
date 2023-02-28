import java.util.*;
class Second_MaxMin
  {
    public static void main(String arg[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the size of an array");
      int size=s.nextInt();
       int array[]=new int[size];
      System.out.print("enter the array elemnts:");
      for(int i=0;i<array.length;i++)
        {
          array[i]=s.nextInt();
        }
      MaxMin(array,size);
    }
    public static void MaxMin(int array[],int size)
    {
      int max=array[0];
      int min=array[0];
     int secondmax=array[0];
      int secondmin=array[0];
    for(int i=0;i<array.length;i++)
       {
          if(array[i]>max)
          {
            secondmax=max;
            max=array[i];
          }
        }
      for(int i=0;i<array.length;i++)
        {
          if(array[i]<min)
          {
            secondmin=min;
            min=array[i];
          }
          else
            if(array[i]<secondmin)
            {
              secondmin=array[i];
            }
        }
         System.out.println("second maximum number is:"+secondmax);
        System.out.println("second minimum number is:"+secondmin);
  }
  }
    
  