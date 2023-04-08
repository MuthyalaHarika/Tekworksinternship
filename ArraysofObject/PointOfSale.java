import java.util.*;
class ProductpriceException extends Exception
  {
    ProductpriceException(string message)
    {
      super(message);
    }
  }
class Product
  {
    String productname;
    int price;
    int quality;
    void getName();
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the product name:");
      try
        {
          productname=sc.nextLine();
        }
      catch(InputmismatchException e)
        {
          System.out.println("product name should be in alphabets");
          getName();
        }
    }
    void getPrice()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the product price is");
      price=sc.nextInt();
      if(price<0)
      {
        try
          {
            throw new ProductpriceException("price must be greater than zero");
          }
        catch(ProductpriceException p)
          {
            System.out.println(p);
          }
      }
      else
      {
        System.out.println("product price is:"+price);
      }
    }
    void getQuantity()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the Quality:");
      try
        {
          quantity=sc.nextInt();
        }
      catch(InputMismatchException s)
        {
          System.out.println("quality must be in integers:");
          getQuantity();
        }
    }
    void display()
    {
      System.out.println("productname is:"+productname);
      System.out.println("productprice is:"+productprice);
      System.out.println("productquality is:"+productquality);
    }
  }
class PointOfSale
  {
    public static void main(String arg[])
    {
      System.out.println("enter the no.of products:");
      Scanner sc=new Scanner(System.in);
      numberofproducts=sc.nextInt();
      Product p=new Product[numberofproducts];
      for(int i=0;i<numberofproducts;i++)
        {
          p[i]=new product();
          p[i].getName();
          p[i].getPrice();
          p[i].getQuantity();
          p[i].display();
        }
    }
  }

  