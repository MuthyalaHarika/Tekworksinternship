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
//retriewing one character from string
//stringobject.charAt(indexnumber)
System.out.println(charAt(3));
System.out.println(charAt(13));
//retriewing worde from string
//split()---->stringobjectname.split(delimiter)
//
  System.out.println(string.split(""));
  String stringarray[]=string.split("");
   fr(int i=0;i<stringarray.length;i++)
     System.out.println(stringarray);
     
  }