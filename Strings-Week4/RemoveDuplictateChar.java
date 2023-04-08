import java.util.*;
class RemoveDuplictateChar
  {
    public static void removeduplicate(char string[],int size)
    {
      int index=0;
      for(int i=0;i<size;i++)
        {
          int j;
          for(j=0;j<i;j++)
            {
              if(string[i]==string[j])
              {
                break;
              }
            }
          if(j==i)
          {
            string[index++]=string[i];
            
          }
        }
      System.out.println(String.valueOf(Arrays.copyOf(string,index)));
    }
    public static void main(String arg[])
    {
      Scanner string=new Scanner(System.in);
      System.out.println("enter the size of string");
      String Duplicate=string.nextLine();
      char string[]=string.toCharArray();
      int size=string.size;
      removeduplicate(string,size);
    }
    


      
            
        
    }
  