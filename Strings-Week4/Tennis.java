import java.util.*;
class Tennis
  {
    public static void main(String arg[])
    {
      Scanner sc=new Scanner(System.in);
      String game=sc.nextLine();
      int x=0,y=0;
      for(int i=0;i<game.length()-1;i++)
        {
          if(game.charAt(i)=='0')
            x++;
          else
            y++;
        }
      if(x<y)
        System.out.println("win");
      else
        System.out.println("lose");
    }
  }
          
          
        
        
      
      
    
  