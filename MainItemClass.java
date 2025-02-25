import java.util.Scanner;
class Item
{
	private int icode;
	private double iprice;
	public void setData()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Item Code: ");
		icode=sc.nextInt();

		System.out.println("Enter the Item Price: ");
		iprice=sc.nextDouble();
	}
	public void showData()
	{
		System.out.println("\n Item Code: "+icode+"\t Item Price: "+iprice);
	}
}
class  MainItemClass
{
	public static void main(String[] args) 
	{
		Item []list = new Item[5];

		System.out.println("Enter the "+list.length+" Item Details: ");
		for(int i=0;i<list.length;i++)
		{
			list[i]=new Item();
			list[i].setData();
		}

		System.out.println("\n Item Details: ");
		for(int i=0;i<list.length;i++)
		{
			list[i].showData();
		}
	}
}
