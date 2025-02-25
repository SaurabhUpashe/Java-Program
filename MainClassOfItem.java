import java.io.InputStreamReader;
import java.io.BufferedReader;
class Item
{
	private int id;
	private double price;
	public void input()
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		try
		{
			System.out.println("Enter the Item Id: ");
			id=Integer.parseInt(br.readLine());

			System.out.println("Enter the Item price: ");
			price=Double.parseDouble(br.readLine());
		}
		catch (Exception e)
		{
			System.out.println("Exception is Occure !! I am handle this exception: ");
		}
		
	}
	public void output()
	{
		System.out.println("Item Id: "+id+"\t Item price: "+price);
	}
	public double getPrice()
	{
		return price;
	}
}
class  MainClassOfItem
{
	public static void main(String[] args) 
	{
		Item []s =new Item[3];
		double tot=0.0;

		System.out.println("Enter the "+s.length+" Item Details: ");
		for(int i=0;i<s.length;i++)
		{
			s[i]=new Item();
			s[i].input();
		}

		System.out.println("Item Details: ");
		for(int i=0;i<s.length;i++)
		{
			s[i].output();
			tot=tot+s[i].getPrice();
		}

		System.out.println("Total Bill : "+tot);
	}

}
