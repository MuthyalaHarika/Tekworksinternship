import java.util.*;
class SettoList
  {
    public static void main(String arg[])
    {
      Set p=new HashSet();
      p.add(300);
      p.add(500);
      p.add("hhh");
      p.add("mmm");
      List l=new ArrayList(p);
      Iterator i=l.iterator();
      while(i.hasNext())
        {
          System.out.println(i.next());
        }
    }
  }