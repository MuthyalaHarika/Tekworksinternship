import java.util.*;
class InsertionSort
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
      insertionsort(arr,n);
    }
    public static void insertionsort(int arr[],int n)
    {
      
      for(int i=1;i<n;i++)
        {
        int key=arr[i];
        
      while(int j>=0 && arr[j]>key)
        {
          arr[j+1]=arr[j];
          j=j-1;
        }
      arr[j+1]=key;
    }
    }
      System.out.println("pass" +i);
    
  }
}


    