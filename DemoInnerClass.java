class Outer
{
	private int x=10;
	static private double y=56.23;
	void show()
	{
		System.out.println("Inside the outside class");
	}
	class Inner
	{
		void display()
		{
			show();
			System.out.println("Inside the Inner class");
			System.out.println(" x:  "+x);
			System.out.println(" Y:  "+y);
			
		}
	}
}
class DemoInnerClass
{
	public static void main(String[] args) 
	{
		Outer out = new Outer();
		Outer.Inner in = out.new Inner();
		in.display();
	}
}
