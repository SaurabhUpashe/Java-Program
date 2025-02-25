class Product
{
	private int id;
	private String name;
	private double price;
	private Product(int id ,String name, double price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
	public static Product creatInstance(int id, String name, double price)
	{
		return new Product(id,name,price);
	}
	public String toString()
	{
		return "Product: [ Id: "+id+"\t Name: "+name+"\t Price: "+price+" ]";
	}
}
class DemoFactoryPattern 
{
	public static void main(String[] args) 
	{
		Product ob = Product.creatInstance(11,"Pen",91.23);
		System.out.println(ob);
	}
}
