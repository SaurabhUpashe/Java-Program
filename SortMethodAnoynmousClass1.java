import java.util.*;
class Product
{
	private int id;
	private String name;
	private double price;
	public Product(int id, String name,double price)
	{
		this.name = name;
		this.id = id;
		this.price = price;
	}
	public String getName()
	{
		return name;
	}
	public int getId()
	{
		return id;
	}
	public double getPrice()
	{
		return price;
	}
	public String toString()
	{
		return id+"- "+name+" Rs: "+price;
	}
} 
class SortMethodAnoynmousClass1
{
	public static void main(String[] args) 
	{
		List<Product> p = new ArrayList<>();

		p.add(new Product(12,"Laptop", 90999.99));
        p.add(new Product(89,"Smartphone", 64599.99));
        p.add(new Product(2,"Headphones", 1249.99));
        p.add(new Product(34,"Tablet", 8399.99));

		System.out.println("Before sorting: ");

		Iterator<Product> itr = p.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

		//Sort Method Using Lamda Expression
		//p.sort((p1,p2) -> Double.compare(p1.getPrice(),p2.getPrice()));
		
		//you can also use collections class 
		Collections.sort(p,(p1,p2) -> Double.compare(p1.getPrice(),p2.getPrice()));

		System.out.println("After sorting:");
		Iterator<Product> ob = p.iterator();
		while(ob.hasNext())
		{
			System.out.println(ob.next());
		}
	}
}
