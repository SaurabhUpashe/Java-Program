class Outer
{
	private int x;
	private static int var_out;
	static class Inner
	{
		private int y;
		private int var_in;
		public void in()
		{
			y=200;
		}
		public void out()
		{
			System.out.println("Inner Y is: "+y);
			System.out.println("inner Static verible: "+var_out);
		}
	}
	public void input()
	{
		x=100;
	}
	public void output()
	{
		System.out.println("Outer x is: "+x);
		System.out.println("inner Static verible: "+Innervar_in);
	}
}
class MainStaticNestedClass 
{
	public static void main(String[] args) 
	{
		Outer ob = new Outer();
		ob.input();
		ob.output();

		Outer.Inner s = new Outer.Inner();
		s.in();
		s.out();
		
	}
}
