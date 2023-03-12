//ava.ut. Shapes: Create a class called Shape that has properties such as color and a method to calculate the area. Create subclasses such as Rectangle, Triangle, and Circle that inherit from Shape and override the area calculation method. Create a class called ShapeTester that creates objects of the different shape classes and calls the area calculation method on them.
 import java.util.*;
class Shape
  {
    String color;
    Shape(String color)
    {
      this.color=color;
    }
    double calculateArea();
  }
 calss Rectangle extends Shape
  {
     double width;
    double height;
  Rectange(String color,double width,double height)
    {
      this.width=width;
      this.height=height;
    }
  double calculateArea()
    {
     RectangleArea=width*height;
    System.out.println(RectangleArea);
    }
  }
class Triangle extends Shape
  {
    double height;
    double base;
    Triangle(String color,double base,double height)
    {
      this.height=height;
      this.base=base;
    }
    double calculateArea()
    {
      TriangleArea=0.5*height*base;
      System.out.println(TriangleArea);
    }
  }
class Circle extends Shape
  {
    double radius;
    Circle(String color,double radius)
    {
      super(color);
      this.radius=radius;
    }
    double calculateArea()
    {
      CircleArea=3.14*radius*radius;
      System.out.println(CircleArea);
    }
      
    }
class ShapeTesterMain
     {
       public static void main(String arg[])
       {
         Shape a=new Shape(color);
         rectangle r=new rectangle("pink",10,7);
         System.out.println("Rectangle area"+ rectangle.calculateArea());
          triangle t=new triangle("red",9,8);
        System.out.println("Triangle area"+ triangle.calculateArea());
          circle c=new circle("blue",4);
       System.out.println("Circle area"+ circle.calculateArea());
    }
 }

  