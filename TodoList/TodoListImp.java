import java.util.*;
class TodoListImp implements TodoListInterface
  {
    Scanner sc=new Scanner(System.in);
    void add()
    {
      LinkedList l=new LinkedList();
      System.out.println("enter the number how many tasks do you want");
      int tasks=sc.nextInt();
      String t;
      for(int i=0;i<tasks;i++)
        {
          t=sc.next();
          l.add(t);
        }
      ListIterator r=l.listIterator();
      while(r.hasNext())
        {
          System.out.println(r.next());
        }
    }
      void edit()
        {
        System.out.println("enter the task do you want to edit");
          String edittask=sc.next();
          l.add(edittask);
          ListIterator r=l.listIterator();
          while(r.hasNext())
            {
              System.out.println(r.next());
            }
        
        }
    void delete()
        {
        System.out.println("enter the task do you want to delete");
          String deletetask=sc.next();
          ListIterator r=l.listIterator();
          l.remove(deletetask);
          while(r.hasNext())
            {
              System.out.println(r.next());
            }
        
        }
    
    }
  