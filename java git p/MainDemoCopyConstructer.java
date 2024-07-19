import java.util.*;
class DemoCopyConstructer
{
	private int x;
	private double y;
	public DemoCopyConstructer()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Value of X ");
		x=sc.nextInt();
		System.out.println("Enter the Value of y ");
		y=sc.nextDouble();
	}
	public DemoCopyConstructer(DemoCopyConstructer t)
	{
		x=t.x;
		y=t.y;
	}
	public void show()
	{
		System.out.println("Value of X: "+x+"Value of y: "+y);
	}
}
class MainDemoCopyConstructer
{
	public static void main(String[] args) 
	{
		DemoCopyConstructer d=new DemoCopyConstructer();
		d.show();
		
		DemoCopyConstructer d1=new DemoCopyConstructer(d);
		d.show();
	}
}
