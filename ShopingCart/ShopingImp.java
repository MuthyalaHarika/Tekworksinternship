import java.util.*;
class ShopingInterface
  {
    Scanner sc=new Scanner(System.in);
    ArrayList<ShopingData>Sb=new ArrayList<>();
    double[] costTotal=new double[10];
    public void add()
    {
      System.out.println("enter the items with cost and item quality");
      String in=sc.nextLine();
      double ic=sc.nextDouble();
      char ig=sc.next.charAt(0);
      Sb.add(new ShopingData(in,ic,ig));
      
    }
    public void remove()
    {
      if(Sb.size()==0)
      {
        System.out.println("no item available for deleting the data");
        
      }
      else{
        String verify =null;
        System.out.println("enter the name of the item to be remove from the data");
       String itemr = sc.next();
        for(ShoppingData e : Sb)
        {
          if(e.getItem_name().equals(itemr))
          {
            sd.remove(e);
            verify = "found";
            break;
          }
        }
        if(verify == null){
          System.out.println("already removed the item data from the database");
        }
      }
    }
    public void display()
    {
      if(sd.size() == 0){
        System.out.println("no data available for display the items");
      }else{
        Iterator itr = sd.iterator();
        while(itr.hasNext()){
          System.out.println(itr.next());
        }
      }
    }
    public void total_cost()
    {
      double cost_count = 0;
      for(ShoppingData e : sd)
      {
        for( i=0;i<sd.length;i++)
        {
        int i = 1;
        cost_count = e[i] + cost_count;
      }
      System.out.println("the total cost of the items :" + cost_count);
      }
      
    }
  }
