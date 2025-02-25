class Demo
{
	private int x;
	private int y;
	public void in()
	{
		x=5;
		y=0;
	}
	public void out()
	{
		int z=0;
		
		try
		{
			z=x/y;
		}
		catch (NullPointerException e)
		{
			System.out.println("Exception in Demo Class");
		}
		System.out.println("Z : "+z);
	}
}
class  HandlingAnotherClassException
{
	public static void main(String[] args) 
	{
		Demo ob = new Demo();
		ob.in();
		try{ ob.out(); }catch(Exception e){ System.out.println("Exception in Main Class"); }
	}
}
