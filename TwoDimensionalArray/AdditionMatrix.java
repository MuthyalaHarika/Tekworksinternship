import java.util.*;
class AdditionMatrix
  {
   
public static void main(String arg[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter r1 matrixsize");
      int r1=s.nextInt();
      System.out.println("enter c1 matrixsize");
      int c1 =s.nextInt();
      System.out.println("enter the r2  matrixsize");
      int r2=s.nextInt();
      System.out.println("enter the c2 matrixsize");
      int c2=s.nextInt();
      int array1[][]=new int[r1][c1];
      int array2[][]=new int[r2][c2];
      System.out.println("enter array1 elements: ");
      for (int i=0;i<r1;i++)
        {
          for(int j=0;j<c1;j++)
            {
              array1[i][j]=s.nextInt();
            }
        }
          System.out.println("enter array2 elements:");
          for(int i=0;i<r1;i++)
            {
              for(int j=0;j<c2;j++)
                {
                  array2[i][j]=s.nextInt();
                }
            }
            elements(array1,array2,r1,c1,r2,c2);
        }
    
public static void elements(int array1[][],int array2[][],int r1,int c1,int r2,int c2)
        {
          int d[][]=new int[r1][c1];
          for(int i=0;i<r1;i++)
            {
              for(int j=0;j<c1;j++)
                {
                  d[i][j]=array1[i][j]+array2[i][j];
                 System.out.println(d[i][j]+"");
                }
              System.out.println();
                  
                }
              
        }
    }
    

        
    
    
                
    
              
    
      

