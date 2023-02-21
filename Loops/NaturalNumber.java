import java.util.*;
  class NaturalNumber
    {
  public static void main(String[] args) {
    
  Scanner s=new Scanner(System.in);
  System.out.print("Please enter n:");
  int n=s.nextInt();
    
    while(n!=0)
      {
        System.out.print(n+"  ");
        n--;
      }
  }
}