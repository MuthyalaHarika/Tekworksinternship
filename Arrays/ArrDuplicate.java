import java.util.*;
class ArrDuplicate
  {
    public static void findduplicates(int arr[],int size)
    {
      int i,j;
      boolean ifpresent=false;
      ArrayList<Integer>al=new ArrayList<Integer>();
      for (int i=0;i<size-1;i++)
        {
          for(j=i+1;j<size;j++)
            {
              if(arr[i]=arr[j])
              {
                if (al.contains(arr[i]))
                  break;
              }
              else
              {
                al.add(arr[i]);
                ifpresent=true;
              }
            }
        }
      if(ifpresent==true)
      
        System.out.println(al+"");
      
      else
      
        System.out.println("no duplicate present in arrays");
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
      findduplicate(array,size);
    
    }
  }
  