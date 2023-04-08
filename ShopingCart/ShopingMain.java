import java.util.*;
class ShopingMain
  {
    public static void main(String arg[])
    {
      char ch;
      int choice;
      Scanner sc=new Scanner(System.in);
      ShopingImp Sob=new ShopingImp();
      System.out.println("1.Add items");
       System.out.println("1.Remove items");
       System.out.println("1.Display items");
       System.out.println("1.total cost of items");
       System.out.println("Enter your choice:");
      choice=sc.nextInt();
      switch(choice)
        {
          case 1:
            Sob.add();
            break;
            case 2:
            Sob.remove();
            break;
            case 3:
            Sob.display();
            break;
            case 4:
            Sob.total_cost();
            break;
             System.out.println("Invalid option");
            break;
             System.out.println("Do you want to perform another operation:");
            ch=sc.next.charAt(0);
        }
      while(ch!='n');
    }
  }
            
            
            
            
        
      
