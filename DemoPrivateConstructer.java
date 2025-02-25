class Demo
{
	private Demo()
	{
		System.out.println("Default Constructer: ");
	}
}
class DemoPrivateConstructer 
{
	public static void main(String[] args) 
	{
		Demo ob = new Demo();
		System.out.println("Hello World!");
	}
}
