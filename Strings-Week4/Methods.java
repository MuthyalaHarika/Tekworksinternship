import java.util.*;
class StringExample
  {
    public static void main(String arg[])
    Scanner scanner=new Scanner(System.in)
     String string=new String();
    System.out.println("enter any string data");
     string=scanner.nextLine();
//retriewing entire string value
    System.out.println(string);
 //1.length()
       System.out.println(string.length());
       int len=string.length();
       System.println("len");
    //2.concat()
      System.out.println(string.concat("hai"));
      String s2="harika";
     System.out.println(string.contact(s2));
    System.out.println(string);
  // 3.+ operator()
           System.out.println(string+hai2);
           System.out.println(string+s2);
           System.out.println(string+2);

//4.to string()
           System.out.println(string.toString);
           StringExample se=new StringExample();
          System.out.println(se.toString);


      
  }