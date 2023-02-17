import java.util.*;
class Scissors
  {
    public static void main(String args[])
    {
      char letter;
      Scanner keyboard=new Scanner(System.in);
      String computerHand;
      String userHand;
      do
        {
          computerHand=computerHand();
          userHand=userHand();
          String winner(userHand;computerHand)
          System.out.println(winner);
          System.out.println("you choose"+userHand+".");
          System.out.println("the computer was"+computerHand+".");
          System.out.println("would you loke to play again");
          String answer=keyboard.nextLine();
          letter=answer.charAt(0);
        }
        while (letter !='N' && letter !='n');
    }
    public static String userHand()
    {
      System.out.println("lets play the rock paper scissor game 1.rock,2.paper,3.scissor");
      int userChoice;
      Scanner keyboard=new Scanner(System.in);
      userChoice=keyboard.nextInt();
      returns masterChoice(userChoice);
      
    }
         public static String computerHand()
    {
      Random randomNum=new Random();
      int computerGenerator=randomNum.nextInt(3)+1;
      return masterChoice(computerGenerator);
      
    }
         public static String masterChoice(int num)
    {
      String choice=null;
      if (num==1){
        choice="rock";
      }
      else if(num==2){
        choice="paper";
        
      }
      else if(num==3){
        choice ="scissors";
      }
      return choice;
    
    }
    public static String winner(String computerChoice,String 
       userChoice)
    {
      computerChoice=computerHand();
      userChoice=userHand();
      String winner=null;
      if(userChoice("rock") && computerChoice("scissors")){
        winner="Rock beats scissors,you win";
        
      }
      else if(userChoice("rock") && computerChoice("paper")){
        winner="Rock loses to paper,you lose";
        
      }
      else if(userChoice("rock") && computerChoice("rock")){
        winner="its tie";
        
      }
      else if(userChoice("paper")&& computerChoice("scissors")){
        winner="paper loses to scissors you lose";
        
      }
      else if(userChoice("scissors") && computerChoice("rock")){
        winner="scissors loses to rock";
        
      }
      return winner;
    }
        }
      
    
      
          
          
        
    
    
    
      