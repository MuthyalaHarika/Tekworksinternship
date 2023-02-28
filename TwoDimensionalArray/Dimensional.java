import java.util.*;
class Dimensional
  {
   
public static void main(String[] r)
    {
    Scanner s=new Scanner(System.in);
        System.out.print("enter the row size:");
      int row=s.nextInt();
      System.out.print("enter the coloumn size:");
      int column=s.nextInt();
   int array[][]=new int[row][column];
      System.out.print("enter the array elemnts:");
 for(int i=0;i<row;i++)
      {
        for(int j=0;j<=column;j++)
          {
            array[i][j]=s.nextInt();
      }
      }
        
        }
      
      
    }
  }
 