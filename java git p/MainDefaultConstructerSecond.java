
class paraConstructer
{
	private int x;
	private double y;
	public paraConstructer(int )
	{
		System.out.println("Its is default constructer");
		x=1;
		y=10.23;
	}
	public void output()
	{
		System.out.println(" value of X: "+x+"\t value of Y: "+y);
	}
}
class MainDefaultConstructerSecond 
{
	public static void main(String[] args) 
	{
		DefaultConstructerSecond d=new DefaultConstructerSecond ();
		d.output();

		DefaultConstructerSecond d1=new DefaultConstructerSecond ();
		d1.output();

		DefaultConstructerSecond d2=new DefaultConstructerSecond ();
		d2.output();

		DefaultConstructerSecond d3=new DefaultConstructerSecond ();
		d3.output();

	}
}
