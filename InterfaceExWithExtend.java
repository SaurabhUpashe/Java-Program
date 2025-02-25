interface Demo
{
	void show();
	void display();
}
class Test
{
	public void showTest()
	{
		System.out.println("In Test showTest()");
	}
}
class Sample extends Test implements Demo
{
	public void show()
	{
		System.out.println("In Sample show()");
	}
	public void display()
	{
		System.out.println("In Sample display()");
	}
	
}
class  InterfaceExWithExtend
{
	public static void main(String[] args) 
	{
		Sample ob = new Sample();
		ob.show();
		ob.display();
		ob.showTest();
	}
}
