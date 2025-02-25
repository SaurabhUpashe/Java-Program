import java.util.Scanner;
class Item
{
	private int id;
	private double ipr;
	private static double tot=200;
	public void setIn()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Item Id: ");
		id=sc.nextInt();

		System.out.println("Enter the Item price: ");
		ipr=sc.nextInt();

		tot=tot+ipr;
	}
	public void showOut()
	{
		System.out.println("Item Id: "+id+"\t Item Price: "+ipr);
	}
	public static void getTotalBill()
	{
		System.out.println("Total Bill: "+tot);
	}
}
class  ItemClass
{
	public static void main(String[] args) 
	{
		
		Item.getTotalBill();
		Item []list = new Item[5];

		System.out.println("Enter the "+list.length+" Iteam Details");
		for(int i=0;i<list.length;i++)
		{
			list[i] = new Item();
			list[i].setIn();
		}

		System.out.println("Iteam Details");
		for(int i=0;i<list.length;i++)
		{
			list[i].showOut();
		}
		
		Item.getTotalBill();

		list[4].getTotalBill();

	}
}
