package mypack.archie;

import java.util.*;
abstract class Sweets{
	 float cost,weight;
	public Sweets(float cost,float weight)
	{
		this.cost=cost;
		this.weight=weight;
	}
	abstract void display();
}

class Barfi extends Sweets{
	public Barfi(float cost ,float weight)
	{
		super(cost,weight);
	}
	void display()
	{   System.out.println("Barfi's cost:"+ "Rs"+cost);
		System.out.println("Barfi's weight:"+weight+"kg");
	}
}

/*class  extends Sweets{
	public Rasgulla(int weight)
	{
		super(weight);
	}
	void display()
	{
		System.out.println("Weight of Rasgulla:"+weight+"grams");
	}
}*/

 
abstract class Chocolates {
	
	float price,weight;
	
	public Chocolates(float price,float weight)
	{
		this.price=price;
		this.weight=weight;
	}
	abstract void display();
}
class Candies extends Chocolates{
	 
	public Candies(float price,float weight)
	{
		super(price,weight);
	}
	 void display()
	 {   
		 System.out.println("Candies's cost:"+ "Rs"+price);
		 System.out.println("Candies's weight:"+weight+"g");
	 }
}


class Cadbury extends Chocolates{
	public Cadbury(float price,float weight)
	{
		super(price,weight);
	}
	void display()
	{
		
		 System.out.println("Cadburies's cost:"+ "Rs"+price);
		 System.out.println("Cadburies's weight:"+weight+"g");
	}
}

public class NewYearGift {

	public static void main(String[] args) {
		int b,c,i;
		float b_cost,b_wght,total_wght=0,c_wght,c_price,total_weight=0,sum=0,cad_price,cad_wght;
		System.out.print("Enter the no. of  Barfi's in the gift:");
		Scanner sc=new Scanner(System.in);
		b=sc.nextInt();
		ArrayList<Sweets> list=new ArrayList<Sweets>();
		
		for(i=0;i<b;i++)
		{   System.out.println("Enter the Cost and Weight of Barfi "+(i+1)+":");
			b_cost=sc.nextFloat();
			b_wght=sc.nextFloat();
			total_wght=total_wght+b_wght;
			Sweets obj=new Barfi(b_cost,b_wght);
			obj.display();
			
			list.add(obj);
		}
		System.out.println("Total Weight of Barfi:"+total_wght+"kg");
		
		System.out.print("Enter the number of Candies in the gift:");
		c=sc.nextInt();
		ArrayList<Chocolates> list2=new ArrayList<Chocolates>();
		
		for(i=0;i<c;i++)
			{ System.out.println("Enter the Price and Weight  of Candy"+(i+1)+":");
			c_price=sc.nextFloat();
			c_wght=sc.nextFloat();
			total_weight+=c_wght;
			Chocolates choco=new Candies(c_price,c_wght);
			choco.display();
			list2.add(choco);
		}
		System.out.println("Total Weight of Candies:"+total_weight+"g");
		
		System.out.print("Enter the number of Cadburies in the gift:");
		c=sc.nextInt();
		ArrayList<Chocolates> list3=new ArrayList<Chocolates>();
		
		for(i=0;i<c;i++)
		{   System.out.println("Enter the Price and  Weights of Cadbury"+(i+1)+":");
			cad_price=sc.nextFloat();
			cad_wght=sc.nextFloat();
			sum=sum+cad_wght;
			Chocolates cad=new Cadbury(cad_price,cad_wght);
			cad.display();
			list3.add(cad);
		}
		System.out.println("Total Weight of Cadbury:"+sum+"g");
		System.out.println("Total Weight of Chocolates in the gift:"+(sum+total_weight)+"g");
		
		
		Collections.sort(list2,new Comparator<Chocolates>()
		{
			public int compare(Chocolates c1,Chocolates c2)
			{
				return Float.valueOf(c1.price).compareTo(c2.price);
			}
		});
		System.out.println("Price of Candies in increasing order :");
		for(i=0;i<list2.size();i++)
			System.out.println(list2.get(i).price);
		
		Collections.sort(list3,new Comparator<Chocolates>()
		{
			public int compare(Chocolates c1,Chocolates c2)
			{
				return Float.valueOf(c2.weight).compareTo(c1.weight);
			}
		});
		System.out.println("Weight of Cadburies in decreasing order :");	
	for(i=0;i<list3.size();i++)
			System.out.println(list3.get(i).weight);
	Collections.sort(list,new Comparator<Sweets>()
	{
		public int compare( Sweets s1,Sweets s2)
		{
			return Float.valueOf(s1.cost).compareTo(s2.cost);
		}
	});
	System.out.println("Price of Barfi in increasing order :");
	for(i=0;i<list.size();i++)
		System.out.println(list.get(i).cost);
	
		
    sc.close();
	}

}
