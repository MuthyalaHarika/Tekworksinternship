import java.util.*;
class UpperTriangle
  {
     public static void upperelements(int array[][],int row, int column)
    {
  System.out.println("Display the upper values in a matrix:");
      for(int i=0;i<row;i++)
        {
          for(int j=0;j<column;j++)
            {
              if(i<j)
              {
                System.out.println(array[i][j]+" ");
                System.out.println();
              }
            }
        }
      
    }

    public static void main(String arg[])
    {
      Scanner s=new Scanner(System.in);
        System.out.print("enter the row size:");
      int row=s.nextInt();
      System.out.print("enter the coloumn size:");
      int column=s.nextInt();
      int array[][]=new int[row][column];
      System.out.println("enter the array elements");
      for(int i=0;i<row;i++)
        {
          for(int j=0;j<column;j++)
            {
              array[i][j]=s.nextInt();
            }
        }
     upperelements(array,row,column);
    }
  }
    