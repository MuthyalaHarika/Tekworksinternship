import java.util.*;
class ItemException extends Exception
  {
    public ItemException(String message)
    {
      super(message);
    }
  }
class Item
  {
    String itemname;
    int price;
    int num;
    String[] I;
    void getName()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the itemname");
      try
        {
          itemname=sc.nextLine();
        }
      catch(InputMismatchException m)
        {
          System.out.println("item name must be in alphablets:");
        }
    }
    void getIngredients()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the no.of ingredients:");
      int ingredients=sc.nextInt();
      String ingredients[]=new String(ingredients);
      System.out.println("enter the ingredients:");
      for(i=0;i<=ingredients.length-1;i++)
        {
          ingredients[i]=sc.nextLine();
        }
    }
    void addItem()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the no.of items:");
      num=sc.nextInt();
      I=new String[num];
      for(int i=0;i<num;i++)
        {
          I[i]=sc.nextLine();
        }
      for(int i=0;i<num;i++)
        {
          if(I[i]==itemname)
          {
            try
              {
                throw new ItemException("item is alraedy prepared:");
              }
            catch(itemException ee)
              {
                System.out.println(ee);
              }
          }
          else
          {
            System.out.println("item is added:");
          }
        }
    }
    void removeItem()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the item to be removed:");
      String itemname=sc.nextline();
      for(int i=0;i<I.length-1;i++)
        {
          try
            {
              throw new ItemException("item is already removed");
            }
          catch(ItemException rr)
            {
              System.out.println(rr);
            }
        }
      else
      {
        System.out.println("item is removed");
      }
    }
  }
void getPrice()
  {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the price:");
  try
    {
      price=sc.nextInt();
    }
  catch(inputMismatchException pp)
    {
      System.out.println("enter the valid price:");
    }
  }
class Restaturant
  {
    public static void main(String arg[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number of items:");
      int num_items=sc.nextint();
      Item di[]=new Item[numitems];
      for(int i=0;i<=numitems-1;i++)
        {
          di[i]=new Item();
          di[i].getName();
          di[i].getIngredients();
          di[i].addItem();
          di[i].removeItem();
          di[i].getPrice();
          
        }
    }
  }