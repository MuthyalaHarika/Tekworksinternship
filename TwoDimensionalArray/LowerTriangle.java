import java.util.*;
class LowerTriangle
  {
    public static void triangle(int array[][],int row,int column)
    {
      
      for(int i=0;i<row;i++)
        {
          for(int j=0;j<column;j++)
            {
              if(i>j)
              {
                System.out.println(array[i][j]+"");
             
              System.out.println();
              }
          }
       }
    }
    public static void main(String arg[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the row size:");
      int row=sc.nextInt();
      System.out.println("enter the column size:");
      int column=sc.nextInt();
      int array[][]=new int[row][column];
      System.out.println("enter array elements");
      for(int i=0;i<row;i++)
        {
          for(int j=0;j<column;j++)
        {
          array[i][j]=sc.nextInt();
        }
     }   
  
  triangle(array,row,column);

        }
    }