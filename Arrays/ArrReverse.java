import java.util.*;
class ArrReverse
  {
    public static void reverse(int a[],int n)
    {
      int i,t;
      for(i=0;i<n/2;i++)
        {
          t=a[i];
          a[i]=a[n-1-i];
          a[n-1-i]=t;
          
        }
      System.out.println("reverse array is:");
      for( i=0;i<n;i++)
        {
          System.out.println(a[i]);
        }   
        
    }
    public static void main(String arg[])
    {
      Scanner s=new Scanner(System.in);
    System.out.print("enter the size:");
    int arraysize=s.nextInt();
    int array[]=new int[arraysize];
      System.out.print("enter the array elemnts:");
      for(int i=0;i<array.length;i++)
      {
        array[i]=s.nextInt();
      }
    reverse(array,arraysize);
    }
    }
    
    
    
 public static void main(String arg[])
   {
   Scanner s=new Scanner(System.in);
   System.out.println("enter the size");
   int 
   )
   
   }