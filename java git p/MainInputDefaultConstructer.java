import java.util.*;
class InputDefaultConstructer
{
	private int x;
	private double y;

	public InputDefaultConstructer()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the X value: ");
		x=sc.nextInt();
		System.out.println("Enter the Y value: ");
		y=sc.nextDouble();
	}
	public void Display()
	{
		System.out.println("x value: "+x+"\t y value: "+y);
	}

}
class MainInputDefaultConstructer 
{
	public static void main(String[] args) 
	{
			InputDefaultConstructer Id=new InputDefaultConstructer();
			Id.Display();

			InputDefaultConstructer Id1=new InputDefaultConstructer();
			Id1.Display();

	}
}
