import java.util.*;
class Example2
  {
    public static void main(String arg[])
    {
   String s="12 erre 47578 90";
StringTokenizer st=new StringTokenizer(s);
System.out.println(st.countToken());
while(st.hasMoreTokens())
{
System.out.println(st.nextToken());
}
    }
  }
