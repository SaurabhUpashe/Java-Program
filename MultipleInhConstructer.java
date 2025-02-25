class Base
{
	private int x;
	public Base()
	{
		x=10;
		System.out.println("In Base Class-Default Constructer: ");
	}
	public Base(int a)
	{
		x=a;
		System.out.println("In Base Class-para Constructer: ");
	}
	public void out()
	{
		System.out.println("X is: "+x);
	}
}
class Imd extends Base
{
	private double y;
	public Imd()
	{
		y=25.23;
		System.out.println("In Imd Class-Default Constructer: ");
	}
	public Imd(int a,double b)
	{
		super(a);
		System.out.println("In Imd Class-para Constructer: ");
		y=b;
	}
	public void output()
	{
		out();
		System.out.println("Y is: "+y);
	}

}
class Child extends Imd
{
	private String nm;
	public Child()
	{
		nm="Saurabh";
		System.out.println("In child Class-Default Constructer: ");
	}
	public Child(int a,double b,String c)
	{
		super(a,b);
		System.out.println("In child Class-para Constructer: ");
		nm=c;
	}
	public void getter()
	{
		output();
		System.out.println("Name: "+nm);
	}
}
class MultipleInhConstructer 
{
	public static void main(String[] args) 
	{
		Child ob = new Child();
		ob.getter();

		Child ob1 = new Child(100,99.98,"Sayali");
		ob1.getter();
	}
}
