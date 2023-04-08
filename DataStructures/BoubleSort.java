import java.util.*;
class BoubleSort
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
    }
  
    public static void boublesort(int arr[])
      {
    int n=arr.length;
    int temp=0;
    for(int i=0;i<n;i++)
  {
    for(int j=1;j<(n-1);j++)
      {
        if(arr[j-1]>arr[j])
        {
          temp=arr[j-1];
          arr[j-1]=arr[j];
          arr[j]=temp;
        }
      }
    for(k=0;k<=n-1;k++)
      {
        System.out.println(arr[k])
      }
  }
}
}