class DefaultConstructer
{
	private int x;
	private double y;
	public DefaultConstructer()
	{
		x=20;
		y=85.69;
		System.out.println("Default constructer");
		System.out.println("X: "+x);
		System.out.println("y: "+y);
	}
}
class  MainDefault
{
	public static void main(String[] args) 
	{
		DefaultConstructer ob = new DefaultConstructer();

		DefaultConstructer ob1 = new DefaultConstructer();
		DefaultConstructer ob2 = new DefaultConstructer();

	}
}
