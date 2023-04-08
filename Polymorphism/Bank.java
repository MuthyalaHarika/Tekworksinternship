import java.util.*;

class RBI 
{

  public void display(String s1) {
    if (s1 == "Savings") {
      System.out.println("valid account");
    } else {
      System.out.println("invalid account");
    }

  }

  public void interest(int minimuminterest, long balanceallow)
  {
    if (balance_allow > 20000) 
    {
      double total = balanceallow + minimuminterest;
    } else 
    {
      System.out.println("no interest");
    }
  }
  public void with_draw(long withdrawllimit) {
    if (withdrawllimit <= 50000) {
      System.out.println("proceed");
    } else {
      System.out.println("please enter valid cash");
    }
  }
}

class customer extends RBI {
  public void show() {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the customer name:");
    String name = sc.next();
    System.out.println("enter the customer number:");
    long accnum = sc.nextLong();
  }

}

class Account extends RBI {
  String account;

  public void account() {
    Scanner sc = new Scanner(System.in);
    account = sc.next();
  }

  public void acc_type() {
    if (account == "Savings") {
      double intersest = 0.04;
    }
  }
}

class SBI extends RBI {
  public void display(String s1) {
    if (s1 == "Savings") {
      System.out.println("valid account");
    } else {
      System.out.println("invalid account");
    }
  }

  public void interest(int minimuminterest, long balanceallow) {

    if (balanceallow > 20000) {
      double t = balanceallow + minimuminterest;
    } else {
      System.out.println("no interest");
    }

  }

  public void withdraw(long withdrawllimit) {
    if (withdrawllimit <= 50000) {
      System.out.println("proceed");
    } else {
      System.out.println("please enter valid cash");
    }
  }
}

class ICICI extends RBI {
  public void display(String s1) {
    if (s1 == "Savings") {
      System.out.println("valid account");
    } else {
      System.out.println("invalid account");
    }
  }

  public void interest(int minimuminterest, long balanceallow) {

    if (balanceallow > 20000) {
      double total = balanceallow + minimuminterest;
    } else {
      System.out.println("no interest");
    }

  }

  public void withdraw(long withdrawllimit) {
    if (withdrawllimit <= 50000) {
      System.out.println("proceed");
    } else {
      System.out.println("please enter valid cash");
    }
  }
}

class PNB extends RBI {
  public void display(String s1) {
    if (s1 == "Savings") {
      System.out.println("valid account");
    } else {
      System.out.println("invalid account");
     }
  }

  public void interest(int minimuminterest, long balanceallow) {

    if (balanceallow > 20000) {
      double total = balanceallow + minimuminterest;
    } else {
      System.out.println("no interest");
    }

  }

  public void with_draw(long withdrawl_limit) {
    if (withdrawl_limit <= 50000) {
      System.out.println("proceed");
    } else {
      System.out.println("please enter valid cash");
    }
  }
}

class MainBank {
  public static void main(String[] args) {
    RBI rb = new RBI();
    customer c = new customer();
    Scanner s = new Scanner(System.in);
    System.out.println("enter the bank type:");
    String s1 = new String(s.next());
    System.out.println("enter the minimum interest of RBI");
    int minimuminterest = s.nextInt();
    System.out.println("enter the minimum balance allowed of RBI");
    long balanceallow = s.nextLong();
    System.out.println("enter minimumwithdrawl limit:");
    long withdrawllimit = s.nextLong();
    rb.display(s1);
    rb.with_draw(withdrawllimit);
    rb.interest(minimuminterest, balanceallow);
    c.show();

  }
}
