import java.util.*;
class Travelling
  {
    public static void main(String arg[])
    {
      Scanner t=new scanner(System.in);
      System.out.println("enter the no.of elements in an array");
      int Distance;
      Distance=t.nextInt();
      int Travelling[]=new int[Distance];
      System.out.println("enter the array elements");
      for(int d=0;d<=Distance-1;d++)
        Travelling[d]=s.nextInt();
      DisplayArrayElements(Distance,Travelling);
    }
     void displayArrayElements(int a[],int d)
    {
      for (int h:a)
        System.out.println(a[d-1])
    }
      
    
    }
  