import java.util.*;
class ArrayStatic
  {
     public static void sort012(int a[],int n)
    {
      int count=0;
      for(int i=0;i<n;i++)
        {
          if (a[i]==0)
            count++;
        }
      for(int i=0;i<count;i++)
        a[i]=0;
      for(int i=count;i<n;i++)
        a[i]=1;
      for(int i=0;i<count2;i++)
        a[i]=2;
    }
    public static void print(int a[],int n)
    { 
      System.out.println("after sorting is");
      for(int i=0;i<n;i++)
        System.out.println(a[i]+"");
    }
    public static void main(String arg[])
    {
      int a[]=new int[]{0,1,0,0,2,1,1,2,2};
      int n=a.length;
      sort012(a,n);
      print(a,n);
    }
      
    

  }
