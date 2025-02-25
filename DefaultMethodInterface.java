interface MyInterface
{
	void show();
	default void message()
	{
		System.out.println("In the Deafult method: ");
	}
}
class MyClass implements MyInterface
{
	public void show()
	{
		System.out.println("In the Show()-Myclass");
	}
	public void message()
	{
		System.out.println("In the Default Method-MyClass");
	}
}
class YourClass implements MyInterface
{
	public void show()
	{
		System.out.println("In the Show()-Yourclass");
	}
	public void message()
	{
		System.out.println("In the Default Method-YourClass");
	}
}
class DefaultMethodInterface
{
	public static void main(String[] args) 
	{
		YourClass ob = new YourClass();
		ob.show();
		ob.message();

		MyClass ob1 = new MyClass();
		ob1.show();
		ob1.message();
	}
}
