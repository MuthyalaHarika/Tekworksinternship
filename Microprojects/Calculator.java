
import java.util.*;
class Calculator
  {
    public static void main(String arg[]);
    {
     Scanner s=new Scanner(System.in);
     System.out.println("enter the number");
     int num1=s.nextInt();
     int num2=s.nextInt();
      char option;
       do
         {
           System.out.println("enter the arthmetic operations");
           System.out.println("+: addition ");
           System.out.println("-: subraction");
           System.out.println("*: multiplication");
           System.out.println("/: division");
           System.out.println("%: modulo");
           char op=s.next.charAt(0);
           calculator c=new Scanner(System.in);
           int num3=0;
           switch(op)
             {
               case '+':
                  num3=num1+num2;
                 System.out.println(num3);
                 
                     break;
               case '-':
                 num3=num1-num2;
                 System.out.println(num3);
                 break;
               case '*':
                 num3=num1*num2;
                 System.out.println(num3);
                 break;
               case '/':
                 num3=num1/num2;
                 System.out.println(num3);
                 
                 break;
               case '%':
                 num3=num1%num2;
                 System.out.println(num3);
                 break;
               default:
                   System.out.println("you enter invalid operator");
                 break;
        }
       System.out.println("do you want a perform more 
        operation"); 
        
           option=s.next().charAt(0);
         }while(option !='n');
         }
  
   int addition(int num1,int num2)
      {
        return num1+num2;
      }
       int subraction(int num1,int num2)
       {
         return num1-num2;
       }
        int multiplication(int num1,int num2)
          {
          return num1*num2;
          }
         int division(int num1,int num2)
           {
           return num1/num2;
           
           }
           int modulo(int num1,int num2)
             {
             return num1%num2;
             }
          }
    
  