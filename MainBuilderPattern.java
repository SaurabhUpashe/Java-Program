class Product
{
	private String name;
	private double price;
	private String category;
	private Product(Builder builder)
	{
		this.name=builder.name;
		this.price=builder.price;
		this.category = builder.category;
	}
	public static class Builder
	{
		private String name="Default";
		private double price=0.0;
		private String category = "Default Argument";
		public String setName(String name)
		{
			this.name=name;
			return name;
		}
		public double setPrice(double price)
		{
			this.price=price;
			return price;
		}
		public String setCategory(String category)
		{
			this.category=category;
			return category;
		}
		public Product build()
		{
			return new Product(this);
		}
	}
	public String toString()
	{
		return "Product : Name:"+name+"\t Price: "+price+"\t Category: "+category+" ";
	}
}
class MainBuilderPattern 
{
	public static void main(String[] args) 
	{
		Product ob = new Product.Builder().build();
		Product ob1 = new Product.Builder().setName("Laptop").setPrice(998.99).build();

		System.out.println(ob);
		System.out.println(ob1);

	}
}
