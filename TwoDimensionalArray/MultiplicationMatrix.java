import java.util.*;
class MultiplicationMatrix
  {
    public static void main(String arg[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the matrix a size");
      int r=sc.nextInt();
      int c=sc.nextInt();
      System.out.println("enter the matrix b size");
      int p=sc.nextInt();
      int q=sc.nextInt();
      int a[][]=new int[r][c];
      int b[][]=new int[p][q];
      int x[][]=new int[c][q];
      if(x==p)
      {
        System.out.println("matrix multiplication is possible");
   System.out.println("enter the array elements of matrix a");
        {
          for(int i=0;i<r;i++)
            {
              for(int j=0;j<c;j++)
              {
                  a[i][j]=s.nextInt();
                }
            }
          System.out.println("the entered elements in matrix are");
          for(int i=0;i<r;i++)
            {
              for(int j=0;j<c;j++)
                {
                  System.out.print(a[i][j]+"");
                }
               System.out.println(); 
            }
        System.out.println("enter the array elements of matrix b");
        {
          for(int i=0;i<p;i++)
            {
              for(int j=0;j<q;j++)
              {
                  b[i][j]=sc.nextInt();
                }
            }
          System.out.println("the entered elements in matrix are");
          for(int i=0;i<p;i++)
            {
              for(int j=0;j<q;j++)
                {
                  System.out.print(b[i][j]+"");
                }
               System.out.println(); 
            }
          for(int i=0;i<c;i++)
            {
              for(int j=0;j<p;j++)

                {
                  x[i][j]=0;
                  for(k=0;k<p;k++)
                    {
                      x[i][j]=x[i][j]+a[i][j]*b[k][j];
                    }
                }
            }
          System.out.println("the resultant matrix x is");
          for(int i=0;i<c;i++)
            {
              for(int j=0;j<p;j++);
              {
                System.out.println("x[i][j]"+"");
                
              }
              System.out.println();
            }
        
           else 
          {
            System.out.println("matrix multiplication is not possible");
          }
        }
      
      
            
