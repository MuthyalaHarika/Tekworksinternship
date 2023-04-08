import java.util.*;
class StringExample
  {
    public static void main(String arg[])
    Scanner scanner=new Scanner(System.in)
     String string=new String();
    System.out.println("enter any string data");
     string=scanner.nextLine();
//retriewing entire string value
   // System.out.println(string);
 //character Extractionmethods()
//4.1 charAt()
 System.out.println(string.charAt(6));
//4.2 getchar()
char p[]=new char[10];
String.getchar(3,6);
System.out.println(p);
for(int i=0;i<p.length;i++)
  System.out.println(p[i]);
//4.3 getByte()
byte b[]=String.getByte();
for(int i=0;i<b.length;i++)
System.out.println(b[i]);
//4.4 charto()
char sca[]=string.toCharArray();
for(int i=0;i<sca.length;i++)
System.out.println(sca[i]);
//String comparision
String string1=new String(scanner.nextLine());
       System.out.println(string.compareto(string1));
       System.out.println(string.equals(string1));
       System.out.println(string=string1);
       System.out.println(string.startsWith("1"));
       System.out.println(string.startsWith("ex"));
       System.out.println(string.endsWith("hello"));  
       System.out.println(string.equalsIgnoreCase(string1));
       System.out.println(string.indexOf('z'));
       System.out.println(string.lastIndex("os"));
       System.out.println(string.indexOf("ii",4));
       System.out.println(string.toLowerCase());
        System.out.println(string.toUpperCase());
        System.out.println(string.substring(3));
        System.out.println(string.substring(3,4));
        System.out.println(string.replace("c","3"));

}
  
   
