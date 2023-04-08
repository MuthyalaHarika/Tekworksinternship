import java.util.*;
class SelectionSort
  {
    public static void main(String[] args)
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter Size: ");
      int n=s.nextInt();
      System.out.println("Enter Elements: ");
      int arr[]=new int[n];
      for(int i=0;i<n-1;i++)
        {
          arr[i]=s.nextInt();
        }
      selectionsort(arr,n);
    }
    public static void selectionsort(int arr[],int n)
    {
      for(int i=0;i<n;i++)
        {
          for(j=i+1;j<n;j++)
            {
             if(arr[i]>arr[j])
             {
               int temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
             }
             
        }
    } 
      for(int k=0;k<=n-1;k++)
        {
          System.out.println(arr[k]);
        }
    }
  }