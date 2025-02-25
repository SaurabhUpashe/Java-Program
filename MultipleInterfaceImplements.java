interface Demo
{
	void show();
	void output();
}
interface Example extends Demo
{
	void getter();
}
interface Geet extends Example
{
	void yellow();
}
class Test
{
	public void out()
	{
		System.out.println("In Test Out()");
	}
}
class Multi extends Test implements Geet
{
	public void getter()
	{
		System.out.println("In Multi getter()");
	}
	public void show()
	{
		System.out.println("In Multi show()");
	}
	public void output()
	{
		System.out.println("In Multi output()");
	}
	public void yellow()
	{
		System.out.println("In Multi yellow()");
	}
}
class MultipleInterfaceImplements
{
	public static void main(String[] args) 
	{
		Multi ob = new Multi();
		ob.out();
		ob.show();
		ob.getter();
		ob.output();
		ob.yellow();
	}
}
