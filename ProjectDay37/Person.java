import java.util.*;
class Person implements Comparable<Person>
  {
    int age;
  
    String name;
Person(int age,String name)
  {
    this.age=age;
  this.name=name;
    
  }
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
  }
  }
class Personmain
  {
    public static void main(String args[])
    {
      List<person> fru=new ArrayList<personm>();
      fru.add(new person(4,"abc"));
      fru.add(new  person(45,"def"));
       fru.add(new  person(85,"gjg"));
      Collections.sort(fru);
        for(personmain e:fru)
      System.out.println(e.toString());
    }
  }
    
  }