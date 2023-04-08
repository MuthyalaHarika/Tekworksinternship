import java.util.Stack;

class StackusingPredefined 
{
  public static void main(String[] args) 
  {

  
    Stack<Integer> s1= new Stack<>();
    s1.push(10);
    s1.push(20);
    s1.push(30);
    System.out.println("Stack: " + s1);

    s1.pop();
    System.out.println("Stack after pop: " + s1);
    }
}