class MyMath
{
	private int a;
	private int b;
	private int c;
	public void input(int x , int y)
	{
		a=x;
		b=y;
	}
	public void output()throws ArithmeticException
	{
		c=a/b;
		System.out.println("C is: "+c);
	}
}
class  UsingThrowsKeyword
{
	public static void main(String[] args) 
	{
		MyMath ob = new MyMath();
		ob.input(25,0);
		//ob.output();
		try
		{
			ob.output();
		}
		catch (Exception e)
		{
			System.out.println("Exception in Main Class");
		}
		

	}
}
