class Base
{
	private int x;
	public Base(int a)
	{
		System.out.println(" Default Constructer Parents: ");
		x=a;
	}
	public void display()
	{
		System.out.println("X is: "+x);
	}
}
class Derived extends Base
{
	private int y;
	public Derived()
	{
		super();// he is impilicity here due to parent class Constructer is executed first:
		super.display();
		System.out.println(" Default Constructer Child");
		y=100;
	}
	public void display()
	{
		System.out.println(" Y is: "+y);
	}
}
class  ConstructerInheritance
{
	public static void main(String[] args) 
	{
		Base bob = new Base(500);
		bob.display();
		
		System.out.println("================");
		Derived ob = new Derived();
		ob.display();
		
	}
}
