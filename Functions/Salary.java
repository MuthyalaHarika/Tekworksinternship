class Salary
{
  public static void number(int HRA, int DA,int gross,int sal)
  {
  if(sal<=10000)
         {
           HRA=sal*80/100;
            DA=sal*20/100;
           gross=sal+HRA+DA;
           System.out.println("gross");

          }
        
     else if(sal<=20000)
        {
          HRA=sal*90/100;
          DA=sal*25/100;
          gross=sal+HRA+DA;
        System.out.println("gross");
        }
    else if(sal>20000)
         {
           HRA=sal*95/100;
           DA=sal*30/100;
           gross=sal+HRA+DA;
           System.out.println("gross");
         }
      else
          System.out.println("no gross");
  }
  public static void main(String arg[])
  {
    Scanner s=new Scanner(System.in);
    sal=s.nextInt();
    HRA=s.nextInt();
    DA=s.nextInt();
    gross=s.nextInt();
    Salary y=new Salary();
    y.number(sal,HRA,gross,DA);
  }
