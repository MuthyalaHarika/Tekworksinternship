import  java.util.*;
class Example
  {
    public static void main(String arg[])
    {
      LinkedList i=new LinkedList();
      Enumaration r=y.element();
      while(r.hasMoreElements())
        {
          System.out.println(r.nextElement());
        }
      iterator r=y.interator();
        while(r.hasNext())
{
 
System.out.println(r.next());
}
 
ListIterator r=y.listIterator();
while(r.hasNext())
{
 
System.out.println(r.next());
}
      i.add(1);
      i.add(2);
      i.add(3);
      i.add("ABC");
      i.add("GHI");
      System.out.println(i);
      i.addFirst('a');
        i.addLast('z');
        System.out.println(i.getFirst());
       System.out.println(i.getLast());
      System.out.println(i);
      i.removeFirst();
      System.out.println(i);
      i.removeLast();
      System.out.println(i);
        
    }
  }
  
