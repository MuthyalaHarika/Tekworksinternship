import. java.util.Scanner;
class SD
{}
    public static void main(String arg[])
    {
      String name;
      int roll, math,phy,chem;
      Scanner SC=new Scanner(System.in);
      System.out.println("Enter Name: ");
      name=SC.nextLine();
      roll=SC.nextInt();
      math=SC.nextInt();
      phy=SC.nextInt();
      chem=SC.newInt();
      int total=math+phy+chem;
      float perc=(float)total/300*100;
      System.out.println("Roll Number:"+name);
      System.out.printl("Marks (Math,Physics,Chemistry)"):"math"+"phy"+"chem");
      System.out.println(total/percentage);
    }
  }