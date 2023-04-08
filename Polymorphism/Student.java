import java.util.*;
class student
  {
    String name;
    int age;
    String address;
    student()
    {
      this.name="unknown";
     this. age=0;
     this. address="not available";
    }
    void setInfo(String name,int age)
    {
      this.name=name;
      this.age=age;
      
    }
     void setInfo(String name,int age,String address)
    {
      this.name=name;
      this.age=age;
      this.address=address;
    }
    public void displayInfo()
    
    {
  
      System.out.println(" Name:"+name);
    
      System.out.println("Age:"+age);
    
      System.out.println("Address:"+address);
    
    }
  }
public static void main(String arg[])
  {
  Student student1=new Student();
  student1.setInfo("Harika",20,"AbcColony");
  student1.displayInfo();
  Student student2=new Student();
 student2student2.setInfo("lucky",15);
  student2student2.displayInfo();
  
  }

