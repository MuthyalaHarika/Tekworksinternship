import java.util.*;
class Guessing
{
  public static void main(String arg[])
  {
    char choice;
    int p=1;
    do
    {  
    Scanner s=new Scanner(System.in);
      System.out.println("enter the number");
    int guessnumber=s.nextInt();
    Random r=new Random();
    int randomnumber=r.nextInt(100);
     System.out.println("enter the random number is:");
     int number=s.nextInt();
      if(number==guessnumber)
      {
        System.out.println("Congratulations! you win the game");
        
      }
      else if(number!=guessnumber)
      {
        System.out.println("Shut!you lose the game");
      }
          
      System.out.println(" Do you continue the game");
      choice=s.next().charAt(0);
    }
    while(choice!=p);
    
  }
}
  
   
       
      
    
  
