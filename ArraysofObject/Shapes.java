import java.util.*;
class InvalidCurves extends Exeception
  {
    public InvalidCurves(String message)
    {
      super(message);
    }
  }
class Shape
  {
    double raidus;
    double length;
    double breadth;
    double area;
    void AreaOfCircle()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the radius of the circle");
      radius =sc.nextDouble();
      if(radius<=0)
      {
        try
          {
            throw new InvalidCurves("radius must be greater than zero");
          }
        catch(InvalidCurves e)
          {
            System.out.println(e)
          }
      }
      else
      {
        area=3.14*radius*radius;
        System.out.println("area of a Circle:"+area);
      }
    }
    void AreaOfRectangle()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the length and breadth of a rectangle");
      double length =sc.nextDouble();
      double breadth=sc.nextDouble();
      if(length<=0 && breadth<=0)
      {
        try
          {
            throw new InvalidCurves("length and breadth is must be greater than zero");
          }
        catch(InvalidCurves e)
          {
            System.out.println(e)
          }
      }
       else
      {
        area=length*breadth;
        System.out.println("area of a Rectangle:"+area);
      }
    }
     void AreaOfTriangle()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the length and breadth of a rectangle");
      double length =sc.nextDouble();
      double breadth=sc.nextDouble();
      if(length<=0 && breadth<=0)
      {
        try
          {
            throw new InvalidCurves("length and breadth is must be greater than zero");
          }
        catch(InvalidCurves e)
          {
            System.out.println(e)
          }
      }
       else
      {
        area=0.5*(length*breadth);
        System.out.println("area of a Triangle:"+area);
      }
    }
  }
class Shapes
  {
    public static void main(String arg[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the  curve calculation:");
      int s=sc.nextInt();
      Shape sh[]=new Shape[s];
      for(i=0;i<=s;i++)
        {
           sh[i]=new Shape();
          sh[i].AreaOfCircle();
          sh[i].AreaOfRectangle();
          sh[i].AreaOfTriangle();
        }
    }
  }
    
      
  