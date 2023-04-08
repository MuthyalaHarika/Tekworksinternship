import java.util.*;
 class Employee
   {
     String name;
     double salary;
 public Employee(String name, double salary) throws Exception 
  {
        if (salary < 3.5)
        {
           throw new Exception("Salary will must and should minimum wage");
        }
          this.name = name;
          this.salary = salary;
  }

    public String getName()
     {
        return name;
     }

    public double getSalary() 
     {
        return salary;
    }
}
 class  Company 
 {
   
    String[] s=new String[4];
   void addemployee()
   {
     
   Scanner sc=new Scanner(System.in);
    System.out.println("enter the number of employee:");
    
    
     for(int i=0;i<4;i++)
       {
         s[i]=sc.next();
       }
    }
  void removeemployee()
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the name of employee to be removed:");
      String removeEmployee=sc.next();
     for(int j=0;j<=s.length-1;j++)
       {
         if(s[j]==removeEmployee)
         {
            System.out.println(s[j]);
         }
       }
   }
   void displayEmployees()
   {
     System.out.println("display employees:");
     for(int k=0;k<=s.length-1;k++)
       {
         System.out.println(s[k]);
       }
   }
    class Company
     {
  public  void main(String[] args)
  {
    Employee e=new Employee("harika",3.5);  
    e.addemployee();
    e.removeemployee();
    e.displayEmployees();
    System.out.println(e.getName());
    System.out.println(e.getSalary());
  }
}