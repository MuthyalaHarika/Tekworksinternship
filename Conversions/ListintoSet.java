import java.util.*;
class ListintoSet
  {
    public static void main(String arg[])
    {
      List l=new ArrayList();
      l.add(1);
      l.add(2);
      l.add("hhh");
      l.add(56);
      Set s=new HashSet(l);
      for(Object c:s)
        {
          System.out.println(c);
        }
      List<String>list=new ArrayList<>();
      list.add("hhh");
      list.add("mmm");
      list.add("abc");
      Set<String>s1=new HashSet(list);
      for(String s2:s1)
        {
          System.out.println(s2);
        }
    }
  }
