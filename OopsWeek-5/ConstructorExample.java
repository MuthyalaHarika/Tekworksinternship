import java.util.*;
class ConstructorExample
  {
    int num1;
    int num2;
   ConstructorExample(int n1,int n2)
    {
      num1=n1;
      num2=n2;
    }
    {
      System.out.println(num1);
    }
    void getNum2()
    {
      System.out.println(num2);
    }
    void setNum1()
    {
      Scanner sc=new Scanner(System.in);
      num1=sc.nextInt();
    }
    void setNum2()
    {
      Scanner sc=new Scanner(System.in);
      num2=sc.nextInt();
    }
  }
class ConstructorMain
  {
    public static void main(String arg[])
    {
      ConstructorExample ce=new ConstructorExample();
      ce.setNum1();
      ce.setNum1();
      ce.getNum1();
      ce.getNum1();
    }
  }

  