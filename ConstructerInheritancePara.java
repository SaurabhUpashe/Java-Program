class Base
{
	private int x;
	public Base()
	{
		System.out.println(" Default Constructer Parents: ");
		x=10;
	}
	public Base(int a)
	{
		System.out.println(" para Constructer Parents: ");
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
		System.out.println(" Default Constructer Child");
		y=20;
	}
	public Derived(int a)
	{
		System.out.println(" para Constructer child-1: ");
		y=a;
	}
	public Derived(int a, int b)
	{
		super(b);
		System.out.println(" para Constructer child-2: ");
		y=b;

	}
	public void display()
	{
		System.out.println(" Y is: "+y);
	}
}
class  ConstructerInheritancePara
{
	public static void main(String[] args) 
	{
		Base bob = new Base();
		bob.display();
		
		System.out.println("------------------");

		Derived ob = new Derived();
		ob.display();

		System.out.println("------------------");

		Derived ob1 = new Derived(100);
		ob1.display();

		System.out.println("------------------");
		
		Derived ob2 = new Derived(200,500);
		ob2.display();


		
	}
}

