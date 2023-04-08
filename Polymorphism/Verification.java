import java.util.*;
interface Number
  {
    boolean isZero();
    boolean isPositive();
    boolean isNegitive();
    boolean isOdd();
    boolean isEven();
    boolean iPrime();
    boolean isAmstrong();
  }
   class operator implements Number
     {
       public boolean isZero(int a)
       if(a==0)
   {
       System.out.println("the given number is Zero");
        return true;
       }
      else
           return false;
}
       public boolean isPositive(int b)
         {
          if(b>0)
          {
            System.out.println("the number is positive");
            return true;
          }
         else
           return false;
         }
       
           public boolean isNegitive(int c)
              {
                if(c<0){
                 System.out.println("number is negitive");
                  return true;
                }
             else
           {
             System.out.println("is not a negitive ");
             return false;
           }
              }
         public boolean isOdd(int d)
           {
             if(d%2!=0){
               System.out.println("number is odd");
               return true;
              }
          else
           return false;
           }
      public boolean isEven(int e)
        {
        if(e%%2==0)
              {
            System.out.println("number is even");
              return true;
        }
        else
          return false;
         }
     public boolean isPrime(int f)
       {
       int i=0,n=0,p=0;
         n=f/2;
       if(f==0||f==1){
         System.out.println("number is not a prime");
         return false;
       
       }
       else
       {
         for(i=2;i<=n;i++)
           if(f%i==0)
           {
             System.out.println("is not a prime");
             p=1;
             return false;
           }
         
       }
       if(p==0)
       {
         System.out.println("is a prime number");
         return true;
       }
       }
      public boolean isAmstrong(int g)
           {
            int s,r=0,t=g;
            r=r+(s*s*s);
            g=g/10;
                        }
           if(t==r)
           {
             return false;
           } 
           return true;
           }
  
}
   class VerificationMain
     {
       public static void main(String arg[])
       {
         Scanner sc=new Scanner(System.in);
         int a=sc.nextInt();
         int b=sc.nextInt();
         int c=sc.nextInt();
         int d=sc.nextInt();
         int e=sc.nextInt();
         int f=sc.nextInt();
         operator O=new operator();
       boolean res=  O.isZero(a);
         System.out.println(res);
        boolean result= O.isPostive(b);
         System.out.println(result);
        boolean r= O.isNegitive(c);
         System.out.println(r);
       boolean r1=  O.isOdd(d);
         System.out.println(r1);
        boolean r2= O.isEven(e);
         System.out.println(r2);
       boolean r3=  O.isPrime(f);
         System.out.println(r3);
         }
     }
      