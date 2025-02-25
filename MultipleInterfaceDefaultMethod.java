interface Demo
{
	void show();
	default void defaultmsg()
	{
		System.out.println("In the Demo -Defaultmsg()");
	}
}
interface Test
{
	void display();
	default void defaultmsg()
	{
		System.out.println("In the Test -Defaultmsg()");
	}
}
class Common implements Test, Demo
{
	public void show()
	{
		System.out.println("In the Common Show()");
	}
	public void display()
	{
		System.out.println("In the Common display()");
	}
	public void defaultmsg()
	{
		Demo.super.defaultmsg();
		Test.super.defaultmsg();
	}
    void getter()
	{
		System.out.println("In the Common getter()");
	}
}
class  MultipleInterfaceDefaultMethod
{
	public static void main(String[] args) 
	{
		Common ob = new Common();
		ob.show();
		ob.display();
		ob.defaultmsg();
		ob.getter();
	}
}
