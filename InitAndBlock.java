class A
{
	{
		System.out.println("Initializer Block-A");
	}
	A()
	{
		System.out.println("Constructer-A");
	}
}
class B extends A
{
	//{
		//System.out.println("Initializer Block-B");
	//}
	B()
	{
		System.out.println("Constructer-B");
	}
}
class C extends B
{
	{
		System.out.println("Initializer Block-C");
	}
	//C()
	//{
		//System.out.println("Constructer-C");
	//}
}
class  InitAndBlock
{
	public static void main(String[] args) 
	{
		C ob = new C();
	}
}
