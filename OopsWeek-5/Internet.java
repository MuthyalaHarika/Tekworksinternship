import java.util.*;
class Internet
  {
    String username;
    int password;
    String IFSC;
     
    Internet(String s,int y)
    {
      username=s;
      System.out.println(s);
      password=y;
      System.out.println(y);
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the IFSc code");
      IFSC=sc.nextLine();
      System.out.println(IFSC);
    }
  void Statebank()
    {
      if (username=="xxxx" && password==12345678 )
      {
        System.out.println("user is matched");
      }
      else
        System.out.println("user is unmatched");
    }
  }
class account
  {
    public static void main(String arg[])
    {
      Internet e=new Internet("xxxx",12345678);
     e.Statebank();
    }
  }