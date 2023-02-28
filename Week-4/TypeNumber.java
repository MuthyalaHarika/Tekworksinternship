import java.util.*;
class TypeNumber
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
      elements(array,size);
        }
    public static void elements(int array[],int size)
    {
      int p=0,q=0,r=0,s=0,s1=0;
      
      
      for(int i=0;i<=size-1;i++)
        {
      if(array[i]<0)
        p++;
      else if(array[i]>0 && array[i]%2==0)
        q++;
      else if(array[i]>0 && array[i]%2!=0)
        r++;
          else if(array[i]>0 && primegenerator(array[i]))
            s++;
          else 
            s1++;
           }
    System.out.println("postive: "+p);
    System.out.println("negitive:"+q);
    
      System.out.println("zero:"+r);
      System.out.println("even:"+s);
      System.out.println("odd:"+s1);
        
    }
    public static boolean primegenerator(int n)
    {
      for(int i=2;i<n;i++)
        {
          if(n%i==0)
          {
            return false;
          }
        }
      return true;
    }
          
        
    }
  