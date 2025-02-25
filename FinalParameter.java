class Demo
{
	private int x;
	public void in(final int t)
	{
		t=500;
		x=t;
	}
	public void out()
	{
		System.out.println("X is: "+x);
	}
}
class  FinalParameter
{
	public static void main(String[] args) 
	{
		Demo ob = new Demo();
		ob.in(100);
		ob.out();
	}
}
