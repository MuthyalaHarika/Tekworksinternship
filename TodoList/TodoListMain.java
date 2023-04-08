import java.util.*;
class TodoListMain
  {
    public static void main(String arg[])
    {
      char ch;
      int option;
      Scanner sc=new Scanner(System.in);
      TodoListImp t=new TodoListImp();
      System.out.println("1.add any task");
      System.out.println("2.edit any task");
      System.out.println("3.delete any task");
      do
        {
          System.out.println("enter your choice");
          option=sc.nextInt();
          switch(option)
            {
              case 1:t.add();
                break;
              case 2:t.edit();
                break;
             case 3:t.delete();
                break;
        
                System.out.println("Invalid option");
            }
          System.out.println("do you want to continue one more operation");
          ch=sc.next().charAt(0);
           }
        while(ch!='n');
        }
    }
  