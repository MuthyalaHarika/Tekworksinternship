import java.util.*;
class InvalidUpperCaseException extends Exception
  {
    public InvalidUpperCaseException(String message)
    {
     super(message);
    }
  }
public class Capital 
{
    String arr[];
	public String Stringadd() 
  {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter word");
		String word=sc.nextLine();
    arr[]=word.split(" ");
    return word;
    
		
	}
 void Checkcapital(String word) 
  {
     try
        {
          for(int i=0;i<=arr.length-1;i++)
            {
        if((arr[i].charAt(0)>='A'&&arr[i].charAt(0)<='Z')&&(arr[i].charAt(0)=='A'||arr[i].charAt(0)=='E'||arr[i].charAt(0)=='I'||arr[i].charAt(0)='O'||arr[i].charAt(0)=='U')){
                System.out.println("The given word is starts with an upper case letter that is vowel");
            }  
       else 
    {
  throw new InvalidUpperCaseException("The given word not starts with an upper case letter that is not a vowel");
       }
            }
  }
    catch(Exception e)
            {
               System.out.println(e);
                 
            }
        }
}
  class Main
    {
public static void main(String arg[])
  {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the words");

int numberofwords=sc.nextInt();
    Capital b[]=new Capital[numberofwords];
  for(int i=0;i<numberofwords;i++)
    {
     b[i]=new Capital();
      String word=b[i].Stringadd();
      b[i].Checkcapital(word);
  }

}}
      
  

