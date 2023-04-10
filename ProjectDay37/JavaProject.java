import java.util.List;
import java.util.*;
import java.
public class Fruit {
  

	public static void main(String[] args) 
	{
		List<Fruit> li=new ArrayList<>();
		li.add(new Fruit(100,2,9));
    li.add(new Fruit(200,8,9));
    li.add(new Fruit(300,6,5));
		
	}
	class Fruit
	{	  private int price;
	  double weight;
	  Fruit(int price,double weight)
	  {
		  this.price=price;
		  this.weight=weight;
	  }
	public int getPrice() {
		return price;
	}
	
	public double getWeight() {
		return weight;
	}
	public String toString()
	{
		return "price:"+getPrice()+" "+"weight:"+getWeight();  
  }
  }
  public int compareTo(FruitMain fm)
{
	// return this.price - fm.price;
	
	if(this.price<fm.price)return 1;
	else
		if(this.price>fm.price)return -1;
		else return 0;
}
}

class FruitData
{
	public static void main(String arg[])
	{
		List<FruitMain> li=new ArrayList<>();
		li.add(new FruitMain(200,1.5));
		li.add(new FruitMain(150,0.5));
		li.add(new FruitMain(800,4));
		Collections.sort(li);
		
		
		for(FruitMain l : li)
			System.out.println(l.toString());
	}
}

class fruitMain
  {
    public static void main(String arg[])
    {
      List<fruit>fr=new  ArrayList<fruit>();
      
    }
  }
   

}