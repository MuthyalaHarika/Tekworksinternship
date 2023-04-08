import java.util.*;
class MapToSet
  {
    public static void main(String[] args)
    {
       Map<Integer,String> m=new HashMap<>();
      m.put(1,"Bobby");
      m.put(2,"lucky");
      m.put(3,"pinky");
      m.put(4,"lovely");
      Set<Integer> s1= new HashSet<Integer>(m.keySet());
      Set<String> s2= new HashSet<String>(m.values());
      System.out.println(s1);
      System.out.println(s2);
    }
  }