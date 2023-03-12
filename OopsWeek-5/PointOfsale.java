import java.util.*;
class Product
  {
    String name;
    int price;
    int quantity;
    Product(String n1,int n2,int n3)
    {
      name=n1;
      price=n2;
      quantity=n3;
    }
    public static void setDetails()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the name of product");
      String name=sc.nextLine();
      System.out.println("enter the price of product");
      int price=sc.nextInt();
      System.out.println("enter the quality of product");
      int quantity=sc.nextInt();
      
    }
    public static void getName()
    {
      String name="gagracholli";
        System.out.println(name);
    }
    public static void getPrice()
    {
      int price=1000;
      System.out.println(price);
    }
    public static void getQuantity()
    {
      int quantity=5;
      System.out.println(quantity);
    }

  }
public class PointOfsale
  {
    public static void main(String arg[])
    {
      Product p=new Product("gagracholli",1000,5);
      p.setDetails();
      p.getName();
      p.getPrice();
      p.getQuantity();
    }
  }