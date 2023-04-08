import java.util.*;
class LinearSearch
  {
    public static int linearsearch(int array[],int first,int last,int key)
    {
    for(int i=0;i<array.length;i++)
  {
    
    if(array[i]==key)
    {
      return i;
    }
  
  }
    }
    public static void main(String arg[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the array elements");
        int array1[]=new array1[5];
      array1=sc.nextInt();
      System.out.println("enter the key value");
      int key=sc.nextInt();
      System.out.println(key+"is found at index:"+linearsearch(array1,key));
    }
  }