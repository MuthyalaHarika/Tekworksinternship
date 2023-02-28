import java.util.*;
class ArrMinMax
  {
    public static void minmummaximum()
    {
      Scanner p=new Scanner(System.in);
      System.out.println("enter the size of an array");
      int n=p.nextInt();
      int i,sum=1;
      int arr[]=new int[n];
      for(i=1;i<n;i++);
      {
        System.out.println("enter the number");
        arr[i]=p.nextInt();
      }
    int Max_number=arr[1];
    int Min_umber=arr[1];
      for(i=1;i<n;i++)
        {
          if(arr[i]>Max_number)
          {
            Max_number=arr[i];
            System.out.println("maximum number:"+Max_number);
          }
          else
            if(arr[i]<Min_number)
            {
              Min_number=arr[i];
              System.out.println("minimum number:"+Min_number);
            
        }
        
       public static void main(String arg[])
        {
        minimummaximum();
        }
    }
      
    
  