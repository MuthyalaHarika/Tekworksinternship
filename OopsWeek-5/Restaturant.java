import java.util.*;
class Dish
  {
    String name;
   String ingredients;
    double price;
    Dish(String n1,String n2,double n3)
    {
      name=n1;
     ingredients=n2;
       price=n3;
    }
    
    public static void setDetails()
      {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the name");
      String name=sc.nextLine();
      System.out.println("enter the ingredients");
      String ingredients=sc.nextLine();
      System.out.println("enter the price");
      double price=sc.nextDouble();
       }
        public static void getName()
          {
          String name="Chickenfry";
          System.out.println(name);
          }
        public static void getIngredients()
          {
          String ingredients="raw chicken,oil,gingerpaste,termaric powder,salt,masala";
          System.out.println(ingredients);
          }
       public static void getPrice()
         {
         double price=250.5;
         System.out.println(price);
         }
  }
  class Restaturant
   {
   public static void main(String arg[])
     {
     Dish D=new Dish("Chickenfry","raw chicken,oil,gingerpaste,termaric powder,salt,masala",250.5);
     D.setDetails();
      D.getName();
       D.getIngredients();
       D.getPrice();
     }
  }

    
  